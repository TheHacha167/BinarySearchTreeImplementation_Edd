package bst;

/**
 * Clase para representar un nodo en un árbol binario de búsqueda.
 */
public class Node {
    Integer Valor; // Valor almacenado en el nodo
    Node izquierda; // Referencia al hijo izquierdo
    Node derecha; // Referencia al hijo derecho

    /**
     * Constructor del nodo.
     * @param Valor Valor entero para el nodo.
     */
    Node(Integer Valor) {
        this.Valor = Valor;
        izquierda = null;
        derecha = null;
    }
}
 