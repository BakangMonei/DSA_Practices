package Arrays.Tut4_DSA_SelectionSort;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0020 hours
 */

/* Selection Sort
    The Selection Sort algorithm finds the lowest value in an array and moves it to the front of the array.
    How it works:
        Go through the array to find the lowest value.
        Move the lowest value to the front of the unsorted part of the array.
        Go through the array again as many times as there are values in the array.
*/

/* Selection Sort Implementation
    To implement the Selection Sort algorithm in a programming language, we need:
        An array with values to sort.
        An inner loop that goes through the array, finds the lowest value, and moves it to the front of the array. This loop must loop through one less value each time it runs.
        An outer loop that controls how many times the inner loop must run. For an array with n values, this outer loop must run n − 1 times.
    The resulting code looks like this:
*/


public class Main {
    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 5, 22, 11, 90, 12};
        int n = my_array.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (my_array[j] < my_array[min_index]) {
                    min_index = j;
                }
            }
            int min_value = my_array[min_index];
            for (int k = min_index; k > i; k--) {
                my_array[k] = my_array[k - 1];
            }
            my_array[i] = min_value;
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}
