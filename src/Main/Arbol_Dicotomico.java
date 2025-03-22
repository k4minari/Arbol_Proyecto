/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import EDDauxiliares.InfoEspecie;
import EDDauxiliares.Step;
import EDDauxiliares.StepList;
import Logica.ArbolDicotomico;
import Logica.CalculoTiempos;
import Logica.GraphStreamArbol;
import Logica.NodoArbol;
import Logica.TablaHash;
import java.io.File;
import javax.swing.JFileChooser;
import Interfaz.Menu1;

/**
 *
 * @author francisco
 */
public class Arbol_Dicotomico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu1 menu = new Menu1(); // deberia ejecutarse primero
        menu.setVisible(true);
        
        /*ArbolDicotomico arbol = new ArbolDicotomico();

      
        arbol.seleccionarYcargarArchivo();

        
        arbol.imprimirArbol();

       // 2. Crear la tabla hash
        TablaHash tabla = new TablaHash(50); // capacidad arbitraria
        
        // 3. Construir el indice
        arbol.construirIndice(tabla);
        
        // 4. Probar busqueda
        String especieBuscada = "Magnolia";
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
            System.out.println("Nodo hoja -> " + hoja.getEspecie());
        } else {
            System.out.println("No se encontro la especie: " + especieBuscada);
        }
        String[] todasLasEspecies = tabla.getAllKeys();
        
        // 4. Imprimir por consola
        System.out.println("=== CLAVES EN LA TABLA HASH ===");
        for (String especie : todasLasEspecies) {
            System.out.println(" - " + especie);}
        // 2. Crear instancia de la clase que construye el grafo
        GraphStreamArbol grafoArbol = new GraphStreamArbol("Arbol Dicotomico");
        CalculoTiempos calc = new CalculoTiempos(arbol, tabla);

        // 4) Pedimos la comparacion
      
        String resultado = calc.compararTiempos(especieBuscada);

        System.out.println(resultado);
        // 3. Construir la representacion con el arbol
        grafoArbol.construir(arbol);

        // 4. Mostrarlo
        grafoArbol.mostrar();

        // Listo: aparece la ventana de GraphStream con los nodos y aristas
        arbol.iniciarBusquedaInteractivaConVisual();*/
    
    }
    
}