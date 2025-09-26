package com.opsdevelop.teaching.WeekThree;

public class CloneListRunnable {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 } };

        CloneArray.shallowCloneArray(arr);
        CloneArray.deepCloneArray(arr);
        CloneArray.multiDimensionalArrayDeepClone(arr2D);
    }
}
