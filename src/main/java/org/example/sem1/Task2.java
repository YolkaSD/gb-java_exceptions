package org.example.sem1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        int[][] ints = new int[][] {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        System.out.println(sumElSqArr(ints));

    }

    public static int sumElSqArr(int[][] ints) {
        IntStream.range(0, ints.length)
                .forEach(x -> {
                    if (ints[x].length != ints.length) throw new RuntimeException("Array is not square");
                    IntStream.range(0, ints[x].length).
                            forEach(y -> {
                                if (ints[x][y] != 1 && ints[x][y] != 0) throw new RuntimeException("Bad value");
                            });
                });

        return  Arrays.stream(ints).flatMapToInt(Arrays::stream).sum();
    }
}
