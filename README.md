# Arbol_Proyecto

## Descripción
Este proyecto implementa un árbol de búsqueda dicotómico en Java, con funcionalidades de carga de datos desde archivos JSON y múltiples opciones de búsqueda.

## Características Principales

* **Carga de Datos desde JSON**: Permite cargar datos para el árbol desde archivos JSON, facilitando la importación de grandes conjuntos de datos.
* **Búsqueda Manual (Sí/No)**: Ofrece una interfaz interactiva para buscar elementos en el árbol mediante preguntas de sí/no, ideal para usuarios que prefieren una búsqueda guiada.
* **Búsqueda Directa**: Implementa búsqueda directa de elementos, con opciones para:
    * Recorridos de árbol.
    * Búsqueda mediante tabla hash para eficiencia optimizada.
* **Interfaz Gráfica**: Incluye una interfaz gráfica intuitiva para facilitar la interacción con el árbol y las opciones de búsqueda.
* **Visualización del Árbol (Opcional)**: Permite visualizar la estructura del árbol de forma gráfica.

## Requisitos

* Librería JSON para Java (por ejemplo, Jackson, Gson).
* Librerias de GraphStream (necesario para visualizar el arbol)

## Instalación

1.  **Clonar el Repositorio**
2.  **Compilar el Proyecto**
3.  **Es necesario instalar la librería GraphStream**
4.  **Es necesario instalar la librería JSON**
5.  **Se deben colocar los archivos JAR correspondientes en las librerias a utilizar en las propiedades del proyecto**
6.  **Ejecutar la Aplicación**

## Uso

1.  **Carga de Datos**:
    * Selecciona la opción "iniciar" para cargar un archivo JSON.
    * Proporciona la ruta al archivo JSON.
2.  **Búsqueda Manual**:
    * Elige la opción de búsqueda manual.
    * Responde a las preguntas de sí/no para navegar por el árbol.
3.  **Búsqueda Directa**:
    * Selecciona la opción de búsqueda directa.
    * Elige entre recorridos de árbol o búsqueda por tabla hash.
    * Ingresa el valor a buscar.
4.  **Visualización (Opcional)**:
    * Selecciona la opción de visualizar el arbol.
