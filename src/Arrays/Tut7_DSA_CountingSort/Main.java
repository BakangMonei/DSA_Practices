package Arrays.Tut7_DSA_CountingSort;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0041 hours
 */

/* Counting Sort
    - The Counting Sort algorithm sorts an array by counting the number of times each value occurs.
*/

/* How it works:
    - Create a new array for counting how many there are of the different values.
    - Go through the array that needs to be sorted.
    - For each value, count it by increasing the counting array at the corresponding index.
    - After counting the values, go through the counting array to create the sorted array.
    - For each count in the counting array, create the correct number of elements, with values that correspond to the counting array index.
*/

/* Conditions for Counting Sort
    These are the reasons why Counting Sort is said to only work for a limited range of non-negative integer values:
        - Integer values: Counting Sort relies on counting occurrences of distinct values, so they must be integers. With integers, each value fits with an index (for non negative values), and there is a limited number of different values, so that the number of possible different values k is not too big compared to the number of values n.
        - Non-negative values: Counting Sort is usually implemented by creating an array for counting. When the algorithm goes through the values to be sorted, value x is counted by increasing the counting array value at index x. If we tried sorting negative values, we would get in trouble with sorting value -3, because index -3 would be outside the counting array.
        - Limited range of values: If the number of possible different values to be sorted k is larger than the number of values to be sorted n,
        the counting array we need for sorting will be larger than the original array we have that needs sorting, and the algorithm becomes ineffective.
*/

/* Counting Sort Implementation
    To implement the Counting Sort algorithm in a programming language, we need:
        - An array with values to sort.
        - A 'countingSort' method that receives an array of integers.
        - An array inside the method to keep count of the values.
        - A loop inside the method that counts and removes values, by incrementing elements in the counting array.
        - A loop inside the method that recreates the array by using the counting array, so that the elements appear in the right order.

    One more thing: We need to find out what the highest value in the array is, so that the counting array can be created with the correct size. For example, if the highest value is 5, the counting array must be 6 elements in total, to be able count all possible non negative integers 0, 1, 2, 3, 4 and 5.
    The resulting code looks like this:
*/
public class Main {
    public static void countingSort(int[] arr) {
        int max_val = arr[0];
        for (int num : arr) {
            if (num > max_val) {
                max_val = num;
            }
        }

        int[] count = new int[max_val + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max_val; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
        countingSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}