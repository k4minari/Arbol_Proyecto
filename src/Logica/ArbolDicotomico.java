package Logica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import EDDauxiliares.InfoEspecie;
import EDDauxiliares.Step;
import EDDauxiliares.StepList;
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class ArbolDicotomico {
    private NodoArbol raiz;

    public ArbolDicotomico() {
        this.raiz = null;
    }
    public boolean estaVacio() {
        return (raiz == null);
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void seleccionarYcargarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona un archivo JSON");

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            String rutaArchivo = archivoSeleccionado.getAbsolutePath();
            cargarDesdeJSON(rutaArchivo);
        } else {
            System.out.println("No se selecciono ningun archivo.");
        }
    }

    public void cargarDesdeJSON(String rutaArchivo) {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
            JSONObject json = new JSONObject(contenido);

            // Tomamos la primera (y unica) clave del objeto JSON (por ejemplo "Arboles templados")
            String nombreClave = json.keys().next();

            // Obtenemos el array de especies
            JSONArray especies = json.getJSONArray(nombreClave);

            // Construimos el arbol
            this.raiz = new NodoArbol((String) null); // Nodo raiz "vacio" inicial
            for (int i = 0; i < especies.length(); i++) {
                JSONObject especieObj = especies.getJSONObject(i);
                String nombreEspecie = especieObj.keys().next();
                JSONArray camino = especieObj.getJSONArray(nombreEspecie);

                insertarEnArbol(this.raiz, camino, nombreEspecie);
            }

            System.out.println("Arbol cargado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al cargar el JSON: " + e.getMessage());
        }
    }

    private void insertarEnArbol(NodoArbol nodo, JSONArray camino, String especie) {
        for (int i = 0; i < camino.length(); i++) {
            JSONObject paso = camino.getJSONObject(i);

            // Cada paso tiene 1 sola clave: la pregunta, y un valor boolean
            String pregunta = paso.keys().next();
            boolean respuesta = paso.getBoolean(pregunta);

            // 1) Ajustamos la pregunta en el nodo actual (si procede)
            if (nodo.especie == null && nodo.pregunta == null) {
                nodo.pregunta = pregunta;
            }
            if (nodo.pregunta != null && !nodo.pregunta.equals(pregunta)) {
                // En un arbol dicotomico bien formado, esto no deberia ser conflicto
                // pero aqui lo reescribimos por simplicidad.
                nodo.pregunta = pregunta;
            }

            // 2) Si estamos en la ultima pregunta del camino, creamos la hoja (especie)
            if (i == camino.length() - 1) {
                if (respuesta) {
                    nodo.respuestaSi = new NodoArbol(especie, true);
                } else {
                    nodo.respuestaNo = new NodoArbol(especie, true);
                }
                return;
            }

            // 3) Si NO es la ultima, bajamos por la rama correspondiente
            if (respuesta) {
                if (nodo.respuestaSi == null) {
                    nodo.respuestaSi = new NodoArbol((String) null);
                }
                nodo = nodo.respuestaSi;
            } else {
                if (nodo.respuestaNo == null) {
                    nodo.respuestaNo = new NodoArbol((String) null);
                }
                nodo = nodo.respuestaNo;
            }
        }
    }

    public void imprimirArbol() {
        if (raiz == null) {
            System.out.println("El arbol esta vacio.");
        } else {
            System.out.println("Estructura del Arbol Dicotomico:");
            imprimirRecursivo(raiz, "");
        }
    }

    private void imprimirRecursivo(NodoArbol nodo, String prefijo) {
        if (nodo != null) {
            if (nodo.especie != null) {
                System.out.println(prefijo + "[ESPECIE] " + nodo.especie);
            } else {
                System.out.println(prefijo + "Pregunta: " + nodo.pregunta);
            }
            imprimirRecursivo(nodo.respuestaSi, prefijo + "  ->SI-> ");
            imprimirRecursivo(nodo.respuestaNo, prefijo + "  ->NO-> ");
        }
    }
    public void construirIndice(TablaHash hashTable) {
        StepList path = new StepList();
        construirIndiceRec(raiz, path, hashTable);
    }

    private void construirIndiceRec(NodoArbol nodo, StepList path, TablaHash hashTable) {
        if (nodo == null) {
            return;
        }

        // Si es hoja
        if (nodo.especie != null) {
            // hacemos copia de la lista de pasos
            StepList rutaFinal = path.copy();  
            InfoEspecie info = new InfoEspecie(nodo, rutaFinal);
            // Insertamos en la tabla hash: clave = nombre especie, valor = InfoEspecie
            hashTable.insertar(nodo.especie, info);
            return;
        }

        // Si el nodo actual es de pregunta, recorremos su rama SI
        if (nodo.respuestaSi != null) {
            // Añadimos un Step con la pregunta actual y respuesta = true
            path.add(new Step(nodo.pregunta, true));
            construirIndiceRec(nodo.respuestaSi, path, hashTable);
            // removeLast para volver al estado anterior
            path.removeLast();
        }
        
        // Recorremos la rama NO
        if (nodo.respuestaNo != null) {
            path.add(new Step(nodo.pregunta, false));
            construirIndiceRec(nodo.respuestaNo, path, hashTable);
            path.removeLast();
        }
    }
    public void iniciarBusquedaInteractiva() {
    NodoArbol actual = raiz;
    Scanner sc = new Scanner(System.in);

    while (actual != null) {
        // Si es hoja
        if (actual.especie != null) {
            System.out.println("La especie identificada es: " + actual.especie);
            return;
        }
        // Caso contrario, mostramos la pregunta
        System.out.println(actual.pregunta + " (S/N)");
        String respuesta = sc.nextLine().trim().toUpperCase();

        if (respuesta.startsWith("S")) {
            actual = actual.respuestaSi;
        } else {
            actual = actual.respuestaNo;
        }
    }
}

}


