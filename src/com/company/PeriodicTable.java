package com.company;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Set<String> name = new TreeSet<>();
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <number ; i++) {
            String [] inpur = scanner.nextLine().split(" ");
            for (int j = 0; j <inpur.length ; j++) {
                String data = inpur[j];
                name.add(data);


            }

        }
        name.forEach(e-> System.out.print(e + " "));
    }
}
