/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

/**
 *
 * @author cesar
 */
public class StepList {
    private Step[] steps; // array donde guardaremos los Step
    private int size;     // cantidad de elementos almacenados
    
    public StepList() {
        // capacidad inicial, puedes ajustarla si quieres
        this.steps = new Step[10];
        this.size = 0;
    }
    
    // Retorna la cantidad de pasos almacenados
    public int length() {
        return this.size;
    }
    
    // Obtiene el Step en la posición index (0 <= index < size)
    public Step get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice invalido: " + index);
        }
        return steps[index];
    }
    
    // Agrega un nuevo Step al final
    public void add(Step step) {
        // Si el array esta lleno, duplicamos capacidad
        if (size == steps.length) {
            expandCapacity();
        }
        steps[size] = step;
        size++;
    }
    
    // Elimina el último elemento (si existe)
    public void removeLast() {
        if (size > 0) {
            size--;
            steps[size] = null; // limpiar referencia
        }
    }
    
    // Crea una copia profunda de esta StepList
    public StepList copy() {
        StepList nueva = new StepList();
        // Ajustamos el tamaño del array interno para no desperdiciar
        nueva.steps = new Step[this.steps.length];
        for (int i = 0; i < this.size; i++) {
            nueva.steps[i] = this.steps[i]; // Steps son inmutables a efectos prácticos
        }
        nueva.size = this.size;
        return nueva;
    }
    
    // Expande el array interno al doble de capacidad
    private void expandCapacity() {
        Step[] newArr = new Step[steps.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = steps[i];
        }
        steps = newArr;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ruta [");
        for (int i = 0; i < size; i++) {
            sb.append(steps[i].toString());
            if (i < size - 1) {
                sb.append(" -> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
