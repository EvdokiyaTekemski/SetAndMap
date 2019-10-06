package com.company;

import javax.security.sasl.SaslClient;
import java.util.*;

public class CitiesbyontinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> citiesCountry = new LinkedHashMap<>();
        while (num-->0){

            String [] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            citiesCountry.putIfAbsent(continent,new LinkedHashMap<>());
            citiesCountry.get(continent).putIfAbsent(country,new ArrayList<>());
            citiesCountry.get(continent).get(country).add(city);



        }



citiesCountry.forEach((first,second)->{
        System.out.println(first+":");

        second.forEach((map,list)->
                System.out.printf("%s -> %s%n", map, String.join(", ", list)));
    });
    }
}
