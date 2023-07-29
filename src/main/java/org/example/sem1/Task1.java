package org.example.sem1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 7};
        System.out.println(getArrayEl(ints, 3, 12));
    }

    public static int getArrayEl(int[] array, int size, int target) {
        if (array == null) {
            return -3;
        }

        if (array.length < size) {
            return -1;
        }

        return IntStream.range(0, array.length)
                .filter(i -> array[i] == target)
                .findFirst()
                .orElse(-2);

    }
}
