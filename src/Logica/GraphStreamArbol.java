/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;

public class GraphStreamArbol {
    private Graph graph;

    public GraphStreamArbol(String nombreGrafo) {
        graph = new SingleGraph(nombreGrafo);
    }

    public void construir(ArbolDicotomico arbol) {
        if (arbol == null || arbol.estaVacio()) {
            System.out.println("El arbol esta vacio o es nulo, no se construira el grafo.");
            return;
        }
        NodoArbol raiz = arbol.getRaiz();
        generarGrafo(raiz, null, false);
    }

    public void mostrar() {
        // Antes de invocar display(), establecemos la propiedad de renderer
        System.setProperty("org.graphstream.ui.renderer",
                           "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        graph.display();
    }

    private void generarGrafo(NodoArbol nodo, String parentId, boolean esSi) {
        if (nodo == null) return;

        String nodoId = Integer.toHexString(System.identityHashCode(nodo));
        if (graph.getNode(nodoId) == null) {
            Node gNode = graph.addNode(nodoId);
            if (nodo.especie != null) {
                gNode.setAttribute("ui.label", nodo.especie);
            } else {
                gNode.setAttribute("ui.label", nodo.pregunta);
            }
        }

        if (parentId != null) {
            String edgeId = parentId + "->" + nodoId;
            if (graph.getEdge(edgeId) == null) {
                Edge e = graph.addEdge(edgeId, parentId, nodoId, true);
                e.setAttribute("ui.label", esSi ? "SI" : "NO");
            }
        }

        generarGrafo(nodo.respuestaSi, nodoId, true);
        generarGrafo(nodo.respuestaNo, nodoId, false);
    }
}


