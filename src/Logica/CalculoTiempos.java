/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import EDDauxiliares.InfoEspecie;

/**
 *
 * @author cesar
 * Clase que se encarga de comparar los tiempos de busqueda en el ArbolDicotomico
 * (usando recorrido inorden) y en la TablaHash, midiendo cada proceso en milisegundos.
 */
public class CalculoTiempos {
    
    /**
     * Referencia al arbol dicotomico donde realizamos la busqueda inorden.
     */
    private ArbolDicotomico arbol;
    
    /**
     * Referencia a la tabla hash donde buscamos por clave la especie.
     */
    private TablaHash tablaHash;

    /**
     * Constructor que recibe las referencias al arbol y la tabla hash.
     * @param arbol     El ArbolDicotomico (con metodo buscarInOrden(...)).
     * @param tablaHash La tabla hash para buscar por clave.
     */
    public CalculoTiempos(ArbolDicotomico arbol, TablaHash tablaHash) {
        this.arbol = arbol;
        this.tablaHash = tablaHash;
    }

    /**
     * Mide el tiempo en milisegundos que tarda la busqueda de 'clave'
     * mediante recorrido inorden en el arbol.
     * @param clave Nombre de la especie a buscar.
     * @return Duracion de la busqueda en milisegundos.
     */
    public double tiempoBusquedaEnArbolInOrden(String clave) {
        long inicio = System.nanoTime();
        boolean encontrada = arbol.buscarInOrden(arbol.getRaiz(), clave);
        long fin = System.nanoTime();
        double duracionMs = (fin - inicio) / 1_000_000.0;
        return duracionMs;
    }

    /**
     * Mide el tiempo en milisegundos que tarda la busqueda de 'clave'
     * en la tabla hash.
     * @param clave Nombre de la especie a buscar.
     * @return Duracion de la busqueda en milisegundos.
     */
    public double tiempoBusquedaEnHash(String clave) {
        long inicio = System.nanoTime();
        InfoEspecie info = tablaHash.buscar(clave); // Devuelve null si no existe
        long fin = System.nanoTime();
        double duracionMs = (fin - inicio) / 1_000_000.0;
        return duracionMs;
    }

    /**
     * Compara el tiempo de busqueda en el arbol (inorden) y en la tabla hash,
     * indicando cual es mas rapido, la diferencia en milisegundos y
     * el porcentaje relativo al metodo mas lento.
     * 
     * @param clave Nombre de la especie a buscar.
     * @return Un String con el resultado de la comparacion.
     */
    public String compararTiempos(String clave) {
        double tArbol = tiempoBusquedaEnArbolInOrden(clave);
        double tHash  = tiempoBusquedaEnHash(clave);

        // Determinamos cual es mas rapido y cual mas lento
        String metodoMasRapido;
        String metodoMasLento;
        double tiempoMasRapido;
        double tiempoMasLento;

        if (tArbol < tHash) {
            metodoMasRapido = "Arbol INorden";
            metodoMasLento  = "Tabla Hash";
            tiempoMasRapido = tArbol;
            tiempoMasLento  = tHash;
        } else {
            metodoMasRapido = "Tabla Hash";
            metodoMasLento  = "Arbol INorden";
            tiempoMasRapido = tHash;
            tiempoMasLento  = tArbol;
        }

        // Diferencia absoluta
        double diferencia = tiempoMasLento - tiempoMasRapido;
        // Porcentaje de diferencia
        double porcentaje = 0.0;
        if (tiempoMasLento != 0) {
            porcentaje = (diferencia / tiempoMasLento) * 100.0;
        }

        // Construccion del mensaje final
        String resultado = String.format(
            "El metodo mas rapido fue: %s %.5f ms\n"
          + "Supero a %s %.5f ms por %.5f ms, lo cual representa %.2f%% de diferencia.",
            metodoMasRapido, tiempoMasRapido,
            metodoMasLento, tiempoMasLento,
            diferencia, porcentaje
        );

        return resultado;
    }

    // ------------------------------------------------
    // Getters/Setters opcionales si los necesitas
    // ------------------------------------------------

    /**
     * Obtiene la referencia al ArbolDicotomico.
     * @return El objeto ArbolDicotomico.
     */
    public ArbolDicotomico getArbol() {
        return arbol;
    }

    /**
     * Asigna un nuevo ArbolDicotomico a esta clase.
     * @param arbol El nuevo ArbolDicotomico.
     */
    public void setArbol(ArbolDicotomico arbol) {
        this.arbol = arbol;
    }

    /**
     * Obtiene la referencia a la TablaHash.
     * @return El objeto TablaHash.
     */
    public TablaHash getTablaHash() {
        return tablaHash;
    }

    /**
     * Asigna una nueva TablaHash a esta clase.
     * @param tablaHash La nueva TablaHash.
     */
    public void setTablaHash(TablaHash tablaHash) {
        this.tablaHash = tablaHash;
    }
}


