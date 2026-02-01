package dsa.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public int getMin() {
        return minStack.peek();
    }

    public void pop() {
        int removedData = stack.pop();
        if (!minStack.isEmpty() && removedData == minStack.peek()) {
            minStack.pop();
        }
    }

    public void push(int data) {
        stack.push(data);
        if (minStack.isEmpty() || minStack.peek() >= data) {
            minStack.push(data);
        }
    }

    public int top() {
        return stack.peek();
    }

    static void main() {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(-1);
        stack.push(2);


        stack.push(0);

        System.out.println("Min value: " + stack.getMin());

        stack.pop();

        System.out.println("Min value: " + stack.getMin());

        stack.pop();

        System.out.println("Min value: " + stack.getMin());

        stack.push(4);
        System.out.println("Min value: " + stack.getMin());
        stack.pop();
        System.out.println("Min value: " + stack.getMin());
        stack.pop();
        System.out.println("Min value: " + stack.getMin());
        stack.pop();
        System.out.println("Min value: " + stack.getMin());
    }
}
