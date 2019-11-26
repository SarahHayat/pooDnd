package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {


    public final static int HELP_CMD = 1;
    public final static int EXIT_CMD= 2;
    public final static int CREATE_CHAR = 3;
    public final static int LIST_CHAR = 4;
    public final static int SHOW_CHAR = 5;
    public final static int LAUNCH_FIGHT = 6;
    public final static int DELETE_CHAR = 7;

  // ArrayList<Characters> characterList = new ArrayList<Characters>();

    public static void help() { //Function which allow to display a menu with options
        System.out.println("-------- MENU --------");
        System.out.println("1 - Help");// Display a list of commands
        System.out.println("2 - Exit");
        System.out.println("3 - Create Character");
        System.out.println("4 - List Character");
        System.out.println("5 - Show Info");
        System.out.println("6 - Fight");
        System.out.println("7 - Delete Character");


    }

    public static void exit(){

        System.out.println("Je sors!");

    }



    public static void createChar(List<Characters> characterList){ //Function which allow to create a character

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

    public static void deleteChar (List<Characters> characterList) {

        System.out.println("Please select Character :");
        Scanner scan = new Scanner(System.in);

        try {
            int characterListID = scan.nextInt();
            Characters charactersListID = characterList.get(characterListID - 1);
            System.out.println("Are you sure to delete this character");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int answer = scan.nextInt();
            if (answer == 1){
                characterList.remove(characterListID);

            }else if (answer == 0){

            }
        }
        catch (Exception e){
            System.out.println("Error, This character doesn't exist. Please try again");


        }


    }

    public static void listChar(List<Characters> characterList){
    int i = 0;
    for (Characters character : characterList){
        i++;
        System.out.println("Character " + i + " : " + character.getName() + "\n" );

    }

    }

    public static void showInfoChar(List<Characters> characterList){
        System.out.println("Please select Character :");
        Scanner scan = new Scanner(System.in);
        int choice;
        try {
            choice = scan.nextInt();
            System.out.println(characterList.get(choice-1));
        }
        catch (Exception e){
            System.out.println("Error, please try again ");
            choice = scan.nextInt();
            System.out.println(characterList.get(choice-1));
        }




    }

    public static void launchFight(List<Characters> characterList) {
        int round = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first character id : ");//add a max number of life
        int firstCharacterID = sc.nextInt();

        System.out.println("Enter the second character id : ");//add a max number of life
        int secondCharacterID = sc.nextInt();

        Characters firstCharacter = characterList.get(firstCharacterID - 1);
        System.out.println("The first fighter is : " + firstCharacter.getName());
        Characters secondCharacter = characterList.get(secondCharacterID - 1);
        System.out.println("The second fighter is : " + secondCharacter.getName());

        if (firstCharacter.getInitiative() < secondCharacter.getInitiative()) {
            while (firstCharacter.getCurrentLifePoints() > 0 && secondCharacter.getCurrentLifePoints() > 0) {
                System.out.println("Actual Life Points of " + firstCharacter.getName() + " : " + firstCharacter.getCurrentLifePoints());
                firstCharacter.inflictDamage(secondCharacter.getDamage());
                System.out.println("Actual Life Points of " + secondCharacter.getName() + " : " + secondCharacter.getCurrentLifePoints());
                secondCharacter.inflictDamage(firstCharacter.getDamage());

                round++;

                System.out.println("ROUND " + round);

                System.out.println("Life Points of " + firstCharacter.getName() + " : " + firstCharacter.getCurrentLifePoints());
                System.out.println("Damage infliged by "+ firstCharacter.getName() + ": " + firstCharacter.getDamage());

                System.out.println("Life Points of " + secondCharacter.getName() + " : " + secondCharacter.getCurrentLifePoints());
                System.out.println("Damage infliged by "+ secondCharacter.getName() + ": " + secondCharacter.getDamage());


            }
        } else {
            while (firstCharacter.getCurrentLifePoints() > 0 && secondCharacter.getCurrentLifePoints() > 0) {
                System.out.println("Actual Life Points of " + secondCharacter.getName() + " : " + secondCharacter.getCurrentLifePoints());
                secondCharacter.inflictDamage(secondCharacter.getDamage());
                System.out.println("Actual Life Points of " + firstCharacter.getName() + " : " + firstCharacter.getCurrentLifePoints());
                firstCharacter.inflictDamage(firstCharacter.getDamage());

                round++;

                System.out.println("ROUND " + round);

                System.out.println("Life Points of " + secondCharacter.getName() + " : " + secondCharacter.getCurrentLifePoints());
                System.out.println("Damage infliged by "+ secondCharacter.getName() + ": " + secondCharacter.getDamage());

                System.out.println("Life Points of " + firstCharacter.getName() + " : " + firstCharacter.getCurrentLifePoints());
                System.out.println("Damage infliged by "+ firstCharacter.getName() + ": " + firstCharacter.getDamage());

            }


        }
        System.out.println("Fight finish");
        if (firstCharacter.getCurrentLifePoints() > 0 ){
            System.out.println("The winner is :" + firstCharacter.getName());
            System.out.println("The loser is : " + secondCharacter.getName());
        }else if(secondCharacter.getCurrentLifePoints() > 0 ){
            System.out.println("The winner is :" + secondCharacter.getName());
            System.out.println("The loser is : " + firstCharacter.getName());
        }
    }




    
    public static int getUserChoice() { // Function which allows to display a list of commands if the user didn't write correctly a command
        System.out.println("Enter Command");
        Scanner sc = new Scanner(System.in);
        int choice;
        try {
             choice = sc.nextInt();
        }
        catch (Exception ex){
            choice = HELP_CMD;
        }
        return choice;
    }

    public static void executeUserChoice(int c, List<Characters> characterList){

            switch (c) { //list  of commands

                default:
                case HELP_CMD:
                    Commands.help();
                    break;

                case EXIT_CMD:
                    Commands.exit();
                    break;

                case CREATE_CHAR:
                    try {
                        Commands.createChar(characterList);
                    }
                    catch(Exception e){
                        System.out.println("Error, please try again");
                        Commands.createChar(characterList);

                    }

                    break;
                case LIST_CHAR:
                    Commands.listChar(characterList);
                    break;

                case SHOW_CHAR:
                    Commands.showInfoChar(characterList);
                    break;

                case LAUNCH_FIGHT:
                    Commands.launchFight(characterList);
                    break;

                case DELETE_CHAR:
                    Commands.deleteChar(characterList);
                    break;


            }
        }



    }



