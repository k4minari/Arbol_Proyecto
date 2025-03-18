/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 * Clase que representa un nodo en el Árbol Dicotómico.
 */
public class NodoArbol {
    String pregunta;
    NodoArbol respuestaSi;
    NodoArbol respuestaNo;
    String especie;

    // Constructor para nodos de pregunta
    public NodoArbol(String pregunta) {
        this.pregunta = pregunta;
        this.respuestaSi = null;
        this.respuestaNo = null;
        this.especie = null;
    }

    // Constructor para nodos de especie (hojas del árbol)
    public NodoArbol(String especie, boolean esEspecie) {
        this.pregunta = null;
        this.respuestaSi = null;
        this.respuestaNo = null;
        this.especie = especie;
    }
}

