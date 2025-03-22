/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import EDDauxiliares.NodoIdPair;
import EDDauxiliares.Step;
import EDDauxiliares.StepList;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

/**
 * Clase que construye y muestra un ArbolDicotomico en GraphStream
 */
public class GraphStreamArbol {

    /**
     * Grafo de GraphStream donde se visualizará el arbol.
     */
    private Graph graph;

    /**
     * Arreglo que almacena pares (NodoArbol, String id).
     */
    private NodoIdPair[] nodoIds;

    /**
     * Cantidad actual de pares almacenados en nodoIds.
     */
    private int size;

    /**
     * Capacidad del arreglo nodoIds.
     */
    private int capacity;

    /**
     * Raíz del arbol, la usaremos para posicionar manualmente la vista.
     */
    private NodoArbol raiz;

    /**
     * Constructor: inicializa el grafo y el array dinámico para manejar los pares (nodo, id).
     * 
     * @param nombreGrafo Nombre que se le dará internamente al grafo GraphStream.
     */
    public GraphStreamArbol(String nombreGrafo) {
        // Creamos el grafo con el nombre
        graph = new SingleGraph(nombreGrafo);

        // Iniciamos el array "casero"
        capacity = 100;
        nodoIds = new NodoIdPair[capacity];
        size = 0;

        raiz = null;  // la raíz se asignará cuando construyamos el arbol
        aplicarEstilos();
    }

    /**
     * Construye el grafo a partir de un ArbolDicotomico.
     * Genera de forma recursiva los nodos y las aristas.
     * 
     * @param arbol El ArbolDicotomico del cual extraeremos la estructura.
     */
    public void construir(ArbolDicotomico arbol) {
        if (arbol == null || arbol.estaVacio()) {
            JOptionPane.showMessageDialog(null, "El arbol esta vacio o nulo, no se construira el grafo.");
            return;
        }
        // Obtenemos la raiz
        raiz = arbol.getRaiz();
        // Generamos las ramas
        generarGrafo(raiz, null, false);
    }

    /**
     * Muestra el grafo en pantalla con un layout manual.
     * Posiciona la raiz en (0,0) y expande el arbol hacia abajo.
     * Ademas, evita que cerrar la ventana termine la aplicacion completa.
     */
    public void mostrar() {
        // Desactivamos layout automático
        System.setProperty("org.graphstream.ui", "swing");
        System.setProperty("org.graphstream.ui.renderer","org.graphstream.ui.j2dviewer.J2DGraphRenderer");

        // Capturamos el Viewer para controlar la politica de cierre
        Viewer viewer = graph.display(false);
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

        if (raiz != null) {
            // Ajusta la separacion horizontal y vertical si es necesario
            posicionarNodos(raiz, 0, 0, 450);
        }
    }

    /**
     * Genera (de forma recursiva) los nodos y aristas de GraphStream
     * a partir de la estructura del ArbolDicotomico.
     * 
     * @param nodo     NodoArbol actual (o subraiz)
     * @param parentId Identificador del padre en el grafo (null si es la raiz)
     * @param esSi     Indica si la rama es "SI" (true) o "NO" (false)
     */
    private void generarGrafo(NodoArbol nodo, String parentId, boolean esSi) {
        if (nodo == null) return;

        // ID unico en base a la referencia del objeto
        String nodoId = crearIdUnico(nodo);

        // Si aun no existe un nodo en el grafo con este id, lo creamos
        if (graph.getNode(nodoId) == null) {
            putPair(nodo, nodoId);

            Node gNode = graph.addNode(nodoId);

            // Distinguimos entre hoja (especie) y nodo intermedio/raiz (pregunta)
            if (nodo.getEspecie() != null) {
                gNode.setAttribute("ui.label", nodo.getEspecie());
                gNode.setAttribute("ui.class", "leaf");
            } else {
                gNode.setAttribute("ui.label", nodo.getPregunta());
                // "root" si parentId == null, sino "internal"
                gNode.setAttribute("ui.class", (parentId == null) ? "root" : "internal");
            }
        }

        // Conectamos este nodo con el padre si no es la raiz
        if (parentId != null) {
            String edgeId = parentId + "->" + nodoId;
            if (graph.getEdge(edgeId) == null) {
                Edge e = graph.addEdge(edgeId, parentId, nodoId, true);
                e.setAttribute("ui.label", esSi ? "SI" : "NO");
            }
        }

        // Recursivo para rama SI y NO
        generarGrafo(nodo.getRespuestaSi(), nodoId, true);
        generarGrafo(nodo.getRespuestaNo(), nodoId, false);
    }

    /**
     * Asigna posicion (x, y) a cada nodo para dibujar
     * un arbol de arriba hacia abajo.
     * 
     * @param nodo Nodo actual (o subraiz) del arbol
     * @param x    Coordenada horizontal
     * @param y    Coordenada vertical
     * @param dx   Separacion horizontal para las ramas
     */
    private void posicionarNodos(NodoArbol nodo, double x, double y, double dx) {
        if (nodo == null) return;

        String id = getId(nodo);
        if (id != null) {
            Node gNode = graph.getNode(id);
            // z=0 para 2D
            gNode.setAttribute("xyz", x, y, 0);
        }

        // Bajamos en vertical +140
        double newY = y + 140;
        // Reducimos dx en un factor para que no se expandan indefinidamente
        double newDx = dx / 1.5;

        // Rama SI a la izquierda
        if (nodo.getRespuestaSi() != null) {
            posicionarNodos(nodo.getRespuestaSi(), x - newDx, newY, newDx);
        }
        // Rama NO a la derecha
        if (nodo.getRespuestaNo() != null) {
            posicionarNodos(nodo.getRespuestaNo(), x + newDx, newY, newDx);
        }
    }

    /**
     * Inserta un par (nodo, id) en el array de pares, expandiendo si es necesario.
     * @param nodo NodoArbol que queremos mapear
     * @param id   Identificador (String) del nodo en el grafo
     */
    private void putPair(NodoArbol nodo, String id) {
        if (size == capacity) {
            expandArray();
        }
        nodoIds[size] = new NodoIdPair(nodo, id);
        size++;
    }

    /**
     * Duplica la capacidad del array cuando esta lleno.
     */
    private void expandArray() {
        capacity *= 2;
        NodoIdPair[] nuevo = new NodoIdPair[capacity];
        for (int i = 0; i < size; i++) {
            nuevo[i] = nodoIds[i];
        }
        nodoIds = nuevo;
    }

    /**
     * Retorna el id asociado a un NodoArbol mediante una busqueda lineal en el array.
     * @param nodo NodoArbol a buscar
     * @return El identificador String si se encuentra, o null en caso contrario.
     */
    private String getId(NodoArbol nodo) {
        for (int i = 0; i < size; i++) {
            if (nodoIds[i].getNodo() == nodo) {
                return nodoIds[i].getId();
            }
        }
        return null;
    }

    /**
     * Genera un id unico en hexadecimal segun la referencia de memoria del NodoArbol.
     * @param nodo NodoArbol para el cual generamos el id
     * @return String con el id en hex.
     */
    private String crearIdUnico(NodoArbol nodo) {
        return Integer.toHexString(System.identityHashCode(nodo));
    }

    /**
     * Aplica la hoja de estilos (CSS) para personalizar nodos y aristas de GraphStream.
     */
    private void aplicarEstilos() {
        String styleSheet =
            "graph { fill-color: white; }" +
            "node {" +
            "   shape: box;" +
            "   size: 60px, 40px;" +
            "   text-size: 14;" +
            "   text-color: black;" +
            "   text-style: bold;" +
            "   stroke-mode: plain;" +
            "   stroke-color: black;" +
            "   stroke-width: 1px;" +
            "}" +
            "node.root {" +
            "   fill-color: #FFA500;" +
            "}" +
            "node.internal {" +
            "   fill-color: #EED5B7;" +
            "}" +
            "node.leaf {" +
            "   fill-color: #ADFFB4;" +
            "   text-size: 16;" +
            "}" +
            "edge {" +
            "   fill-color: black;" +
            "   size: 2px;" +
            "   text-size: 14;" +
            "   text-color: black;" +
            "   text-background-mode: plain;" +
            "   text-background-color: white;" +
            "   text-padding: 3px, 2px;" +
            "   text-offset: 10px, -5px;" +
            "}";

        graph.setAttribute("ui.stylesheet", styleSheet);
    }
    /**
 * Muestra un nuevo grafo que representa únicamente el recorrido
 * parcial o completo realizado sobre el árbol, siguiendo los pasos dados.
 * No modifica el grafo original ni la estructura principal.
 *
 * @param raiz      Raíz del árbol original.
 * @param recorrido Lista parcial de pasos (pregunta + respuesta).
 */
    public void mostrarRecorridoDesdeRaiz(NodoArbol raiz, StepList recorrido) {
    Graph subGraph = new SingleGraph("Recorrido");
    System.setProperty("org.graphstream.ui", "swing");
    System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

    subGraph.setAttribute("ui.stylesheet", graph.getAttribute("ui.stylesheet"));

    NodoArbol actual = raiz;
    String nodoIdPadre = Integer.toHexString(System.identityHashCode(actual));
    subGraph.addNode(nodoIdPadre).setAttribute("ui.label", actual.getPregunta());
    subGraph.getNode(nodoIdPadre).setAttribute("ui.class", "root");
    subGraph.getNode(nodoIdPadre).setAttribute("xyz", 0, 0, 0);

    double x = 0, y = 0;
    double dx = 150;  // separación horizontal reducida
    double dy = 100;  // separación vertical reducida

    for (int i = 0; i < recorrido.length(); i++) {
        Step paso = recorrido.get(i);
        boolean respuesta = paso.isRespuesta();

        NodoArbol siguiente = respuesta ? actual.getRespuestaSi() : actual.getRespuestaNo();
        if (siguiente == null) break;

        String nodoId = Integer.toHexString(System.identityHashCode(siguiente));
        Node gNode = subGraph.addNode(nodoId);

        if (siguiente.getEspecie() != null) {
            gNode.setAttribute("ui.label", siguiente.getEspecie());
            gNode.setAttribute("ui.class", "leaf");
        } else {
            gNode.setAttribute("ui.label", siguiente.getPregunta());
            gNode.setAttribute("ui.class", "internal");
        }

        String edgeId = nodoIdPadre + "->" + nodoId;
        Edge e = subGraph.addEdge(edgeId, nodoIdPadre, nodoId, true);
        e.setAttribute("ui.label", respuesta ? "SI" : "NO");

        x += respuesta ? -dx : dx;
        y += dy;
        gNode.setAttribute("xyz", x, y, 0);

        actual = siguiente;
        nodoIdPadre = nodoId;
    }

    org.graphstream.ui.view.Viewer viewer = subGraph.display(false);
    viewer.setCloseFramePolicy(org.graphstream.ui.view.Viewer.CloseFramePolicy.HIDE_ONLY);
}

    /**
     * Obtiene la raiz del arbol que se esta graficando.
     * @return NodoArbol raiz.
     */
    public NodoArbol getRaiz() {
        return raiz;
    }

    /**
     * Asigna la raiz del arbol (por si deseas cambiarla).
     * @param raiz Nuevo nodo raiz.
     */
    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    /**
     * Obtiene la capacidad actual del array de pares.
     * @return La capacidad (entero).
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Obtiene el número actual de pares almacenados (size).
     * @return El tamaño actual (entero).
     */
    public int getSize() {
        return size;
    }

    /**
     * Retorna el objeto Graph interno, en caso de necesitar manipularlo externamente.
     * @return El grafo de GraphStream.
     */
    public Graph getGraph() {
        return graph;
    }
}
