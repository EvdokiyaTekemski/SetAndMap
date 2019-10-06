package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Set<String> unique = new LinkedHashSet<>();
        while (number-->0){
            String input = scanner.nextLine();
            unique.add(input);

        }
        unique.stream().forEach(e-> System.out.println(e));
    }
}
