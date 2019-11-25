package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started"); //test message

        Commands.help();
        /**
         * Menu help
         */
        while(Commands.getUserChoice() != Commands.EXIT_CMD){
            Commands.getUserChoice();
        }

        Characters char1 = new Characters("Hulk", 100, 50, 10);


        System.out.println( char1 );
    }
}
