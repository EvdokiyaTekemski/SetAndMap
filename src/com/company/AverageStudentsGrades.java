package com.company;

import javax.security.sasl.SaslClient;
import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();
        while (number-- > 0) {

            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grades = Double.parseDouble(input[1]);

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
                students.get(name).add(grades);
            } else {
                students.get(name).add(grades);
            }


        }
        students.forEach((key, value) -> {
            Double grades = value.stream().mapToDouble(x -> x).average().orElse(0d);
            String formating = value.stream().map(c -> String.format("%.2f", c)).collect(Collectors.joining(" "));
            System.out.printf("%s -> %s (avg: %.2f)%n", key, formating, grades);
        });
    }
}