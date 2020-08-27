package stack;

class Stack {
    private int[] stackArray;
    private int stackSize;
    private int top;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = new int[this.stackSize];
        top = -1;
    }

    public void push(int item) {
        if(top == this.stackSize - 1) {
            System.out.println("Stack is full");
            System.exit(0);
        } else {
            stackArray[++top] = item;
        }
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -99;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -99;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackSize - 1);
    }
}

public class stackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top value: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Removed: " + stack.pop());
        }
    }
}
