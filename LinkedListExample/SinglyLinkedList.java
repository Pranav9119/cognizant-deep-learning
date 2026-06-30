/**
 * Singly Linked List implementation with Node structure, insertion, deletion, and traversal operations.
 */
public class SinglyLinkedList {

    // Head node of the list
    private Node head;

    // Node class structure
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Inserts an element at the beginning (head) of the list.
     * Time Complexity: O(1).
     * Space Complexity: O(1).
     */
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Inserts an element at the end (tail) of the list.
     * Time Complexity: O(N).
     * Space Complexity: O(1).
     */
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * Deletes the first occurrence of a value.
     * Time Complexity: O(N).
     * Space Complexity: O(1).
     */
    public void deleteValue(int value) {
        if (head == null) return;

        // If head node itself holds the value to be deleted
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node temp = head;
        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }

        // If value was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    /**
     * Traversal / Display elements of the list.
     * Time Complexity: O(N).
     * Space Complexity: O(1).
     */
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
