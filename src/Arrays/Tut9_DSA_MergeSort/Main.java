package Arrays.Tut9_DSA_MergeSort;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0101 hours
 */

/* Merge Sort
    - The Merge Sort algorithm is a divide-and-conquer algorithm that sorts an array by first breaking it down into smaller arrays,
    and then building the array back together the correct way so that it is sorted.
    - Divide: The algorithm starts with breaking up the array into smaller and smaller pieces until one such sub-array only consists of one element.
    - Conquer: The algorithm merges the small pieces of the array back together by putting the lowest values first, resulting in a sorted array.
    - The breaking down and building up of the array to sort the array is done recursively.

    In the animation above, each time the bars are pushed down represents a recursive call, splitting the array into smaller pieces. When the bars are lifted-up, it means that two sub-arrays have been merged together.
*/

/* How it works:
    - Divide the unsorted array into two sub-arrays, half the size of the original.
    - Continue to divide the sub-arrays as long as the current piece of the array has more than one element.
    - Merge two sub-arrays together by always putting the lowest value first.
    - Keep merging until there are no sub-arrays left.
*/

/* Merge Sort Implementation
    To implement the Merge Sort algorithm we need:
        - An array with values that needs to be sorted.
        - A function that takes an array, splits it in two, and calls itself with each half of that array so that the arrays are split again and again recursively, until a sub-array only consist of one value.
        - Another function that merges the sub-arrays back together in a sorted way.
    The resulting code looks like this:
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] unsortedArr = {3, 7, 6, -10, 15, 23.5, 55, -13};
        double[] sortedArr = mergeSort(unsortedArr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }

    public static double[] mergeSort(double[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        double[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        double[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        double[] sortedLeft = mergeSort(leftHalf);
        double[] sortedRight = mergeSort(rightHalf);

        return merge(sortedLeft, sortedRight);
    }

    public static double[] merge(double[] left, double[] right) {
        double[] result = new double[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}