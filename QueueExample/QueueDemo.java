/**
 * Demo runner for ArrayQueue.
 */
public class QueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println("Enqueueing elements: 10, 20, 30, 40");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        System.out.println("Dequeuing elements...");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.display();

        System.out.println("Enqueueing elements: 50, 60, 70");
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();
    }
}
