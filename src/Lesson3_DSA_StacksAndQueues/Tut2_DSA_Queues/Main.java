package Lesson3_DSA_StacksAndQueues.Tut2_DSA_Queues;

/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0238 hours
 */
import java.util.*;

/* Queues
    - A queue is a data structure that can hold many elements.
    - Think of a queue as people standing in line in a supermarket.
    - The first person to stand in line is also the first who can pay and leave the supermarket. This way of organizing elements is called FIFO: First In First Out.

    Basic operations we can do on a queue are:
        - Enqueue: Adds a new element to the queue.
        - Dequeue: Removes and returns the first (front) element from the queue.
        - Peek: Returns the first element in the queue.
        - isEmpty: Checks if the queue is empty.
        - Size: Finds the number of elements in the queue.
        - Experiment with these basic operations in the queue animation above.

    - Queues can be implemented by using arrays or linked lists.
    - Queues can be used to implement job scheduling for an office printer, order processing for e-tickets, or to create algorithms for breadth-first search in graphs.
    NB:Queues are often mentioned together with Stacks, which is a similar data structure described on the Code.
*/


/* Queue Implementation using Arrays
    To better understand the benefits with using arrays or linked lists to implement queues, you should check out this page that explains how arrays and linked lists are stored in memory.

    Reasons to implement queues using arrays:
        - Memory Efficient: Array elements do not hold the next elements address like linked list nodes do.
        - Easier to implement and understand: Using arrays to implement queues require less code than using linked lists, and for this reason it is typically easier to understand as well.

    Reasons for not using arrays to implement queues:
        - Fixed size: An array occupies a fixed part of the memory. This means that it could take up more memory than needed, or if the array fills up, it cannot hold more elements. And resizing an array can be costly.
        - Shifting cost: Dequeue causes the first element in a queue to be removed, and the other elements must be shifted to take the removed elements' place. This is inefficient and can cause problems, especially if the queue is long.
        - Alternatives: Some programming languages have built-in data structures optimized for queue operations that are better than using arrays.
*/

public class Main {
    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("Queue: " + queue);

        // Dequeue
        String element = queue.poll();  // Removes the head of the queue
        System.out.println("Dequeue: " + element);

        // Peek
        String frontElement = queue.peek();  // Gets the head of the queue without removing it
        System.out.println("Peek: " + frontElement);

        // isEmpty
        boolean isEmpty = queue.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // Size
        System.out.println("Size: " + queue.size());
    }
}

