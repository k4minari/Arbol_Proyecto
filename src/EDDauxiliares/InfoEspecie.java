/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

import Logica.NodoArbol;

/**
 *
 * @author cesar
 * Clase que encapsula la informacion de una especie, guardando la referencia al nodo hoja
 * en el arbol y la lista de pasos que llevan a dicha especie.
 */
public class InfoEspecie {
    
    /**
     * Nodo hoja en el arbol (NodoArbol) que representa esta especie.
     */
    private NodoArbol leaf;
    
    /**
     * Lista de pasos (pregunta-respuesta) para llegar a la especie.
     */
    private StepList path;

    /**
     * Constructor principal de InfoEspecie.
     * @param leaf El nodo hoja en el arbol donde se ubica la especie.
     * @param path La ruta de pasos (pregunta, boolean) para llegar a la especie.
     */
    public InfoEspecie(NodoArbol leaf, StepList path) {
        this.leaf = leaf;
        this.path = path;
    }

    /**
     * Retorna el nodo hoja del arbol.
     * @return El nodo (NodoArbol) que representa la especie.
     */
    public NodoArbol getLeaf() {
        return leaf;
    }

    /**
     * Establece el nodo hoja en el arbol.
     * @param leaf El nuevo NodoArbol (hoja) que representa la especie.
     */
    public void setLeaf(NodoArbol leaf) {
        this.leaf = leaf;
    }

    /**
     * Retorna la lista de pasos (StepList) para llegar a esta especie.
     * @return Un objeto StepList con la ruta de preguntas y respuestas.
     */
    public StepList getPath() {
        return path;
    }

    /**
     * Establece la lista de pasos para llegar a la especie.
     * @param path La nueva ruta de pasos (StepList).
     */
    public void setPath(StepList path) {
        this.path = path;
    }
}

