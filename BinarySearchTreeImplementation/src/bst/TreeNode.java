package bst;

/**
 * Clase para representar un nodo en un árbol binario de búsqueda.
 */
public class TreeNode {
    Integer value; // Valor almacenado en el nodo
    TreeNode left; // Referencia al hijo izquierdo
    TreeNode right; // Referencia al hijo derecho

    /**
     * Constructor del nodo.
     * @param value Valor entero para el nodo.
     */
    TreeNode(Integer value) {
        this.value = value;
        left = null;
        right = null;
    }
}
 