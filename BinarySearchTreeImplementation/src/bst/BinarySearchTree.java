package bst;
import java.util.ArrayList;

/**
 * Clase que implementa un árbol binario de búsqueda.
 */
public class BinarySearchTree {
    private Node raiz; // Raíz del árbol

    /**
     * Constructor del árbol binario de búsqueda.
     */
    public BinarySearchTree() {
        raiz = null;
    }

    /**
     * Inserta un nuevo valor en el árbol.
     * @param i Valor a insertar.
     */
    public void insert(Integer i) {
        raiz = insertRec(raiz, i);
    }

    /**
     * Método auxiliar recursivo para insertar un nuevo valor.
     * @param raiz Nodo actual.
     * @param i Valor a insertar.
     * @return Nodo actualizado.
     */
    private Node insertRec(Node raiz, Integer i) {
        if (raiz == null) {
            raiz = new Node(i);
            return raiz;
        }
        if (i < raiz.Valor) {
            raiz.izquierda = insertRec(raiz.izquierda, i);
        } else if (i > raiz.Valor) {
            raiz.derecha = insertRec(raiz.derecha, i);
        }
        return raiz;
    }

    /**
     * Borra un valor del árbol.
     * @param i Valor a borrar.
     */
    public void delete(Integer i) {
        raiz = deleteRec(raiz, i);
    }

    /**
     * Método auxiliar recursivo para borrar un valor.
     * @param raiz Nodo actual.
     * @param i Valor a borrar.
     * @return Nodo actualizado.
     */
    private Node deleteRec(Node raiz, Integer i) {
        if (raiz == null) {
            return raiz;
        }

        if (i < raiz.Valor) {
            raiz.izquierda = deleteRec(raiz.izquierda, i);
        } else if (i > raiz.Valor) {
            raiz.derecha = deleteRec(raiz.derecha, i);
        } else {
            if (raiz.izquierda == null) {
                return raiz.derecha;
            } else if (raiz.derecha == null) {
                return raiz.izquierda;
            }

            raiz.Valor = minValor(raiz.derecha);
            raiz.derecha = deleteRec(raiz.derecha, raiz.Valor);
        }

        return raiz;
    }

    /**
     * Encuentra el valor mínimo en el árbol.
     * @param raiz Nodo de inicio.
     * @return Valor mínimo.
     */
    private Integer minValor(Node raiz) {
        Integer minValor = raiz.Valor;
        while (raiz.izquierda != null) {
            minValor = raiz.izquierda.Valor;
            raiz = raiz.izquierda;
        }
        return minValor;
    }

    /**
     * Realiza un recorrido en inorden del árbol.
     * @return Lista con los valores del recorrido.
     */
    public ArrayList<Integer> inorder() {
        ArrayList<Integer> result = new ArrayList<>();
        inorderRec(raiz, result);
        return result;
    }

    /**
     * Método auxiliar recursivo para el recorrido en inorden.
     * @param raiz Nodo actual.
     * @param result Lista para almacenar el recorrido.
     */
    private void inorderRec(Node raiz, ArrayList<Integer> result) {
        if (raiz != null) {
            inorderRec(raiz.izquierda, result);
            result.add(raiz.Valor);
            inorderRec(raiz.derecha, result);
        }
    }

    /**
     * Realiza un recorrido en preorden del árbol.
     * @return Lista con los valores del recorrido.
     */
    public ArrayList<Integer> preorder() {
        ArrayList<Integer> result = new ArrayList<>();
        preorderRec(raiz, result);
        return result;
    }

    /**
     * Método auxiliar recursivo para el recorrido en preorden.
     * @param raiz Nodo actual.
     * @param result Lista para almacenar el recorrido.
     */
    private void preorderRec(Node raiz, ArrayList<Integer> result) {
        if (raiz != null) {
            result.add(raiz.Valor);
            preorderRec(raiz.izquierda, result);
            preorderRec(raiz.derecha, result);
        }
    }

    /**
     * Realiza un recorrido en postorden del árbol.
     * @return Lista con los valores del recorrido.
     */
    public ArrayList<Integer> postorder() {
        ArrayList<Integer> result = new ArrayList<>();
        postorderRec(raiz, result);
        return result;
    }

    /**
     * Método auxiliar recursivo para el recorrido en postorden.
     * @param raiz Nodo actual.
     * @param result Lista para almacenar el recorrido.
     */
    private void postorderRec(Node raiz, ArrayList<Integer> result) {
        if (raiz != null) {
            postorderRec(raiz.izquierda, result);
            postorderRec(raiz.derecha, result);
            result.add(raiz.Valor);
        }
    }
}
