package Lesson1_DSA_Arrays.Tut6_DSA_Quicksort;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0037 hours
 */

/* Quicksort
    - As the name suggests, Quicksort is one of the fastest sorting algorithms.
    - The Quicksort algorithm takes an array of values, chooses one of the values as the 'pivot' element, and moves the other values so that lower values are on the left of the pivot element, and higher values are on the right of it.
*/

/* How it works:
    - Choose a value in the array to be the pivot element.
    - Order the rest of the array so that lower values than the pivot element are on the left, and higher values are on the right.
    - Swap the pivot element with the first element of the higher values so that the pivot element lands in between the lower and higher values.
    - Do the same operations (recursively) for the sub-arrays on the left and right side of the pivot element.
*/

/* Implementation
    To implement the Quicksort algorithm in a programming language, we need:
        - An array with values to sort.
        - A quickSort method that calls itself (recursion) if the sub-array has a size larger than 1.
        - A partition method that receives a sub-array, moves values around, swaps the pivot element into the sub-array and returns the index where the next split in sub-arrays happens.

    The resulting code looks like this:
*/

public class Main {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        quicksort(myArray, 0, myArray.length - 1);

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }

    public static void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
