package com.opsdevelop.teaching;

import com.opsdevelop.teaching.Lab5Exercises.Lesson5Files.LinearSum;

public class Main {
    public static void week5Runnable() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = a.length;

        LinearSum.maxElement(a, n);
    }
    public static void main(String[] args) {
         week5Runnable();
    }
}