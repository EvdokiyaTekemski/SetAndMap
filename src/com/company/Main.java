package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Client{
        String name;
        int age;
        int cents;
        public  Client(String name,int age,int cents){

            this.name = name;
            this.age = age;
            this.cents = cents;
        }

        public String getName(){
            return this.name;

        }

        @Override
        public String toString() {
            return String.format("%s %d %d%n", name,age,cents);

        }
    }


    public static <HashMapM> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      List<Client> clients = new ArrayList<>();

      String name = scanner.nextLine();
      int age = scanner.nextInt();
      int cents = scanner.nextInt();

      Client client = new Client(name,age,cents);
      client.name=name;
      client.age = age;
      client.cents=cents;

      clients.add(client);


      int minAge = scanner.nextInt();
        for (Client client1 : clients) {
            if(client.age>=minAge){
                System.out.printf
                        ("%s %d %d%n", client.name,client.age,client.cents);
            }
            
        }


    }
}
