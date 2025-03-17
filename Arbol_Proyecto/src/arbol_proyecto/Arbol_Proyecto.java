/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol_proyecto;
import org.json.JSONObject;

/**
 *
 * @author cesar
 */
public class Arbol_Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String jsonString = "{ \"nombre\": \"Pino\", \"hojas\": \"como agujas\" }";
        JSONObject jsonObj = new JSONObject(jsonString);

        System.out.println("Nombre: " + jsonObj.getString("nombre"));
        System.out.println("Hojas: " + jsonObj.getString("hojas"));   // TODO code application logic here
    }
    
}
