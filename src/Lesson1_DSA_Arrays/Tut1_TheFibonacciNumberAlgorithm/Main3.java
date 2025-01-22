package Lesson1_DSA_Arrays.Tut1_TheFibonacciNumberAlgorithm;
/*
 @Author: Monei Bakang
 @Date: 21 January 2025
 @Time: 2359 hours
 */

/* Finding The nth Fibonacci Number Using Recursion
     - To find the nth Fibonacci number we can write code based on the mathematic formula for Fibonacci number n:
         F(n) = F(n − 1) + F(n − 2)
     - This just means that for example the 10th Fibonacci number is the sum of the 9th and 8th Fibonacci numbers.
 */

public class Main3 {
    public static int F(int n) {
        if (n <= 1) {
            return n;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(F(19));
    }
}
