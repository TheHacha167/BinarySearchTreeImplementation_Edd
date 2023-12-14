package bst;

/**
 * Clase de prueba para el árbol binario de búsqueda.
 */
public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Pruebas de inserción
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Pruebas de recorrido
        System.out.println("Inorden: " + bst.inorder());
        System.out.println("Preorden: " + bst.preorder());
        System.out.println("Postorden: " + bst.postorder());

        // Pruebas de borrado
        bst.delete(20);
        bst.delete(30);
        bst.delete(50);

        // Recorrido en inorden después de borrar
        System.out.println("Inorden después de borrar: " + bst.inorder());
    }
}
