package com.company;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Character,Integer> symbol = new TreeMap<>();
        String input = scanner.nextLine();
        int startNum = 1;
        for (int i = 0; i <input.length(); i++) {
                char c =input.charAt(i);
                if(!symbol.containsKey(c)){
                    symbol.put(c,startNum);
                }else {
                    symbol.put(c,symbol.get(c)+1);
                }
            }
        symbol.forEach((key,value)-> System.out.printf("%c: %d time/s%n",key,value));
        }

    }

