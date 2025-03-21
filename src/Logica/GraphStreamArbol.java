/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import EDDauxiliares.NodoIdPair;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;
import org.graphstream.graph.implementations.SingleGraph;

/**
 * Clase que construye y muestra un ArbolDicotomico en GraphStream,
 * sin usar colecciones de java.util.* para almacenar las parejas (nodo, id).
 */
public class GraphStreamArbol {
    private Graph graph;
    
    // Almacenaremos (NodoArbol, idString) en un array propio:
    private NodoIdPair[] nodoIds; 
    private int size;       // cantidad actual de pares almacenados
    private int capacity;   // capacidad del array nodoIds

    // Guardamos la raíz del árbol para ubicarla manualmente.
    private NodoArbol raiz;


    /**
     * Constructor: inicializa el grafo y el array dinámico.
     * @param nombreGrafo Nombre que se le dará internamente al grafo GraphStream.
     */
    public GraphStreamArbol(String nombreGrafo) {
        graph = new SingleGraph(nombreGrafo);

        // Inicializamos nuestro array “casero” de 100 pares inicialmente.
        capacity = 100;
        nodoIds = new NodoIdPair[capacity];
        size = 0;

        raiz = null;  // aún no definimos la raíz
        aplicarEstilos();
    }

    /**
     * Construye el grafo a partir de un ArbolDicotomico.
     * @param arbol El ArbolDicotomico del cual tomar datos.
     */
    public void construir(ArbolDicotomico arbol) {
        if (arbol == null || arbol.estaVacio()) {
            System.out.println("El arbol esta vacio o nulo, no se construira el grafo.");
            return;
        }
        // Obtenemos la raiz del arbol y la guardamos
        raiz = arbol.getRaiz();

        // Generamos recursivamente nodos y aristas
        generarGrafo(raiz, null, false);
    }

    /**
     * Muestra el grafo en pantalla con layout manual (sin autolayout).
     * Ubica la raiz en (0,0) y expande hacia abajo.
     */
    public void mostrar() {
        // Desactivamos el layout automático
        System.setProperty("org.graphstream.ui", "swing");
        System.setProperty("org.graphstream.ui.renderer","org.graphstream.ui.j2dviewer.J2DGraphRenderer");

        // La llamada con 'false' deshabilita el layout por defecto
        graph.display(false);

        // Asignamos posiciones manuales si la raiz no es nula
        if (raiz != null) {
            // Aumentamos la separación horizontal a 450
            // y la vertical la mantenemos en 140 dentro del método
            posicionarNodos(raiz, 0, 0, 450);
        }
    }

    /**
     * Genera nodos y aristas (recursivo).
     * @param nodo     NodoArbol actual
     * @param parentId ID del padre en el grafo (null si es la raiz)
     * @param esSi     Indica si la rama es "SI" (true) o "NO" (false)
     */
    private void generarGrafo(NodoArbol nodo, String parentId, boolean esSi) {
        if (nodo == null) return;

        // Creamos un ID unico en base a la referencia del objeto
        String nodoId = crearIdUnico(nodo);

        // Si el nodo no existe en el grafo, lo añadimos
        if (graph.getNode(nodoId) == null) {
            // Almacenamos (nodo, nodoId) en nuestro array
            putPair(nodo, nodoId);

            // Creamos el nodo en GraphStream
            Node gNode = graph.addNode(nodoId);

            // Distinguimos hoja (especie) de nodo intermedio/raiz (pregunta)
            if (nodo.especie != null) {
                gNode.setAttribute("ui.label", nodo.especie);
                gNode.setAttribute("ui.class", "leaf");
            } else {
                gNode.setAttribute("ui.label", nodo.pregunta);
                // Si no tiene parentId => es la raiz => class root
                gNode.setAttribute("ui.class", (parentId == null) ? "root" : "internal");
            }
        }

        // Conectamos la arista con el padre
        if (parentId != null) {
            String edgeId = parentId + "->" + nodoId;
            if (graph.getEdge(edgeId) == null) {
                Edge e = graph.addEdge(edgeId, parentId, nodoId, true);
                e.setAttribute("ui.label", esSi ? "SI" : "NO");
            }
        }

        // Llamada recursiva para rama SI
        generarGrafo(nodo.respuestaSi, nodoId, true);
        // Llamada recursiva para rama NO
        generarGrafo(nodo.respuestaNo, nodoId, false);
    }

    /**
     * Asigna posición (x,y) a cada nodo para crear un arbol
     * vertical (la raiz arriba, hojas abajo).
     * @param nodo Nodo actual
     * @param x    coordenada horizontal
     * @param y    coordenada vertical
     * @param dx   separación horizontal para las ramas hijas
     */
    private void posicionarNodos(NodoArbol nodo, double x, double y, double dx) {
        if (nodo == null) return;

        // Obtenemos el id con nuestro array
        String id = getId(nodo);
        if (id != null) {
            Node gNode = graph.getNode(id);
            // set xyz => la z=0 (2D)
            gNode.setAttribute("xyz", x, y, 0);
        }

        // Bajamos el nivel vertical (más abajo => mayor Y)
        double newY = y + 140;  // vertical separation
        // Reducimos dx levemente para que no se superpongan
        double newDx = dx / 1.5;

        // Rama SI a la izquierda
        if (nodo.respuestaSi != null) {
            posicionarNodos(nodo.respuestaSi, x - newDx, newY, newDx);
        }
        // Rama NO a la derecha
        if (nodo.respuestaNo != null) {
            posicionarNodos(nodo.respuestaNo, x + newDx, newY, newDx);
        }
    }

    // ------------------------------------------------
    // Métodos para manejar nuestro array de pares (nodo, id)
    // ------------------------------------------------

    /**
     * Inserta un par (nodo, id) en el array, expandiendo si es necesario.
     */
    private void putPair(NodoArbol nodo, String id) {
        if (size == capacity) {
            expandArray();
        }
        nodoIds[size] = new NodoIdPair(nodo, id);
        size++;
    }

    /**
     * Expande la capacidad del array al doble.
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
     * Busca el id asociado a un nodo (búsqueda lineal en nuestro array).
     */
    private String getId(NodoArbol nodo) {
        for (int i = 0; i < size; i++) {
            if (nodoIds[i].nodo == nodo) {
                return nodoIds[i].id;
            }
        }
        return null; // no encontrado
    }

    // ------------------------------------------------
    // Otros Métodos Auxiliares
    // ------------------------------------------------

    /**
     * Genera un ID unico en hexadecimal a partir de la referencia de un NodoArbol.
     */
    private String crearIdUnico(NodoArbol nodo) {
        return Integer.toHexString(System.identityHashCode(nodo));
    }

    /**
     * Define una hoja de estilo (CSS) para personalizar nodos y aristas.
     */
    private void aplicarEstilos() {
        String styleSheet =
            "graph { fill-color: white; }" +

            "node {" +
            "   shape: box;" +              // Recuadro. Usa 'rounded-box' o 'ellipse' si quieres otra forma.
            "   size: 60px, 40px;" +
            "   text-size: 14;" +           // Texto base
            "   text-color: black;" +
            "   text-style: bold;" +
            "   stroke-mode: plain;" +
            "   stroke-color: black;" +
            "   stroke-width: 1px;" +
            "}" +
            // Raiz (root) en naranja
            "node.root {" +
            "   fill-color: #FFA500;" +
            "}" +
            // Internos (internal) en marron clarito
            "node.internal {" +
            "   fill-color: #EED5B7;" +
            "}" +
            // Hojas (leaf) en verde claro y texto un poco más grande
            "node.leaf {" +
            "   fill-color: #ADFFB4;" +
            "   text-size: 16;" +
            "}" +
            // Estilos de las aristas
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
}




