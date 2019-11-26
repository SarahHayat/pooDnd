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

    public final static int BASIC_CHAR = 1;
    public final static int WARRIOR_CHAR = 2;
    public final static int WIZARD_CHAR = 3;
    public final static int THIEF_CHAR = 4;
    public final static int EXIT_CHAR = 5;

  // ArrayList<Characters> characterList = new ArrayList<Characters>();

    /**
     * Display the menu with commands
     *
     */

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

    /**
     * Create a character
     * @param characterList - list of all characters created
     *
     */

    public static void createAnyChar(int choice,List<Characters> characterList) { //Function which allow to create a character
        choice = Commands.getChoiceChar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");//add a name
        String newName = sc.nextLine();
        System.out.println("Enter the MaxLife : ");//add a max number of life
        int maxLife = sc.nextInt();
        System.out.println("Enter the damage : ");//add a damage number
        int damage = sc.nextInt();
        System.out.println("Enter the initiative : ");//add a initiative number
        int initiative = sc.nextInt();

        switch (choice){
            case BASIC_CHAR :
                Characters char1 = new Characters(newName, maxLife, damage, initiative);
                characterList.add(char1);
            case WARRIOR_CHAR :
                System.out.println("Enter the shield points: ");//add a shield number
                int shieldPoints = sc.nextInt();
                Warrior war = new Warrior(newName, maxLife, damage,initiative, shieldPoints);
                characterList.add(war);
            case WIZARD_CHAR :
                System.out.println("Enter the magic damage : ");//add a magic damage number
                int magicDamage = sc.nextInt();
                Wizard wiz = new Wizard( newName, damage , maxLife, initiative, magicDamage);
                characterList.add(wiz);
            case THIEF_CHAR :
                System.out.println("Enter the dodge points : ");//add a shield point number
                int dodgePoints= sc.nextInt();
                Warrior warrior = new Warrior(newName, maxLife, damage,initiative, dodgePoints);
                characterList.add(warrior);

        }

    }

    public static void displayCharMenu(){
        System.out.println("--- CHARACTER TYPES ---");
        System.out.println("1 - Basic");
        System.out.println("2 - Warrior");
        System.out.println("3 - Wizard");
        System.out.println("4 - Thief");
        System.out.println("5 - Exit");
    }

    public static int getChoiceChar(){

        System.out.println("Please select a type :");
        Scanner sc = new Scanner(System.in);
        int choice= sc.nextInt();

        return choice;

    }

 /*   public static void executeCreate(int choice, List<Characters> characterList){
        switch (choice){
            case BASIC_CHAR :
                Commands.createBasicChar(characterList);
                break;
            case WARRIOR_CHAR :
                Commands.createWarrior(characterList);
                break;
            case WIZARD_CHAR :
                Commands.createWizard(characterList);
                break;
            case THIEF_CHAR :
                Commands.createThief(characterList);
                break;
            case EXIT_CHAR:
                Commands.help();
            default: Commands.createCharMenu();
        }
    }*/
/*
    public static void createChar(List<Characters> characterList){
        int c;
        Commands.createCharMenu();
        c = Commands.getChoiceChar();
        executeCreate(c, characterList);

    }
    public static void createBasicChar(List<Characters> characterList){ //Function which allow to create a character

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

    *//**
     * Delete a character
     * @param characterList - list of all characters created
     *
     *//*




    public static void createWizard(List<Characters> characterList){ //Function which allow to create a character

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");//add a name
        String newName = sc.nextLine();
        System.out.println("Enter the MaxLife : ");//add a max number of life
        int maxLife = sc.nextInt();
        System.out.println("Enter the damage : ");//add a damage number
        int damage = sc.nextInt();
        System.out.println("Enter the initiative : ");//add a initiative number
        int initiative = sc.nextInt();
        System.out.println("Enter the magic damage : ");//add a magic damage number
        int magicDamage = sc.nextInt();
        

        Wizard wiz = new Wizard( newName, damage , maxLife, initiative, magicDamage);
        //System.out.println(char1.toString());
        characterList.add(wiz);


    }

    public static void createWarrior(List<Characters> characterList){ //Function which allow to create a character

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");//add a name
        String newName = sc.nextLine();
        System.out.println("Enter the MaxLife : ");//add a max number of life
        int maxLife = sc.nextInt();
        System.out.println("Enter the damage : ");//add a damage number
        int damage = sc.nextInt();
        System.out.println("Enter the initiative : ");//add a initiative number
        int initiative = sc.nextInt();
        System.out.println("Enter the shield points : ");//add a shield point number
        int shieldPoints = sc.nextInt();
        

        Warrior war = new Warrior(newName, maxLife, damage,initiative, shieldPoints);
        //System.out.println(char1.toString());
        characterList.add(war);


    }*/
//    public static void createThief(List<Characters> characterList){ //Function which allow to create a character
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name : ");//add a name
//        String newName = sc.nextLine();
//        System.out.println("Enter the MaxLife : ");//add a max number of life
//        int maxLife = sc.nextInt();
//        System.out.println("Enter the damage : ");//add a damage number
//        int damage = sc.nextInt();
//        System.out.println("Enter the initiative : ");//add a initiative number
//        int initiative = sc.nextInt();
//        System.out.println("Enter the dodge points : ");//add a shield point number
//        int dodgePoints= sc.nextInt();
//
//
//        Warrior war = new Warrior(newName, maxLife, damage,initiative, dodgePoints);
//        //System.out.println(char1.toString());
//        characterList.add(war);
//
//
//    }

    public static void deleteChar (ArrayList characterList) {

        System.out.println("Please select Character :");
        Scanner scan = new Scanner(System.in);

        try { int characterListID = scan.nextInt();
            Characters charactersListID = characterList.get(characterListID - 1);
            System.out.println("Are you sure to delete this character");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int answer = scan.nextInt();
            if (answer == 1){
                characterList.remove(characterListID - 1);

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
                        Commands.displayCharMenu();
                        int ch = Commands.getChoiceChar();
                        Commands.createAnyChar(ch,characterList);

                    }
                    catch(Exception e){
                        System.out.println("Error, please try again");
                        int ch = Commands.getChoiceChar();
                        Commands.createAnyChar(ch,characterList);

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



