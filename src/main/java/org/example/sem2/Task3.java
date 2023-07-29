package org.example.sem2;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    private static final List<String> names = List.of
            ("Анна=4", "Елена=5", "Марина=6", "Полина=6", "Владимир=?", "Константин=?", "Иван=4");

    public static void main(String[] args) {
//        write(names, "src/main/resources/test.txt");
        System.out.println(read("src/main/resources/test.txt"));
    }

    public static void write(List<String> names, String path) {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file)) {
            for (String name : names) {
                writer.write(name + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Integer> read(String path) {
        File file = new File(path);
        Map<String, Integer> names = new LinkedHashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] array = line.split("=");
                String name = array[0];
                String temp = array[1];
                int number;
                if (temp.equals("?")) {
                    number = name.length();
                } else {
                    number = Integer.parseInt(temp);
                }
                names.put(name, number);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return names;
    }
}
