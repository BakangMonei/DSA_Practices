package Arrays.Tut2_DSA_Arrays;
/*
 @Author: Monei Bakang
 @Date: 22 January 2025
 @Time: 0003 hours
 */

/* Algorithm: Find The Lowest Value in an Array
    Let's create our first algorithm using the array data structure.
    Below is the algorithm to find the lowest number in an array.

    How it works:
     - Go through the values in the array one by one.
     - Check if the current value is the lowest so far, and if it is, store it.
     - After looking at all the values, the stored value will be the lowest of all values in the array.
*/
public class Main {
    public static void main(String[] args) {
        int[] my_array = {7, 12, 9, 4, 11};
        int minVal = my_array[0];

        for (int i : my_array) {
            if (i < minVal) {
                minVal = i;
            }
        }

        System.out.println("Lowest value: " + minVal);
    }
}
