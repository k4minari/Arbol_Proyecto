/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

/**
 *
 * @author cesar
 */
public class Step {
    String pregunta;
    boolean respuesta;
    
    public Step(String pregunta, boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    @Override
    public String toString() {
        String resp = (respuesta ? "SI" : "NO");
        return pregunta + "? " + resp;
    }
}

