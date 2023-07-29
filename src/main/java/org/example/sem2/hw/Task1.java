package org.example.sem2.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (true) {
            System.out.println("Введите дробное число");
            line = scanner.nextLine();

            try {
                System.out.println(Double.parseDouble(line));
            } catch (NumberFormatException e) {
                System.err.println("Неверные данные");
            }

        }
    }
}
