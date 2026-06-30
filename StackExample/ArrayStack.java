/**
 * Array-based implementation of a Stack (LIFO: Last In First Out).
 */
public class ArrayStack {
    private final int[] stack;
    private int top;
    private final int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    /**
     * Push element onto the top of the stack.
     * Time Complexity: O(1).
     * Space Complexity: O(1).
     */
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    /**
     * Pop / Remove and return the top element of the stack.
     * Time Complexity: O(1).
     * Space Complexity: O(1).
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        return stack[top--];
    }

    /**
     * Peek / Return top element without removing it.
     * Time Complexity: O(1).
     * Space Complexity: O(1).
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
