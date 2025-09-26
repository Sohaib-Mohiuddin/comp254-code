package com.opsdevelop.teaching.Lab4Exercises.Lesson4Files;/*
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


/**
 * Demonstration of algorithm for finding a given value within an array.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class ArrayFind {

  /** Returns index j such that data[j] == val, or -1 if no such element. */
  public static int arrayFind(int[] data, int val) {
    int n = data.length;
    int j = 0;
    while (j < n) { // val is not equal to any of the first j elements of data
      if (data[j] == val) // 0 - n
        return j;                    // a match was found at index j
      j++;                           // continue to next index
      // val is not equal to any of the first j elements of data
    }
    return -1;                       // if we reach this, no match found
  }

  public static void main(String[] args) {
      int[] data = {1, 3, 5, 7, 9};
      int valToFind = 5;
      int index = arrayFind(data, valToFind);
      if (index != -1) {
          System.out.println("Value " + valToFind + " found at index: " + index); // Output: Value 5 found at index: 2
      } else {
          System.out.println("Value " + valToFind + " not found in the array.");
      }
  }
}
