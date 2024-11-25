import java.util.Scanner;

public class DynamicStack {
    private int[] stack;
    private int top;
    private int capacity;

    public DynamicStack(int initialCapacity) {
        stack = new int[initialCapacity];
        capacity = initialCapacity;
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            resize();
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    private void resize() {
        capacity *= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(5);
        Scanner scanner = new Scanner(System.in);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);  // Triggers resizing

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());

        scanner.close();
    }
}
