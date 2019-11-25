package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started"); //test message

        Commands.help();
        /**
         * Menu help
         */
        do {
            int ch = Commands.getUserChoice();
        }while(ch != Commands.EXIT_CMD);

        Characters char1 = new Characters("Hulk");


        System.out.println( char1 );
    }
}
