package Arrays.Tut10_DSA_LinearSearch;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0108 hours
 */

/* Linear Search
    - The Linear Search algorithm searches through an array and returns the index of the value it searches for.
    - If the array is already sorted, it is better to use the much faster Binary Search algorithm that we will explore on the next page.
    - A big difference between sorting algorithms and searching algorithms is that sorting algorithms modify the array, but searching algorithms leave the array unchanged.
*/

/* How it works:
    - Go through the array value by value from the start.
    - Compare each value to check if it is equal to the value we are looking for.
    - If the value is found, return the index of that value.
    - If the end of the array is reached and the value is not found, return -1 to indicate that the value was not found.
*/

/* Linear Search Implementation
    To implement the Linear Search algorithm we need:
        - An array with values to search through.
        - A target value to search for.
        - A loop that goes through the array from start to end.
        - An if-statement that compares the current value with the target value, and returns the current index if the target value is found.
        - After the loop, return -1, because at this point we know the target value has not been found.
    The resulting code for Linear Search looks like this:
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int targetVal = 9;

        int result = linearSearch(arr, targetVal);

        if (result != -1) {
            System.out.println("Value " + targetVal + " found at index " + result);
        } else {
            System.out.println("Value " + targetVal + " not found");
        }
    }

    public static int linearSearch(int[] arr, int targetVal) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetVal) {
                return i;
            }
        }
        return -1;
    }
}
