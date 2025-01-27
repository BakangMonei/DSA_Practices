package Lesson5_DSA_Trees.Tut3_DSA_ArrayImplementation;

/* Array Implementation of Binary Trees
    To avoid the cost of all the shifts in memory that we get from using Arrays, it is useful to implement Binary Trees with pointers from one element to the next, just like Binary Trees are implemented before this point, especially when the Binary Tree is modified often.

    But in case we read from the Binary Tree a lot more than we modify it, an Array implementation of a Binary Tree can make sense as it needs less memory, it can be easier to implement, and it can be faster for certain operations due to cache locality.
    Below is an Array implementation of the Binary Tree.
*/


public class Main {
    public static void main(String[] args) {
        Character[] binaryTreeArray = {'R', 'A', 'B', 'C', 'D', 'E', 'F', null, null, null, null, null, null, 'G'};

        int rightChild = rightChildIndex(0);
        int leftChildOfRightChild = leftChildIndex(rightChild);
        Character data = getData(binaryTreeArray, leftChildOfRightChild);

        System.out.println("root.right.left.data: " + data);
    }

    public static int leftChildIndex(int index) {
        return 2 * index + 1;
    }

    public static int rightChildIndex(int index) {
        return 2 * index + 2;
    }

    public static Character getData(Character[] binaryTreeArray, int index) {
        if (index >= 0 && index < binaryTreeArray.length) {
            return binaryTreeArray[index];
        }
        return null;
    }
}