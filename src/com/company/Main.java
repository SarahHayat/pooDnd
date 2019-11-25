package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started"); //test message

        Commands.help();

        do {
            Commands.getUserChoice();
        }while(Commands.getUserChoice() != Commands.EXIT_CMD);



    }
}
