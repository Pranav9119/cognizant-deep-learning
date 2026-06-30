public class LinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("Inserting elements...");
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtTail(30);

        System.out.print("List elements: ");
        list.traverse();

        System.out.println("Deleting element 20...");
        list.deleteValue(20);

        System.out.print("After deletion: ");
        list.traverse();

        System.out.println("Deleting head element (5)...");
        list.deleteValue(5);

        System.out.print("After deleting head: ");
        list.traverse();
    }
}
