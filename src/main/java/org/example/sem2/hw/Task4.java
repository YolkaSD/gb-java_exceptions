package org.example.sem2.hw;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (true) {
            System.out.println("Нельзя вводить пустые строки");
            line = scanner.nextLine();

            if (line.isEmpty()) {
                try {
                    throw new Exception("Нельзя вводить пустые строки!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(line);
            }

        }
    }
}
