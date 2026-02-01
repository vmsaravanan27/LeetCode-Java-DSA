package dsa.stack;

public class IntArrStack {

    private final int size;
    private final int[] stack;
    private int top;

    public IntArrStack(int size) {
        this.size = size;
        this.stack = new int[this.size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == this.size - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            this.stack[++top] = data;
            System.out.println("Data added into stack: " + data);
            System.out.println("Top: " + this.top);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Data pop from stack: " + this.stack[top]);
            this.top--;
        }
    }

    static void main() {
        IntArrStack stack = new IntArrStack(3);
        stack.pop();
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
    }
}
