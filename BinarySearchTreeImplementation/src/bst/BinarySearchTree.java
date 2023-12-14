package bst;
import java.util.ArrayList;

/**
 * Clase que implementa un árbol binario de búsqueda.
 */
public class BinarySearchTree {
    private TreeNode root; // Raíz del árbol

    /**
     * Constructor del árbol binario de búsqueda.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Inserta un nuevo valor en el árbol.
     * @param i Valor a insertar.
     */
    public void insert(Integer i) {
        root = insertRec(root, i);
    }

    /**
     * Método auxiliar recursivo para insertar un nuevo valor.
     * @param root Nodo actual.
     * @param i Valor a insertar.
     * @return Nodo actualizado.
     */
    private TreeNode insertRec(TreeNode root, Integer i) {
        if (root == null) {
            root = new TreeNode(i);
            return root;
        }
        if (i < root.value) {
            root.left = insertRec(root.left, i);
        } else if (i > root.value) {
            root.right = insertRec(root.right, i);
        }
        return root;
    }

    /**
     * Borra un valor del árbol.
     * @param i Valor a borrar.
     */
    public void delete(Integer i) {
        root = deleteRec(root, i);
    }

    /**
     * Método auxiliar recursivo para borrar un valor.
     * @param root Nodo actual.
     * @param i Valor a borrar.
     * @return Nodo actualizado.
     */
    private TreeNode deleteRec(TreeNode root, Integer i) {
        if (root == null) {
            return root;
        }

        if (i < root.value) {
            root.left = deleteRec(root.left, i);
        } else if (i > root.value) {
            root.right = deleteRec(root.right, i);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    /**
     * Encuentra el valor mínimo en el árbol.
     * @param root Nodo de inicio.
     * @return Valor mínimo.
     */
    private Integer minValue(TreeNode root) {
        Integer minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    /**
     * Realiza un recorrido en inorden del árbol.
     * @return Lista con los valores del recorrido.
     */
    public ArrayList<Integer> inorder() {
        ArrayList<Integer> result = new ArrayList<>();
        inorderRec(root, result);
        return result;
    }

    /**
     * Método auxiliar recursivo para el recorrido en inorden.
     * @param root Nodo actual.
     * @param result Lista para almacenar el recorrido.
     */
    private void inorderRec(TreeNode root, ArrayList<Integer> result) {
        if (root != null) {
            inorderRec(root.left, result);
            result.add(root.value);
            inorderRec(root.right, result);
        }
    }

    /**
     * Realiza un recorrido en preorden del árbol.
     * @return Lista con los valores del recorrido.
     */
    public ArrayList<Integer> preorder() {
        ArrayList<Integer> result = new ArrayList<>();
        preorderRec(root, result);
        return result;
    }

    /**
     * Método auxiliar recursivo para el recorrido en preorden.
     * @param root Nodo actual.
     * @param result Lista para almacenar el recorrido.
     */
    private void preorderRec(TreeNode root, ArrayList<Integer> result) {
        if (root != null) {
            result.add(root.value);
            preorderRec(root.left, result);
            preorderRec(root.right, result);
        }
    }

    /**
     * Realiza un recorrido en postorden del árbol.
     * @return Lista con los valores del recorrido.
     */
    public ArrayList<Integer> postorder() {
        ArrayList<Integer> result = new ArrayList<>();
        postorderRec(root, result);
        return result;
    }

    /**
     * Método auxiliar recursivo para el recorrido en postorden.
     * @param root Nodo actual.
     * @param result Lista para almacenar el recorrido.
     */
    private void postorderRec(TreeNode root, ArrayList<Integer> result) {
        if (root != null) {
            postorderRec(root.left, result);
            postorderRec(root.right, result);
            result.add(root.value);
        }
    }
}
