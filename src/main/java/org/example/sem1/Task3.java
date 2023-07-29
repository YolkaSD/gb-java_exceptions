package org.example.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, null, 3, 5, null, null};
        System.out.println(checkArray(integers));
    }

    public static List<Integer> checkArray(Integer[] integers) {
        return IntStream.range(0, integers.length)
                .filter(i -> integers[i] == null)
                .boxed()
                .collect(Collectors.toList());
    }
}
