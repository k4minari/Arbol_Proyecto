/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

import Logica.NodoArbol;

/**
 *
 * @author cesar
 * Clase auxiliar que vincula un NodoArbol con un identificador (String) en GraphStream.
 */
public class NodoIdPair {
    
    /**
     * Referencia al nodo en el arbol.
     */
    private NodoArbol nodo;
    
    /**
     * Identificador unico en formato String (por ejemplo, en GraphStream).
     */
    private String id;

    /**
     * Constructor que inicializa los atributos del par (nodo, id).
     * @param nodo El nodo del arbol (NodoArbol).
     * @param id   El identificador en formato String.
     */
    public NodoIdPair(NodoArbol nodo, String id) {
        this.nodo = nodo;
        this.id = id;
    }

    /**
     * Obtiene la referencia al nodo del arbol.
     * @return El objeto NodoArbol de este par.
     */
    public NodoArbol getNodo() {
        return nodo;
    }

    /**
     * Asigna la referencia al nodo del arbol.
     * @param nodo El nuevo nodo a almacenar.
     */
    public void setNodo(NodoArbol nodo) {
        this.nodo = nodo;
    }

    /**
     * Obtiene el identificador unico.
     * @return La cadena de texto (String) que identifica el nodo en el grafo.
     */
    public String getId() {
        return id;
    }

    /**
     * Asigna el identificador unico.
     * @param id La nueva cadena de texto para identificar el nodo.
     */
    public void setId(String id) {
        this.id = id;
    }
}
