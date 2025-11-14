package com.opsdevelop.teaching.Lab5Exercises.Lesson5Files;/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

// import time
import java.time.*;

/**
 * Demonstration of recursive method for reversing an array's elements.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class ArrayReverse {

  /** Reverses the contents of subarray data[low] through data[high] inclusive. */
  public static void reverseArray(int[] data, int low, int high) {
    if (low < high) {                         // if at least two elements in subarray
      int temp = data[low];                   // swap data[low] and data[high]
      data[low] = data[high];
      data[high] = temp;
      reverseArray(data, low + 1, high - 1);  // recur on the rest
    }
  }

  /** Reverses the contents of the given array. */
  public static void reverseIterative(int[] data) {
    int low = 0, high = data.length - 1;
    while (low < high) {                   // swap data[low] and data[high]
      int temp = data[low];
      data[low++] = data[high];            // post-increment of low
      data[high--] = temp;                 // post-decrement of high
    }
  }

  // Main method to run experimental analysis on the two methods
  public static void main(String[] args) {

    for (int limit = 1000; limit < 100000; limit += 1000) {
      int[] data = new int[limit];
      for (int k = 0; k < limit; k++)
        data[k] = k + 1;

      // Test recursive method
      long startTime = System.currentTimeMillis();
      reverseArray(data, 0, limit - 1);
      long endTime = System.currentTimeMillis();
      long durationRecursive = endTime - startTime;
      System.out.println("Recursive reverse for n=" + limit + " took " + durationRecursive + " currentTimeMillis.");

      // Test iterative method
      long startTimeIter = System.currentTimeMillis();
      reverseIterative(data);
      long endTimeIter = System.currentTimeMillis();
      long durationIterative = endTimeIter - startTimeIter;
      System.out.println("Iterative reverse for n=" + limit + " took " + durationIterative + " currentTimeMillis.");
    }
  }

}
