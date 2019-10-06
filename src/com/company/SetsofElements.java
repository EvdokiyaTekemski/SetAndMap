package com.company;

import javax.security.sasl.SaslClient;
import java.util.*;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstNumber = new HashSet<>();
Set<Integer> secondNumber  = new HashSet<>();
        int firstSet = scanner.nextInt();
        int secondSet = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <firstSet ; i++) {
            firstNumber.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i <secondSet ; i++) {
            secondNumber.add(Integer.parseInt(scanner.nextLine()));
        }


        for (int i = 0; i <firstSet ; i++) {
            int number1 =firstNumber.iterator().next();
                    firstNumber.remove(number1);
            firstNumber.add(number1);
            for (int j = 0; j <secondSet ; j++) {
                int number2 = secondNumber.iterator().next();
                        secondNumber.remove(number2);
                secondNumber.add(number2);
                if(number1==number2){
                    System.out.print(number1 + " ");
                }
            }

        }

    }
}
