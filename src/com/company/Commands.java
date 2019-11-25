package com.company;

import java.util.Scanner;

public class Commands {

    public final static int EXIT_CMD= 2;
    public final static int HELP_CMD = 1;

    public static void help() {
        System.out.println("--------MENU--------");
        System.out.println("1 - Help");
        System.out.println("2 - Exit");
    }

    public static void exit(){

        System.out.println("Je sors!");

    }
    public static int getUserChoice() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch (choice) {
            case HELP_CMD : Commands.help();
                break;

            case EXIT_CMD : Commands.exit();
                break;

            default: Commands.help();

        }
        return choice;
    }
}
