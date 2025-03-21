/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

/**
 * Clase que representa un paso en la ruta de preguntas, 
 * almacenando una pregunta (String) y una respuesta booleana (true = SI, false = NO).
 */
public class Step {
    
    /**
     * La pregunta que se le hace al usuario (por ejemplo, "Hojas como agujas").
     */
    private String pregunta;
    
    /**
     * La respuesta booleana a la pregunta (true = SI, false = NO).
     */
    private boolean respuesta;

    /**
     * Constructor de Step.
     * @param pregunta  Texto de la pregunta.
     * @param respuesta Valor booleano (true = SI, false = NO).
     */
    public Step(String pregunta, boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    /**
     * Obtiene la pregunta.
     * @return La pregunta (String).
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Asigna una nueva pregunta.
     * @param pregunta La nueva pregunta (String).
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Retorna la respuesta booleana.
     * @return true si la respuesta es SI, false si es NO.
     */
    public boolean isRespuesta() {
        return respuesta;
    }

    /**
     * Asigna la respuesta booleana.
     * @param respuesta true = SI, false = NO.
     */
    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Devuelve una representacion en String, por ejemplo "Hojas como agujas? SI".
     * @return Representacion textual de este Step.
     */
    @Override
    public String toString() {
        String resp = (respuesta ? "SI" : "NO");
        return pregunta + "? " + resp;
    }
}
