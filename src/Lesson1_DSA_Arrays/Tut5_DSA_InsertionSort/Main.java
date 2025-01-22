package Lesson1_DSA_Arrays.Tut5_DSA_InsertionSort;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0033 hours
 */

/* Insertion Sort
    The Insertion Sort algorithm uses one part of the array to hold the sorted values, and the other part of the array to hold values that are not sorted yet.
    How it works:
        - Take the first value from the unsorted part of the array.
        - Move the value into the correct place in the sorted part of the array.
        - Go through the unsorted part of the array again as many times as there are values.
*/


/* To implement the Insertion Sort algorithm in a programming language, we need:
    - An array with values to sort.
    - An outer loop that picks a value to be sorted. For an array with n values, this outer loop skips the first value, and must run n − 1 times.
    - An inner loop that goes through the sorted part of the array, to find where to insert the value. If the value to be sorted is at index i, the sorted part of the array starts at index 0 and ends at index i − 1
    The resulting code looks like this:
*/

public class Main {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};

        int n = myArray.length;
        for (int i = 1; i < n; i++) {
            int insertIndex = i;
            int currentValue = myArray[i];
            int j = i - 1;

            while (j >= 0 && myArray[j] > currentValue) {
                myArray[j + 1] = myArray[j];
                insertIndex = j;
                j--;
            }
            myArray[insertIndex] = currentValue;
        }

        System.out.print("Sorted array: ");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}
