package com.endlessmilkyway.basic_02.utils;

import java.util.Random;

public class ArrayManager {

    private static final int FIRST_INDEX = 0;
    private static final int ARRAY_LENGTH = 10;
    private static final int RAND_ARRAY_LENGTH = 30;

    public int[] createRandArray() {
        int[] randArr = new int[RAND_ARRAY_LENGTH];
        Random random = new Random();
        for (int i = FIRST_INDEX; i < RAND_ARRAY_LENGTH; i++) {
            randArr[i] = random.nextInt(100);
        }

        return randArr;
    }

    public int[] createTenLengthArray() {
        int[] arr = new int[ARRAY_LENGTH];
        for (int i = FIRST_INDEX; i < ARRAY_LENGTH; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    public int calcAvgFromValues(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }

    public void changeArrayElement(int[] arr, int idx, int num) {
        arr[idx] = num;
    }
}
