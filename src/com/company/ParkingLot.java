package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.security.sasl.SaslClient;
import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Set<String> parking = new HashSet<>();
        String input="";
        while (!"END".equals(input=scanner.nextLine())){
            String [] data = input.split(", ");
if(data[0].equals("IN")){
    parking.add(data[1]);
}else if(data[0].equals("OUT")){
    parking.remove(data[1]);
}
        }

        System.out.println(parking.isEmpty()? "Parking Lot is Empty":String.join(System.lineSeparator(),parking));
    }
}
