package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * RPG Game - Homepage
 * @author Sarah, Maxence, Lucas, Laurent
 * @version 1.0
 */


public class Main {

    /**
     * Method main() which allows to start the game
     */
    public static void main(String[] args) {
         List<Characters> characterList = new ArrayList<Characters>(); //creation of the character list

        System.out.println("Application has started"); //test message


        /**
         * Menu help
         */

        int c;

        do {  //loop while, if the user didn't write correctly a command, display a list of commands (à modifier)
            Commands.help();
            c = Commands.getUserChoice();
             Commands.executeUserChoice(c , characterList);

        } while( c != Commands.EXIT_CMD);






    }
}
