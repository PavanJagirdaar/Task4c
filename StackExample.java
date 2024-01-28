package task4e;

import java.util.EmptyStackException;

class IntStack {
    private int[] stackArray;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public IntStack() {
        stackArray = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public IntStack(int capacity) {
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == stackArray.length - 1) {
            // Stack is full, need to resize
            resizeStack();
        }
        stackArray[++top] = element;
        System.out.println("Pushed: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void resizeStack() {
        int newCapacity = stackArray.length * 2;
        int[] newStackArray = new int[newCapacity];
        System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);
        stackArray = newStackArray;
    }
}

public class StackExample {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();

        // Uncomment the following lines to test empty stack pop
        /*
        stack.pop();
        */
    }
}
