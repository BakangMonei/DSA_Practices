package Lesson1_DSA_Arrays.Tut9_DSA_MergeSort;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0106 hours
 */

/* Merge Sort without Recursion
    - Since Merge Sort is a divide and conquer algorithm, recursion is the most intuitive code to use for implementation. The recursive implementation of Merge Sort is also perhaps easier to understand, and uses less code lines in general.
    - But Merge Sort can also be implemented without the use of recursion, so that there is no function calling itself.
    - Take a look at the Merge Sort implementation below, that does not use recursion:
*/

import java.util.*;

public class Main2 {
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

    public static double[] mergeSort(double[] arr) {
        int step = 1;
        int length = arr.length;

        while (step < length) {
            for (int i = 0; i < length; i += 2 * step) {
                int mid = Math.min(i + step, length);
                int end = Math.min(i + 2 * step, length);

                double[] left = Arrays.copyOfRange(arr, i, mid);
                double[] right = Arrays.copyOfRange(arr, mid, end);

                double[] merged = merge(left, right);

                System.arraycopy(merged, 0, arr, i, merged.length);
            }
            step *= 2;
        }

        return arr;
    }

    public static void main(String[] args) {
        double[] unsortedArr = {3, 7, 6, -10, 15, 23.5, 55, -13};
        double[] sortedArr = mergeSort(unsortedArr);

        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}