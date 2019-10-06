package com.company;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> averageGrades = new TreeMap<>();

        while (number-->0){

            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            averageGrades.putIfAbsent(name,new ArrayList<>());
            for (int g = 0; g <grades.length ; g++) {
                averageGrades.get(name).add(grades[g]);

            }


        }
        averageGrades.forEach((first,second)->{
            double result = second.stream().mapToDouble(x->x).average().orElse(0d);
            System.out.printf("%s is graduated with %f%n",first,result);
        });

    }
}
