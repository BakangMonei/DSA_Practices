package Lesson3_DSA_StacksAndQueues.Tut1_DSA_Stacks;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0237 hours
 */

/* Stacks
    - A stack is a data structure that can hold many elements.
    - Think of a stack like a pile of pancakes.

    - In a pile of pancakes, the pancakes are both added and removed from the top. So when removing a pancake, it will always be the last pancake you added. This way of organizing elements is called LIFO: Last In First Out.

    Basic operations we can do on a stack are:
        - Push: Adds a new element on the stack.
        - Pop: Removes and returns the top element from the stack.
        - Peek: Returns the top element on the stack.
        - isEmpty: Checks if the stack is empty.
        - Size: Finds the number of elements in the stack.
    Experiment with these basic operations in the stack animation above.

    - Stacks can be implemented by using arrays or linked lists.
    - Stacks can be used to implement undo mechanisms, to revert to previous states, to create algorithms for depth-first search in graphs, or for backtracking.
    - Stacks are often mentioned together with Queues, which is a similar data structure described on the next page.
*/

/* Stack Implementation using Arrays
    To better understand the benefits with using arrays or linked lists to implement stacks, you should check out this page that explains how arrays and linked lists are stored in memory.

    Reasons to implement stacks using arrays:
        - Memory Efficient: Array elements do not hold the next elements address like linked list nodes do.
        - Easier to implement and understand: Using arrays to implement stacks require less code than using linked lists, and for this reason it is typically easier to understand as well.

    A reason for not using arrays to implement stacks:
        - Fixed size: An array occupies a fixed part of the memory. This means that it could take up more memory than needed, or if the array fills up, it cannot hold more elements.
*/

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);

        myStack.push('A');
        myStack.push('B');
        myStack.push('C');

        // Print initial stack
        System.out.print("Stack: ");
        myStack.printStack();

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("isEmpty: " + myStack.isEmpty());
        System.out.println("Size: " + myStack.size());
    }
}

class Stack {
    char[] stack;
    int top;
    int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new char[capacity];
        this.top = -1;
    }

    public void push(char element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
        }
        return stack[top--];
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return ' ';
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
