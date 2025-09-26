package com.opsdevelop.teaching.Lab5Exercises.Lesson5Files;

/*
 * Let a be an array of integers. The length of array is n. Using the same
 * technique as the one used in linearSum algorithm from Lesson5Examples, write a
 * Java method maxElement, that uses a recursive algorithm to find the maximum
 * element in a. Feel free to use Math.max function from Math class.
 * Visualize the call stack of the maxElement method as described in exercise 1.
 */

public class LinearSum {
    public static void maxElement(int[] a, int n) {
        if (n == 1) {
            System.out.println("Base case reached with element: " + a[0]);
            return; // Base case: only one element
        } else {
            maxElement(a, n - 1); // Recursive call
            System.out.println("Current max after processing " + n + " elements: " + Math.max(a[n - 1], a[n - 2]));
        }
    }
}
