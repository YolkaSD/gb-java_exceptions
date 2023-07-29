package org.example.sem2.hw;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Arrays.fill(intArray, 1);

        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
