package com.company;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> grades = new LinkedHashMap<>();

        for (double value : input) {
            if(!grades.containsKey(value)){
                grades.put(value,1);
            }else {
                grades.put(value,grades.get(value)+1);
            }

        }
        grades.entrySet().stream().forEach(e-> System.out.println(e.getKey() + " -> " + e.getValue() ));

    }

}
