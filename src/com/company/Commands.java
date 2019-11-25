package com.company;

import java.util.Scanner;

public class Commands {

    public final static int EXIT_CMD= 2;
    public final static int HELP_CMD = 1;
    public final static int CREATE_CHAR = 3;

    public static void help() { //Function which allow to display a menu with options
        System.out.println("-------- MENU --------");
        System.out.println("1 - Help");// Display a list of commands
        System.out.println("2 - Exit");
        System.out.println("3 - Create Character");
    }

    public static void exit(){

        System.out.println("Je sors!");

    }

    public static void createChar(){ //Function which allow to create a character
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");//add a name
        String newName = sc.nextLine();
        System.out.println("Enter the MaxLife : ");//add a max number of life
        int maxLife = sc.nextInt();
        System.out.println("Enter the damage : ");//add a damage number
        int damage = sc.nextInt();
        System.out.println("Enter the initiative : ");//add a initiative number
        int initiative = sc.nextInt();

        Characters char1 = new Characters(newName, maxLife, damage, initiative);
        System.out.println(char1.toString());

    }
    
    public static int getUserChoice() { // Function which allows to display a list of commands if the user didn't write correctly a command
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch (choice) { //list  of commands
            case HELP_CMD : Commands.help();
                break;

            case EXIT_CMD : Commands.exit();
                break;

            case CREATE_CHAR : Commands.createChar();
                break;

            default: Commands.help();

        }
        return choice;


    }


}
