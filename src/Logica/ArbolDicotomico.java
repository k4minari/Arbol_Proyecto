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

/**
 * Clase que representa un arbol dicotomico. Cada nodo puede ser una pregunta
 * (con ramas "SI" y "NO") o una especie (hoja).
 * Permite cargar su estructura desde un archivo JSON, imprimirlo,
 * buscar interactivamente y poblar una tabla hash con los caminos a cada especie.
 */
public class ArbolDicotomico {

    /**
     * Raiz del arbol dicotomico. Puede ser un nodo de pregunta o una hoja (especie).
     */
    private NodoArbol raiz;

    /**
     * Constructor por defecto, inicializa la raiz en null.
     */
    public ArbolDicotomico() {
        this.raiz = null;
    }

    /**
     * Indica si el arbol esta vacio (raiz == null).
     * @return true si no hay nodos en el arbol, false en caso contrario.
     */
    public boolean estaVacio() {
        return (raiz == null);
    }

    /**
     * Devuelve la raiz del arbol.
     * @return El nodo raiz (NodoArbol).
     */
    public NodoArbol getRaiz() {
        return raiz;
    }

    /**
     * Asigna la raiz del arbol. Usar con precaucion, se sobreescribe la estructura.
     * @param raiz Nuevo nodo raiz.
     */
    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    /**
     * Abre un JFileChooser para que el usuario seleccione un archivo JSON.
     * Luego llama a cargarDesdeJSON(rutaArchivo).
     */
    public boolean seleccionarYcargarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona un archivo JSON");

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            String rutaArchivo = archivoSeleccionado.getAbsolutePath();
            cargarDesdeJSON(rutaArchivo);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Carga la estructura del arbol dicotomico desde un archivo JSON.
     * @param rutaArchivo Ruta del archivo JSON a leer.
     */
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
        } catch (Exception e) {
            System.err.println("Error al cargar el JSON: " + e.getMessage());
        }
    }

    /**
     * Recorre el arbol para llenar una tabla hash con la ruta de pasos
     * (pregunta-respuesta) para cada especie (hoja).
     * @param hashTable La tabla hash donde se insertara (clave=especie, valor=InfoEspecie).
     */
    public void construirIndice(TablaHash hashTable) {
        StepList path = new StepList();
        construirIndiceRec(raiz, path, hashTable);
    }

    /**
     * Realiza una busqueda interactiva del arbol, pidiendo al usuario que conteste (S/N)
     * en la consola hasta llegar a una hoja (especie).
     */


public void iniciarBusquedaInteractivaConVisual() {

    NodoArbol actual = this.getRaiz();
    StepList pasos = new StepList();

    while (actual != null) {
        if (actual.getEspecie() != null) {
            int opcionFinal = JOptionPane.showOptionDialog(null,
                    "La especie identificada es: " + actual.getEspecie() + "\n¿Deseas ver el recorrido?",
                    "Especie encontrada",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Sí", "No", "Cancelar"},
                    "Sí");

            if (opcionFinal == 0) {
                GraphStreamArbol grafoRecorrido = new GraphStreamArbol("Recorrido final");
                grafoRecorrido.mostrarRecorridoDesdeRaiz(this.getRaiz(), pasos);

            }

            if (opcionFinal == 2) {
                JOptionPane.showMessageDialog(null, "Búsqueda interrumpida.");
            }

            return; // terminamos después de encontrar especie
        }

        String[] opciones = {"Sí", "No", "Mostrar recorrido"};
        int seleccion = JOptionPane.showOptionDialog(null,
                actual.getPregunta(),
                "Pregunta del árbol",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion == 0) {
            pasos.add(new Step(actual.getPregunta(), true));
            actual = actual.getRespuestaSi();
        } else if (seleccion == 1) {
            pasos.add(new Step(actual.getPregunta(), false));
            actual = actual.getRespuestaNo();
        } else if (seleccion == 2) {
            GraphStreamArbol grafoRecorrido = new GraphStreamArbol("Recorrido actual");
            grafoRecorrido.mostrarRecorridoDesdeRaiz(this.getRaiz(), pasos);
        } else {
            JOptionPane.showMessageDialog(null, "Búsqueda interrumpida.");
            return;
        }
    }
}




    public InfoEspecie buscarInOrdenConRuta(String clave) {
    StepList ruta = new StepList();
    return buscarInOrdenRec(raiz, clave, ruta);
}

public InfoEspecie buscarInOrdenRec(NodoArbol nodo, String clave, StepList path) {
    if (nodo == null) return null;

    // Rama izquierda (respuesta SI)
    if (nodo.getRespuestaSi() != null) {
        path.add(new Step(nodo.getPregunta(), true));
        InfoEspecie resultadoIzq = buscarInOrdenRec(nodo.getRespuestaSi(), clave, path);
        if (resultadoIzq != null) return resultadoIzq;
        path.removeLast();  // backtrack
    }

    // Nodo actual
    if (nodo.getEspecie() != null && nodo.getEspecie().equals(clave)) {
        return new InfoEspecie(nodo, path.copy());
    }

    // Rama derecha (respuesta NO)
    if (nodo.getRespuestaNo() != null) {
        path.add(new Step(nodo.getPregunta(), false));
        InfoEspecie resultadoDer = buscarInOrdenRec(nodo.getRespuestaNo(), clave, path);
        if (resultadoDer != null) return resultadoDer;
        path.removeLast();  // backtrack
    }

    return null;
}


   
    /**
     * Inserta recursivamente una especie en el arbol, siguiendo el camino de preguntas.
     * @param nodo     Nodo actual en el que estamos.
     * @param camino   JSONArray con las (pregunta, boolean).
     * @param especie  Nombre de la especie a insertar cuando se llega al final.
     */
    private void insertarEnArbol(NodoArbol nodo, JSONArray camino, String especie) {
        for (int i = 0; i < camino.length(); i++) {
            JSONObject paso = camino.getJSONObject(i);

            // Cada paso tiene 1 sola clave (la pregunta) y su valor boolean
            String pregunta = paso.keys().next();
            boolean respuesta = paso.getBoolean(pregunta);

            // 1) Ajustamos la pregunta en el nodo actual (si procede)
            if (nodo.getEspecie() == null && nodo.getPregunta() == null) {
                nodo.setPregunta(pregunta);
            }
            if (nodo.getPregunta() != null && !nodo.getPregunta().equals(pregunta)) {
                // En un arbol dicotomico bien formado, esto no deberia ser un conflicto.
                nodo.setPregunta(pregunta);
            }

            // 2) Si estamos en la ultima pregunta del camino, creamos la hoja (especie)
            if (i == camino.length() - 1) {
                if (respuesta) {
                    nodo.setRespuestaSi(new NodoArbol(especie, true));
                } else {
                    nodo.setRespuestaNo(new NodoArbol(especie, true));
                }
                return;
            }

            // 3) Si NO es la ultima, bajamos por la rama correspondiente
            if (respuesta) {
                if (nodo.getRespuestaSi() == null) {
                    nodo.setRespuestaSi(new NodoArbol((String) null));
                }
                nodo = nodo.getRespuestaSi();
            } else {
                if (nodo.getRespuestaNo() == null) {
                    nodo.setRespuestaNo(new NodoArbol((String) null));
                }
                nodo = nodo.getRespuestaNo();
            }
        }
    }

    /**
     * Recorre recursivamente el arbol para poblar la tabla hash con la ruta de pasos.
     * @param nodo       Nodo actual.
     * @param path       Lista de pasos acumulados hasta este nodo.
     * @param hashTable  Tabla hash donde se insertan la especie y su InfoEspecie.
     */
    private void construirIndiceRec(NodoArbol nodo, StepList path, TablaHash hashTable) {
        if (nodo == null) {
            return;
        }

        // Si es hoja
        if (nodo.getEspecie() != null) {
            StepList rutaFinal = path.copy();
            InfoEspecie info = new InfoEspecie(nodo, rutaFinal);
            hashTable.insertar(nodo.getEspecie(), info);
            return;
        }

        // Caso nodo de pregunta, rama SI
        if (nodo.getRespuestaSi() != null) {
            path.add(new Step(nodo.getPregunta(), true));
            construirIndiceRec(nodo.getRespuestaSi(), path, hashTable);
            path.removeLast();
        }

        // Rama NO
        if (nodo.getRespuestaNo() != null) {
            path.add(new Step(nodo.getPregunta(), false));
            construirIndiceRec(nodo.getRespuestaNo(), path, hashTable);
            path.removeLast();
        }
    }
}

