/**
 * Array-based implementation of a Queue (FIFO: First In First Out).
 */
public class ArrayQueue {
    private final int[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    /**
     * Enqueue / Insert element at the rear of the queue.
     * Time Complexity: O(1).
     * Space Complexity: O(1).
     */
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Circular array step
        queue[rear] = value;
        size++;
    }

    /**
     * Dequeue / Remove and return the front element of the queue.
     * Time Complexity: O(1).
     * Space Complexity: O(1).
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty.");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity; // Circular array step
        size--;
        return value;
    }

    /**
     * Traversal / Display elements of the queue.
     * Time Complexity: O(N) where N is the current size of the queue.
     * Space Complexity: O(1).
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
