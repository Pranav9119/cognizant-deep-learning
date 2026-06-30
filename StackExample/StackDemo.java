public class StackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        System.out.println("Pushing elements: 10, 20, 30, 40, 50");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Trying to push one more element (60)...");
        stack.push(60);

        System.out.println("Peek top element: " + stack.peek());

        System.out.println("Popping elements:");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Peek top element after popping: " + stack.peek());
    }
}
