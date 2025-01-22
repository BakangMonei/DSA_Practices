package Arrays.Tut11_DSA_BinarySearch;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0112 hours
 */

/* Binary Search
    - The Binary Search algorithm searches through an array and returns the index of the value it searches for.
    - Binary Search is much faster than Linear Search, but requires a sorted array to work.
    - The Binary Search algorithm works by checking the value in the center of the array. If the target value is lower, the next value to check is in the center of the left half of the array. This way of searching means that the search area is always half of the previous search area, and this is why the Binary Search algorithm is so fast.
    - This process of halving the search area happens until the target value is found, or until the search area of the array is empty.
*/

/* How it works:
    - Check the value in the center of the array.
    - If the target value is lower, search the left half of the array. If the target value is higher, search the right half.
    - Continue step 1 and 2 for the new reduced part of the array until the target value is found or until the search area is empty.
    - If the value is found, return the target value index. If the target value is not found, return -1.
*/

/* Binary Search Implementation
    To implement the Binary Search algorithm we need:
        - An array with values to search through.
        - A target value to search for.
        - A loop that runs as long as left index is less than, or equal to, the right index.
        - An if-statement that compares the middle value with the target value, and returns the index if the target value is found.
        - An if-statement that checks if the target value is less than, or larger than, the middle value, and updates the "left" or "right" variables to narrow down the search area.
        - After the loop, return -1, because at this point we know the target value has not been found.
    The resulting code for Binary Search looks like this:
*/

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int myTarget = 15;

        int result = binarySearch(myArray, myTarget);

        if (result != -1) {
            System.out.println("Value " + myTarget + " found at index " + result);
        } else {
            System.out.println("Target not found in array.");
        }
    }

    public static int binarySearch(int[] arr, int targetVal) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == targetVal) {
                return mid;
            }

            if (arr[mid] < targetVal) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
