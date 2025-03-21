/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 * Clase que representa un nodo en el Arbol Dicotomico.
 * Puede ser un nodo de pregunta (con ramas respuestaSi y respuestaNo)
 * o un nodo hoja (especie).
 */
public class NodoArbol {

    /**
     * Pregunta asociada a este nodo. Si es una hoja (especie), sera null.
     */
    private String pregunta;

    /**
     * Nodo que se sigue si la respuesta es "SI". Puede ser null.
     */
    private NodoArbol respuestaSi;

    /**
     * Nodo que se sigue si la respuesta es "NO". Puede ser null.
     */
    private NodoArbol respuestaNo;

    /**
     * Nombre de la especie si este nodo es hoja. Si es un nodo de pregunta, sera null.
     */
    private String especie;

    /**
     * Constructor para nodos de pregunta (internos).
     * @param pregunta Texto de la pregunta asociada.
     */
    public NodoArbol(String pregunta) {
        this.pregunta = pregunta;
        this.respuestaSi = null;
        this.respuestaNo = null;
        this.especie = null;
    }

    /**
     * Constructor para nodos de especie (hojas del arbol).
     * @param especie   Nombre de la especie.
     * @param esEspecie Bandera para diferenciar constructor (no se usa internamente).
     */
    public NodoArbol(String especie, boolean esEspecie) {
        this.pregunta = null;
        this.respuestaSi = null;
        this.respuestaNo = null;
        this.especie = especie;
    }

    // ------------------------------------------------
    // Getters y Setters
    // ------------------------------------------------

    /**
     * Retorna la pregunta de este nodo. Null si es especie.
     * @return La pregunta (String).
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Asigna la pregunta a este nodo (por si se desea modificar).
     * @param pregunta Nueva pregunta.
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Retorna el nodo que se sigue si la respuesta es "SI".
     * @return El NodoArbol de la rama SI, o null si no existe.
     */
    public NodoArbol getRespuestaSi() {
        return respuestaSi;
    }

    /**
     * Asigna el nodo para la rama "SI".
     * @param respuestaSi Nuevo nodo (rama SI).
     */
    public void setRespuestaSi(NodoArbol respuestaSi) {
        this.respuestaSi = respuestaSi;
    }

    /**
     * Retorna el nodo que se sigue si la respuesta es "NO".
     * @return El NodoArbol de la rama NO, o null si no existe.
     */
    public NodoArbol getRespuestaNo() {
        return respuestaNo;
    }

    /**
     * Asigna el nodo para la rama "NO".
     * @param respuestaNo Nuevo nodo (rama NO).
     */
    public void setRespuestaNo(NodoArbol respuestaNo) {
        this.respuestaNo = respuestaNo;
    }

    /**
     * Retorna el nombre de la especie si este nodo es hoja. Null si es pregunta.
     * @return El nombre de la especie (String).
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Asigna la especie a este nodo (lo convertiria en hoja).
     * @param especie Nueva especie.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}


