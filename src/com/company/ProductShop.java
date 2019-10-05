package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        Map<String, Map<String, Double>> shop = new TreeMap<>();
        while (!"Revision".equals(input = scanner.nextLine())) {

            String[] d = input.split(", ");
            String name = d[0];
            String product = d[1];
            double price = Double.parseDouble(d[2]);

            shop.putIfAbsent(name, new LinkedHashMap<>());
            shop.get(name).putIfAbsent(product, price);


        }
        shop.forEach((e, a) -> {
            System.out.println(e + "->");
            a.forEach((productName, productPrice) -> {
                System.out.printf("Product: %s, Price: %.1f%n", productName, productPrice);
            });


        });
    }
}
