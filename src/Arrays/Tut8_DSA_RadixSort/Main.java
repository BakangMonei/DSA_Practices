package Arrays.Tut8_DSA_RadixSort;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0046 hours
 */

/* Radix Sort
    - The Radix Sort algorithm sorts an array by individual digits, starting with the least significant digit (the rightmost one).
    - The radix (or base) is the number of unique digits in a number system. In the decimal system we normally use, there are 10 different digits from 0 till 9.
    - Radix Sort uses the radix so that decimal values are put into 10 different buckets (or containers) corresponding to the digit that is in focus, then put back into the array before moving on to the next digit.
    - Radix Sort is a non-comparative algorithm that only works with non-negative integers.
*/

/* How it works:
    - Start with the least significant digit (rightmost digit).
    - Sort the values based on the digit in focus by first putting the values in the correct bucket based on the digit in focus, and then put them back into array in the correct order.
    - Move to the next digit, and sort again, like in the step above, until there are no digits left.
*/

/* Stable Sorting
    - Radix Sort must sort the elements in a stable way for the result to be sorted correctly.
    - A stable sorting algorithm is an algorithm that keeps the order of elements with the same value before and after the sorting. Let's say we have two elements "K" and "L", where "K" comes before "L", and they both have value "3". A sorting algorithm is considered stable if element "K" still comes before "L" after the array is sorted.
    - It makes little sense to talk about stable sorting algorithms for the previous algorithms we have looked at individually, because the result would be same if they are stable or not. But it is important for Radix Sort that the the sorting is done in a stable way because the elements are sorted by just one digit at a time.
    - So after sorting the elements on the least significant digit and moving to the next digit, it is important to not destroy the sorting work that has already been done on the previous digit position, and that is why we need to take care that Radix Sort does the sorting on each digit position in a stable way.
*/

/* Radix Sort Implementation
    To implement the Radix Sort algorithm we need:
        - An array with non-negative integers that needs to be sorted.
        - A two-dimensional array with index 0 to 9 to hold values with the current radix in focus.
        - A loop that takes values from the unsorted array and places them in the correct position in the two-dimensional radix array.
        - A loop that puts values back into the initial array from the radix array.
        - An outer loop that runs as many times as there are digits in the highest value.
    The resulting code looks like this:
*/

public class Main {
    public static void main(String[] args) {
        int[] myArray = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.print("Original array: ");
        for (int val : myArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        int[][] radixArray = new int[10][myArray.length];
        int[] counts = new int[10];
        int maxVal = findMax(myArray);
        int exp = 1;

        while (maxVal / exp > 0) {
            for (int val : myArray) {
                int radixIndex = (val / exp) % 10;
                radixArray[radixIndex][counts[radixIndex]] = val;
                counts[radixIndex]++;
            }

            int pos = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < counts[i]; j++) {
                    myArray[pos] = radixArray[i][j];
                    pos++;
                }
                counts[i] = 0;
            }

            exp *= 10;
        }

        System.out.print("Sorted array: ");
        for (int val : myArray) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
