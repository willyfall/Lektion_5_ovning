package com.william.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter name");
        String name = input.nextLine();
        System.out.println("Player #1: "+name);
        System.out.println("Enter how many times you want money to be printed:)");
        int x= input.nextInt();

        for (int i = 0; i<x; i++){
            System.out.println("$");
        }
        boolean isPlaying = true;
        do {
            System.out.println("Enter a number");
            int number = input.nextInt();
            System.out.println(number);
            System.out.println("Write 'stop' to stop game");
            String play = input.next();
            if (play.equals("stop")){
                isPlaying = false;
            }
            System.out.println("Enter 1 or 'stop' to stop");
            String row="";
            row = input.next();
            switch (row){
                case "stop": break;
                case "1":
                    System.out.println("THROWING");
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } while (isPlaying);

    }
}
