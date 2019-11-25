package com.company;

import java.util.Scanner;

public class Commands {

    public final static int EXIT_CMD= 2;
    public final static int HELP_CMD = 1;
    public final static int CREATE_CHAR = 3;

    public static void help() { //Function which allow to display a menu with two buttons, one
        System.out.println("-------- MENU --------");
        System.out.println("1 - Help");
        System.out.println("2 - Exit");
        System.out.println("3 - Create Character");
    }

    public static void exit(){

        System.out.println("Je sors!");

    }

    public static void createChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String newName = sc.nextLine();
        System.out.println("Enter the MaxLife : ");
        int maxLife = sc.nextInt();
        System.out.println("Enter the damage : ");
        int damage = sc.nextInt();
        System.out.println("Enter the initiative : ");
        int initiative = sc.nextInt();

        Characters char1 = new Characters(newName, maxLife, damage, initiative);
        System.out.println(char1.toString());

    }
    
    public static int getUserChoice() { // Function which allows to display a list of commands if the user didn't write correctly a command
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        switch (choice) {
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
