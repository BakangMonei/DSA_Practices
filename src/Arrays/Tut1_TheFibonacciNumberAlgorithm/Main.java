package Arrays.Tut1_TheFibonacciNumberAlgorithm;
/*
 * @Author: Monei Bakang
 * @Date: 21 January 2025
 * @Time: 2350 hours
 */

import java.util.*;
/*Implementation Using a "FOR LOOP"
    It can be a good idea to list what the code must contain or do before programming it:
        Two variables to hold the previous two Fibonacci numbers
        A for loop that runs 18 times
        Create new Fibonacci numbers by adding the two previous ones
        Print the new Fibonacci number
        Update the variables that hold the previous two fibonacci numbers
*/


public class Main {
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to display: ");
        int count = scanner.nextInt();

        int prev2 = 0;
        int prev1 = 1;

        System.out.println(prev2);
        System.out.println(prev1);

        for (int fibo = 2; fibo < count; fibo++) {
            int newFibo = prev1 + prev2;
            System.out.println(newFibo);
            prev2 = prev1;
            prev1 = newFibo;
        }
        scanner.close();
    }
}
