/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

/**
 *
 * @author cesar
 */
public class EntryNode {
    public String key;         // nombre de la especie
    public InfoEspecie value;  // referencia al nodo hoja y la ruta
   public  EntryNode next;     // siguiente nodo en la "lista"

    public EntryNode(String key, InfoEspecie value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
