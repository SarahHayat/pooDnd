package com.company;

/**
 *
 * RPG Game - List of all commands
 * @author Sarah, Maxence, Lucas, Laurent
 * @version 1.0
 */


import java.util.ArrayList;
import java.util.InputMismatchException;
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
        System.out.println("\u001B[1m-------- MENU --------\u001B[0m");
        System.out.println("1 - Help");// Display a list of commands
        System.out.println("2 - Exit");
        System.out.println("3 - Create a character");
        System.out.println("4 - List the characters");
        System.out.println("5 - Show Info");
        System.out.println("6 - Start a fight");
        System.out.println("7 - Delete Character");
    }

    /**
     * Exit the application
     */
    public static void exit(){
        System.out.println("Bye ! \uD83D\uDC4B");
    }

    /**
     * Create a character
     * @param characterList - list of all characters created
     *
     */

    public static void createAnyChar(int choice,List<Characters> characterList) { //Function which allow to create a character

if(choice>0 && choice<5) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter the name : ");//add a name
    String newName = sc.nextLine();
    System.out.println("Enter the life points : ");//add a max number of life
    int maxLife = sc.nextInt();
    System.out.println("Enter the damage : ");//add a damage number
    int damage = sc.nextInt();
    System.out.println("Enter the initiative : ");//add a initiative number
    int initiative = sc.nextInt();

    switch (choice) {
        case BASIC_CHAR:
            Characters char1 = new Characters(newName, maxLife, damage, initiative);
            characterList.add(char1);
            break;
        case WARRIOR_CHAR:
            System.out.println("Enter the shield points: ");//add a shield number
            int shieldPoints = sc.nextInt();
            Warrior war = new Warrior(newName, maxLife, damage, initiative, shieldPoints);
            characterList.add(war);
            break;
        case WIZARD_CHAR:
            System.out.println("Enter the magic damage : ");//add a magic damage number
            int magicDamage = sc.nextInt();
            Wizard wiz = new Wizard(newName, damage, maxLife, initiative, magicDamage);
            characterList.add(wiz);
            break;
        case THIEF_CHAR:
            System.out.println("Enter the dodge points : ");//add a shield point number
            int dodgePoints = sc.nextInt();
            System.out.println("Enter the critical probabilite : ");//add a shield point number
            int probCritical = sc.nextInt();
            Thief thief = new Thief(newName, damage, maxLife, initiative, dodgePoints, probCritical);
            characterList.add(thief);
            break;
        case EXIT_CHAR :
            Commands.help();
    }
}
else if(choice == 5){
    System.out.println("Exit");
}
        else{
        System.out.println(" ⚠️ Error, Returning to the main menu");
        //Commands.help();
    }
    // default: displayCharMenu();




    }

    /**
     * Display Create a character menu
     */
    public static void displayCharMenu(){
        System.out.println("\u001B[1m--- CHARACTER TYPES ---\u001B[0m");
        System.out.println("1 - Basic");
        System.out.println("2 - Warrior");
        System.out.println("3 - Wizard");
        System.out.println("4 - Thief");
        System.out.println("5 - Exit");
    }

    /**
     * Get the user's choice in the Create a character menu
     * @return choice
     */
    public static int getChoiceChar(){

        System.out.println("Please select a type :");
        Scanner sc = new Scanner(System.in);
        int choice= sc.nextInt();

        return choice;

    }

/**
     * Delete a character
     * @param characterList - list of all characters created
     *
     */

    public static void deleteChar (List<Characters> characterList) {

        System.out.println("Please select Character :");
        Scanner scan = new Scanner(System.in);

        try { int characterListID = scan.nextInt();
            Characters charactersListID = characterList.get(characterListID - 1);
            System.out.println("Are you sure you want to \u001B[31mdelete\u001B[0m " + charactersListID.getName() + " ?");
            System.out.println("1 - \u001B[32m Yes \u001B[0m");
            System.out.println("2 - \u001B[31m No \u001B[0m");
            int answer = scan.nextInt();
            if (answer == 1){
                characterList.remove(characterListID - 1);
                System.out.println(charactersListID.getName() + " has been deleted. \uD83D\uDDD1️");
            }else if (answer == 0){
                // Do nothing
            }
        }
        catch (Exception e){
            System.out.println(" ⚠️ Error, This character doesn't exist. Please try again");
        }


    }

    /**
     * Show the list of all characters list
     * @param characterList list of all characters created
     */
    public static void listChar(List<Characters> characterList){
    int i = 0;
    for (Characters character : characterList){
        i++;
        System.out.println("Character " + i + " : " + character.getName() + "\n" );

    }

    }

    /**
     * Show the characters information
     * @param characterList list of all characters created
     */
    public static void showInfoChar(List<Characters> characterList){
        System.out.println("Please select Character :");
        Scanner scan = new Scanner(System.in);
        int choice;
        try {
            choice = scan.nextInt();
            System.out.println(characterList.get(choice-1));
        }
        catch (Exception e){
            System.out.println("Error, please enter a right id ");
            choice = scan.nextInt();
            System.out.println(characterList.get(choice-1));
        }
    }

    /**
     * Process of the fight
     * @param characterList list of all characters created
     */
    public static void launchFight(List<Characters> characterList) {

        int round = 1;
        Characters swapCharacter;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID of the first fighter: ");
        int firstCharacterID = sc.nextInt();

        System.out.println("Enter the ID of the second fighter: ");
        int secondCharacterID = sc.nextInt();

        Characters attacker = characterList.get(firstCharacterID - 1);
        Characters defender = characterList.get(secondCharacterID - 1);

        if (defender.getInitiative() > attacker.getInitiative()){
            // If the defender has a higher initiative than the attacker, we swap both of them
            defender = characterList.get(firstCharacterID - 1);
            attacker = characterList.get(secondCharacterID - 1);
        }

        System.out.println("\u001B[31m" + attacker.getName() + " provokes " + defender.getName() + " in a duel!" + "\u001B[0m" + " ⚔️");

        while (attacker.getCurrentLifePoints() > 0 && defender.getCurrentLifePoints() > 0) {
            System.out.println("\u001B[1m--- ROUND "+ round +" ---\u001B[0m");

            System.out.println(attacker.getName() +" ("+ attacker.getCurrentLifePoints() +" HP) hits " + defender.getName()+"!");
            defender.inflictDamage(attacker.getDamage()); // Attacker hits defender
            System.out.println(defender.getName() + " now has " + defender.getCurrentLifePoints()+" HP left.");

            // Swap the attacker and the defender
            swapCharacter = attacker;
            attacker = defender;
            defender = swapCharacter;

            // Advance the round number
            round++;
            System.out.println();

        }

        System.out.println("\u001B[31m" + "STOP!" + "\u001B[0m");

        if (attacker.getCurrentLifePoints() <= 0 ){
            System.out.println(defender.getName() + " wins! \uD83D\uDC51");
        }
        else if (defender.getCurrentLifePoints() <= 0 ){
            System.out.println(attacker.getName() + " wins! \uD83D\uDC51");
        }
    }

    /**
     * Displays the list of commands when the user didn't write correctly a command
     * @return choice
     */
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

    /**
     *
     * @param c the value of user's choice
     * @param characterList list of all characters created
     */
    public static void executeUserChoice(int c, List<Characters> characterList){
    try {
        switch (c) { //list  of commands

            //default:
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
                    Commands.createAnyChar(ch, characterList);

                } catch (Exception e) {
                    System.out.println("⚠️ Error, Returning to the main menu");
                    //int ch = Commands.getChoiceChar();
                    //Commands.help();
                    //Commands.createAnyChar(ch,characterList);

                }

                break;
            case LIST_CHAR:
                Commands.listChar(characterList);
                break;

            case SHOW_CHAR:
                try {
                    Commands.showInfoChar(characterList);
                } catch (Exception e) {
                    System.out.println("⚠️ Error, Returning to the main menu");
                }
                break;

            case LAUNCH_FIGHT:
                try {
                    Commands.launchFight(characterList);
                }catch (InputMismatchException e){
                    System.out.println("⚠️ Error: The duel cannot start : Bad input. Returning to the main menu");

                }catch (IndexOutOfBoundsException e){
                    System.out.println("⚠️ Error: The duel cannot start : Fighter(s) doesn't exist (Bad ID). Returning to the main menu");
                }
                //finally {
                //    System.out.println("xxx coucou");
                //}

                break;

            case DELETE_CHAR:
                Commands.deleteChar(characterList);
                break;


        }
    }catch (Exception e){
        System.out.println("⚠️ Error, Returning to the main menu");
    }
        }

    }



