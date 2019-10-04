package com.company;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input="";
        TreeSet vipGuest = new TreeSet();
       TreeSet<String> regularGuest = new TreeSet<>();
        while (!"PARTY".equals(input=scanner.nextLine())){
            if(Character.isDigit(input.charAt(0)))
             vipGuest.add(input);
            else
                regularGuest.add(input);


        }
while (!"END".equals(input=scanner.nextLine())){
    if(vipGuest.contains(input)){
        vipGuest.remove(input);
    }else if(regularGuest.contains(input)){
        regularGuest.remove(input);
    }else{
        return;
    }
}
int sum = vipGuest.size()+regularGuest.size();
        System.out.println(sum + System.lineSeparator());
                vipGuest.forEach(System.out::println);


    }
}
