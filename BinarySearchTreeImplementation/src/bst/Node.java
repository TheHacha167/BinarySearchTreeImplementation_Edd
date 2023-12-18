package bst;

/**
 * Clase para representar un nodo en un árbol binario de búsqueda.
 */
public class Node {
    Integer value; // Valor almacenado en el nodo
    Node izquierda; // Referencia al hijo izquierdo
    Node derecha; // Referencia al hijo derecho

    /**
     * Constructor del nodo.
     * @param value Valor entero para el nodo.
     */
    Node(Integer value) {
        this.value = value;
        izquierda = null;
        derecha = null;
    }
}
 