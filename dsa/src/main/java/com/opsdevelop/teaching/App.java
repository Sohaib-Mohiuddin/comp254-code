package com.opsdevelop.teaching;

import com.opsdevelop.teaching.WeekFour.Algorithms;

public class App {
    public static void week4Runnable() {
        /*
         * Linear Search Run Times
         * 5k.json 250k ns; 10k.json 300k ns; 20k.json 2.48 ms; 50k.json ~3ms, ~4ms; 100k.json ~9.7ms
         * Run times are varying based on the system and environment.
         */
        Algorithms.linearSearch("100k", 54786);

        /*
         * Binary Search Run Times
         * 5k.json 3000 ns; 10k.json 3000 ns; 20k.json 4000 ns; 50k.json 5000 ns; 100k.json 5500 ns
         * Run times are varying based on the system and environment.
         */
        Algorithms.binarySearch("100k", 54786);

        /*
         * Merge Sort Run Times
         * 5k.json 1.2 ms; 10k.json 2.4 ms; 20k.json 4.8 ms; 50k.json 12.3 ms; 100k.json 25.6 ms
         * Run times are varying based on the system and environment.
         */
        // Algorithms.bubbleSort("20k_random");

        /*
         * Selection Sort Run Times
         * 5k.json 1.5 ms; 10k.json 3.2 ms; 20k.json 6.4 ms; 50k.json 16.8 ms; 100k.json 33.6 ms
         * Run times are varying based on the system and environment.
         */
        // Algorithms.selectionSort("20k_random");
    }

    public static void week5Runnable() {

    }
    public static void main(String[] args) {
        week4Runnable();
    }
}
