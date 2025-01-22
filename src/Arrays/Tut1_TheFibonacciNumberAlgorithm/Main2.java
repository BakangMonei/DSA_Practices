package Arrays.Tut1_TheFibonacciNumberAlgorithm;
/*
  @Author: Monei Bakang
 * @Date: 21 January 2025
 * @Time: 2355 hours
 */

/* Implementation Using "Recursion" is when a function calls itself.
    To implement the Fibonacci algorithm we need most of the same things as in the code example above,but we need to replace the for loop with recursion.
        - To replace the for loop with recursion, we need to encapsulate much of the code in a function, and we need the function to call itself to create a new
        - Fibonacci number as long as the produced number of Fibonacci numbers is below, or equal to, 19.
*/


import java.util.Scanner;

public class Main2 {
    static int count = 2;

    public static void fibonacci(int prev1, int prev2, int limit) {
        if (count < limit) {
            int newFibo = prev1 + prev2;
            System.out.println(newFibo);
            prev2 = prev1;
            prev1 = newFibo;
            count += 1;
            fibonacci(prev1, prev2, limit);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to display: ");
        int limit = scanner.nextInt();

        if (limit < 2) {
            System.out.println("Please enter a number greater than or equal to 2.");
            return;
        }
        System.out.println(0);
        System.out.println(1);

        fibonacci(1, 0, limit);

        scanner.close();
    }
}
