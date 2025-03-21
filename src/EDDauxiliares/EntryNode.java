/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

/**
 *
 * @author cesar
 * Clase que representa un nodo en la cadena de colisiones de la TablaHash.
 * Almacena una clave (key), el valor (InfoEspecie) y un apuntador al siguiente nodo (next).
 */
public class EntryNode {
    
    /** 
     * Clave del nodo (nombre de la especie).
     */
    private String key;
    
    /** 
     * Objeto InfoEspecie que contiene datos asociados (hoja y ruta).
     */
    private InfoEspecie value;
    
    /** 
     * Referencia al siguiente nodo en la lista de colisiones.
     */
    private EntryNode next;

    /**
     * Constructor de EntryNode.
     * @param key   Clave que identifica la especie.
     * @param value Objeto InfoEspecie asociado a esta clave.
     */
    public EntryNode(String key, InfoEspecie value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    /**
     * Obtiene la clave del nodo.
     * @return La clave (String).
     */
    public String getKey() {
        return key;
    }

    /**
     * Asigna la clave del nodo.
     * @param key Nueva clave para el nodo.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Obtiene el valor (InfoEspecie) del nodo.
     * @return El objeto InfoEspecie.
     */
    public InfoEspecie getValue() {
        return value;
    }

    /**
     * Asigna el valor (InfoEspecie) del nodo.
     * @param value Nuevo objeto InfoEspecie para el nodo.
     */
    public void setValue(InfoEspecie value) {
        this.value = value;
    }

    /**
     * Obtiene la referencia al siguiente nodo.
     * @return El siguiente nodo en la lista (EntryNode).
     */
    public EntryNode getNext() {
        return next;
    }

    /**
     * Asigna la referencia al siguiente nodo.
     * @param next El siguiente nodo en la lista.
     */
    public void setNext(EntryNode next) {
        this.next = next;
    }
}

