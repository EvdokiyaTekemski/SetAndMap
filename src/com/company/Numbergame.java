package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" ")).
             //   map(Integer::parseInt).collect(Collectors.toSet());

       // Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
              //  .collect(Collectors.toSet());
        int [] firstInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] secondInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();

        for (int i = 0; i <firstInput.length ; i++) {
            firstPlayer.add(firstInput[i]);
        }

        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();

        for (int i = 0; i <secondInput.length ; i++) {
            secondPlayer.add(secondInput[i]);
        }

        for (int i = 0; i <= 50; i++) {
            if ((firstPlayer.isEmpty() || secondPlayer.isEmpty())) {
                break;
            }
            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);
            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            } else if (firstNumber < secondNumber) {
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }else {
                firstPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }


        }
        if(firstPlayer.isEmpty()||secondPlayer.isEmpty()){
            System.out.println("Draw");
        }else if (firstPlayer.size() < secondPlayer.size()) {
                System.out.println("Second player win!");

            } else if (secondPlayer.size() < firstPlayer.size()) {
                System.out.println("First player win!");

            }else if(firstPlayer.size()==secondPlayer.size()){
            System.out.println("Draw");
        }
        }
    }
