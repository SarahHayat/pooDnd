package com.company;

import java.util.Arrays;
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






    }
}
