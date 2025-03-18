/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Logica.ArbolDicotomico;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author francisco
 */
public class Arbol_Dicotomico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArbolDicotomico arbol = new ArbolDicotomico();

      
        arbol.seleccionarYcargarArchivo();

        
        arbol.imprimirArbol();

     
    
    }
    
}