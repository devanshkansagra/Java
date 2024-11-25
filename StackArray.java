class Stack {
    int top;
    int[] arr;
    int size;
    Stack(int size) {
        top = -1;
        arr = new int[size];
        this.size = size;
    }

    void push(int data) {
        if(top == size-1) {
            System.out.println("Stack Overflow");
        }
        else {
            arr[++top] = data;
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Popped Element: "+arr[top--]);
        }
    }

    void print() {
        for(int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackArray {
    public static void main(String[] args) {
        Stack s = new Stack(5);    
        for(int i = 1; i <= 5; i++) {
            s.push(i);
        }
        s.print();

        s.pop();
        s.print();
    }
}
