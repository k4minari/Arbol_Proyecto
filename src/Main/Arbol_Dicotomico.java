/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import EDDauxiliares.InfoEspecie;
import EDDauxiliares.Step;
import EDDauxiliares.StepList;
import Logica.ArbolDicotomico;
import Logica.NodoArbol;
import Logica.TablaHash;
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

       // 2. Crear la tabla hash
        TablaHash tabla = new TablaHash(50); // capacidad arbitraria
        
        // 3. Construir el indice
        arbol.construirIndice(tabla);
        
        // 4. Probar busqueda
        String especieBuscada = "Roble Blanco";
        InfoEspecie info = tabla.buscar(especieBuscada);
        
        if (info != null) {
            System.out.println("Se encontro la especie: " + especieBuscada);
            // Mostrar la ruta
            StepList ruta = info.getPath();
            for (int i = 0; i < ruta.length(); i++) {
                Step s = ruta.get(i);
                System.out.println(s.toString());
            }
            
            // Mostrar el nodo hoja (comprobacion)
            NodoArbol hoja = info.getLeaf();
            System.out.println("Nodo hoja -> " + hoja.especie);
        } else {
            System.out.println("No se encontro la especie: " + especieBuscada);
        }
        arbol.iniciarBusquedaInteractiva();
    
    }
    
}