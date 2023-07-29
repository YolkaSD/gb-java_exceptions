package org.example.sem2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента, " +
                        "в который хотите записать значение 1"
        );

        try {
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt();
                arr[index] = 1;
            } else {
                System.err.println("Введено не число");
            }


        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }
    }
}
