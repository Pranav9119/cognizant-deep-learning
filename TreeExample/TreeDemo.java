/**
 * Demo runner for Binary Search Tree traversal algorithms.
 */
public class TreeDemo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Inserting elements: 50, 30, 20, 40, 70, 60, 80");
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder traversal:   ");
        bst.inorder(); // Should print in sorted order: 20 30 40 50 60 70 80

        System.out.print("Preorder traversal:  ");
        bst.preorder();

        System.out.print("Postorder traversal: ");
        bst.postorder();
    }
}
