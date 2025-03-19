/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

import Logica.NodoArbol;

/**
 *
 * @author cesar
 */
public class InfoEspecie {
    private NodoArbol leaf;
    private StepList path;

    public InfoEspecie(NodoArbol leaf, StepList path) {
        this.leaf = leaf;
        this.path = path;
    }

    public NodoArbol getLeaf() {
        return leaf;
    }

    public StepList getPath() {
        return path;
    }
}
