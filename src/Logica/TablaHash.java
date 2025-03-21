/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import EDDauxiliares.EntryNode;
import EDDauxiliares.InfoEspecie;

/**
 *
 * @author cesar
 * Clase que representa una tabla hash, implementada con encadenamiento separado.
 * Cada posicion del arreglo es una lista de EntryNode para manejar colisiones.
 */
public class TablaHash {
    /**
     * Arreglo principal, cada elemento es el inicio de una lista enlazada de EntryNode.
     */
    private EntryNode[] table; 

    /**
     * Capacidad del arreglo principal (tamaño fijo).
     */
    private int capacity;

    /**
     * Constructor que inicializa la tabla con la capacidad especificada.
     * @param capacity Tamaño del arreglo interno.
     */
    public TablaHash(int capacity) {
        this.capacity = capacity;
        this.table = new EntryNode[capacity]; // por defecto, todos null
    }

    /**
     * Inserta una nueva clave-valor (key, InfoEspecie) en la tabla hash.
     * Si la clave ya existe, sobrescribe el valor.
     * @param key   La clave (nombre de la especie).
     * @param value El objeto InfoEspecie asociado.
     */
    public void insertar(String key, InfoEspecie value) {
        int index = hashFunc(key);

        // Si en la posición index no hay nada, lo ponemos
        if (table[index] == null) {
            table[index] = new EntryNode(key, value);
            return;
        }

        // Si ya hay colisión, recorremos la lista
        EntryNode actual = table[index];
        EntryNode anterior = null;
        while (actual != null) {
            // Si la clave ya existe, la sobrescribimos
            if (actual.getKey().equals(key)) {
                actual.setValue(value);
                return;
            }
            anterior = actual;
            actual = actual.getNext();
        }
        // al final de la lista, inserto uno nuevo
        anterior.setNext(new EntryNode(key, value));
    }

    /**
     * Busca el valor (InfoEspecie) asociado a la clave dada.
     * @param key La clave (nombre de la especie) a buscar.
     * @return El objeto InfoEspecie si se encuentra, o null si no existe.
     */
    public InfoEspecie buscar(String key) {
        int index = hashFunc(key);

        EntryNode actual = table[index];
        while (actual != null) {
            if (actual.getKey().equals(key)) {
                return actual.getValue();
            }
            actual = actual.getNext();
        }
        return null; // no encontrado
    }

    /**
     * Cuenta el número total de elementos (EntryNode) almacenados en la tabla.
     * @return La cantidad total de nodos en todas las listas.
     */
    public int countElements() {
        int count = 0;
        for (int i = 0; i < capacity; i++) {
            EntryNode nodo = table[i];
            while (nodo != null) {
                count++;
                nodo = nodo.getNext();
            }
        }
        return count;
    }

    /**
     * Retorna un arreglo con todas las claves (String) almacenadas en la tabla.
     * @return Un arreglo de String con todas las claves.
     */
    public String[] getAllKeys() {
        int total = countElements();
        String[] keys = new String[total];
        int idx = 0;

        for (int i = 0; i < capacity; i++) {
            EntryNode nodo = table[i];
            while (nodo != null) {
                keys[idx] = nodo.getKey();
                idx++;
                nodo = nodo.getNext();
            }
        }
        return keys;
    }

    /**
     * Obtiene la capacidad actual de la tabla.
     * @return La capacidad (int).
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Cambia la capacidad de la tabla hash.
     * (Usar con precaucion, es posible que se requiera rehash).
     * @param capacity Nueva capacidad deseada.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Función de dispersión que transforma la clave en un índice.
     * Es privada, pues se usa solo internamente.
     * @param key La clave a dispersar.
     * @return El índice calculado dentro de [0..capacity-1].
     */
    private int hashFunc(String key) {
        int h = key.hashCode(); 
        return Math.abs(h) % capacity;
    }
}
