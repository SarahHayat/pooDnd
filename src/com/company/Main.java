package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started"); //test message

        Commands.help();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


          switch (choice) {
                case 1 : Commands.help();
                         break;

                case 2 : Commands.exit();
                         break;

                default: Commands.help();

        } while (choice != 2 );

    }
}
