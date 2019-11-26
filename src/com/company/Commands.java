package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Commands {

    public final static int EXIT_CMD= 2;
    public final static int HELP_CMD = 1;
    public final static int CREATE_CHAR = 3;
    public final static int LIST_CHAR = 4;

  // ArrayList<Characters> characterList = new ArrayList<Characters>();

    public static void help() { //Function which allow to display a menu with options
        System.out.println("-------- MENU --------");
        System.out.println("1 - Help");// Display a list of commands
        System.out.println("2 - Exit");
        System.out.println("3 - Create Character");
        System.out.println("4 - List Character");

    }

    public static void exit(){

        System.out.println("Je sors!");

    }



    public static void createChar(ArrayList characterList){ //Function which allow to create a character

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
        //System.out.println(char1.toString());
        characterList.add(char1);



    }

    public static void listChar(ArrayList characterList){


        System.out.println(characterList);
    }

    public static void launchFight(){


    }
    
    public static int getUserChoice() { // Function which allows to display a list of commands if the user didn't write correctly a command
        System.out.println("Enter Command");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    public static void executeUserChoice(int c, ArrayList characterList){

            switch (c) { //list  of commands
                case HELP_CMD:
                    Commands.help();
                    break;

                case EXIT_CMD:
                    Commands.exit();
                    break;

            case LAUNCH_FIGHT : Commands.launchFight;
                break;
                case CREATE_CHAR:
                    Commands.createChar(characterList);
                    break;
                case LIST_CHAR:
                    Commands.listChar(characterList);
                    break;

                default:
                    Commands.help();

            }
        }



    }



