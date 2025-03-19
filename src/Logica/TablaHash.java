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
 */
public class TablaHash {
    private EntryNode[] table; 
    private int capacity;

    public TablaHash(int capacity) {
        this.capacity = capacity;
        this.table = new EntryNode[capacity]; // por defecto, todos null
    }

    // Funcion de dispersion muy simple
    private int hashFunc(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return Math.abs(hash) % capacity;
    }

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
            if (actual.key.equals(key)) {
                actual.value = value;
                return;
            }
            anterior = actual;
            actual = actual.next;
        }
        // al final de la lista, inserto uno nuevo
        anterior.next = new EntryNode(key, value);
    }

    public InfoEspecie buscar(String key) {
        int index = hashFunc(key);

        EntryNode actual = table[index];
        while (actual != null) {
            if (actual.key.equals(key)) {
                return actual.value;
            }
            actual = actual.next;
        }
        return null; // no encontrado
    }
}
