package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started"); //test message

        Commands.help();
        /**
         * Menu help
         */
        while(Commands.getUserChoice() != Commands.EXIT_CMD){  //loop while, if the user didn't write correctly a command, display a list of commands (à modifier)
            Commands.getUserChoice();
        }
       // Characters chara = new Characters("Carlos", 100, 50, 20);






    }
}
