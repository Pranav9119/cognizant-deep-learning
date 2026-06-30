/**
 * Binary Search Tree (BST) implementation with node structure and standard recursive traversals.
 */
public class BinarySearchTree {

    private Node root;

    // Node class structure
    public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Inserts an element into the BST.
     * Time Complexity: O(log N) (average), O(N) (worst case if tree is skewed).
     * Space Complexity: O(log N) average call stack height.
     */
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    /**
     * Inorder Traversal (Left, Root, Right).
     * Yields nodes in ascending order for BST.
     * Time Complexity: O(N).
     * Space Complexity: O(H) where H is tree height.
     */
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    /**
     * Preorder Traversal (Root, Left, Right).
     * Time Complexity: O(N).
     * Space Complexity: O(H).
     */
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    /**
     * Postorder Traversal (Left, Right, Root).
     * Time Complexity: O(N).
     * Space Complexity: O(H).
     */
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
