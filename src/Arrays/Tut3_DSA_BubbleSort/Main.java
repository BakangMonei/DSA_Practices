package Arrays.Tut3_DSA_BubbleSort;

/* How it works:
    Go through the array, one value at a time.
    For each value, compare the value with the next value.
    If the value is higher than the next one, swap the values so that the highest value comes last.
    Go through the array as many times as there are values in the array.
*/

/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0014 hours
 */


/* Bubble Sort Implementation
 To implement the Bubble Sort algorithm in a programming language, we need:
    An array with values to sort.
    An inner loop that goes through the array and swaps values if the first value is higher than the next value. This loop must loop through one less value each time it runs.
    An outer loop that controls how many times the inner loop must run. For an array with n values, this outer loop must run n-1 times.
    The resulting code looks like this:
*/
public class Main {
    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 12, 22, 11, 90, 5};
//        int[] my_array = {7, 12, 9, 11, 3};
        int n = my_array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (my_array[j] > my_array[j + 1]) {
                    int temp = my_array[j];
                    my_array[j] = my_array[j + 1];
                    my_array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}