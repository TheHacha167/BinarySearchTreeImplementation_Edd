package bst;

/**
 * Clase de prueba para el árbol binario de búsqueda.
 */
public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Pruebas de inserción
        
        bst.insert(30);
        bst.insert(35);
        bst.insert(40);
        bst.insert(10);
        bst.insert(45);
        bst.insert(50);
        bst.insert(15);
        bst.insert(55);
        bst.insert(60);
        bst.insert(20);
        bst.insert(65);
        bst.insert(25);
        bst.insert(70);
        bst.insert(5);

        // Pruebas de recorrido
        System.out.println("Inorden: " + bst.inorder());
        System.out.println("Preorden: " + bst.preorder());
        System.out.println("Postorden: " + bst.postorder());

        // Pruebas de borrado
        bst.delete(10);
        bst.delete(20);
        bst.delete(30);
        bst.delete(40);
        bst.delete(50);
        bst.delete(60);
        bst.delete(70);

        // Recorrido en inorden después de borrar
        System.out.println("Inorden después de borrar: " + bst.inorder());
        System.out.println("Preorden después de borrar: " + bst.preorder());
        System.out.println("Postorden después de borrar: " + bst.postorder());

    }
}
