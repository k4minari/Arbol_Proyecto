/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDDauxiliares;

/**
 *
 * @author cesar
/**
 * Clase que representa una lista dinamica de objetos Step, 
 * gestionada con un array interno sin usar las colecciones de java.util.
 */
public class StepList {

    /**
     * Arreglo interno donde se almacenan los Step.
     */
    private Step[] steps;

    /**
     * Cantidad actual de elementos (Step) almacenados.
     */
    private int size;

    /**
     * Constructor que inicia la capacidad en 10 elementos.
     */
    public StepList() {
        this.steps = new Step[10];
        this.size = 0;
    }

    /**
     * Retorna la cantidad de pasos (Step) almacenados.
     * @return Cantidad de elementos en la lista.
     */
    public int length() {
        return this.size;
    }

    /**
     * Devuelve el Step en la posicion index (0 <= index < size).
     * @param index Posicion del Step que se desea obtener.
     * @return El objeto Step en la posicion solicitada.
     * @throws IndexOutOfBoundsException Si el indice esta fuera de rango.
     */
    public Step get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice invalido: " + index);
        }
        return steps[index];
    }

    /**
     * Agrega un nuevo Step al final de la lista.
     * @param step El Step a insertar.
     */
    public void add(Step step) {
        // Si el array esta lleno, duplicamos capacidad
        if (size == steps.length) {
            expandCapacity();
        }
        steps[size] = step;
        size++;
    }

    /**
     * Elimina el ultimo elemento (si existe) de la lista.
     */
    public void removeLast() {
        if (size > 0) {
            size--;
            steps[size] = null; // limpiar referencia
        }
    }

    /**
     * Crea una copia (shallow) de esta StepList, 
     * copiando la referencia de los Step actuales.
     * @return Una nueva StepList con el mismo contenido.
     */
    public StepList copy() {
        StepList nueva = new StepList();
        // Ajustamos el array interno para no desperdiciar:
        nueva.steps = new Step[this.steps.length];
        for (int i = 0; i < this.size; i++) {
            // Steps son relativamente inmutables, 
            // asi que copiamos la misma referencia.
            nueva.steps[i] = this.steps[i];
        }
        nueva.size = this.size;
        return nueva;
    }

    /**
     * Expande el array interno al doble de su capacidad actual.
     */
    private void expandCapacity() {
        Step[] newArr = new Step[steps.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = steps[i];
        }
        steps = newArr;
    }

    /**
     * Retorna una representacion en String de los pasos 
     * en la forma "Ruta [Step1 -> Step2 -> ...]".
     * @return Representacion textual de la StepList.
     */
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

    /**
     * Obtiene la capacidad actual del array interno (solo lectura).
     * @return La longitud del array interno steps.
     */
    public int getInternalCapacity() {
        return steps.length;
    }

    /**
     * Retorna el arreglo interno de Steps (uso con precaucion).
     * @return El array Step[] interno.
     */
    public Step[] getStepsArray() {
        return steps; // OJO: expone la referencia interna
    }
    
    /**
     * Metodo para modificar un Step en indice dado.
     * @param index Posicion a modificar.
     * @param newStep Nuevo objeto Step.
     * @throws IndexOutOfBoundsException Si el indice es invalido.
     */
    public void setStepAt(int index, Step newStep) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice invalido: " + index);
        }
        steps[index] = newStep;
    }
}

