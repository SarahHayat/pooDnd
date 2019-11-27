package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
         List<Characters> characterList = new ArrayList<Characters>();

        System.out.println("Application has started"); //test message


        /**
         * Menu help
         */

        int c;
        int b;
       // int choice;
        do {  //loop while, if the user didn't write correctly a command, display a list of commands (à modifier)
            Commands.help();
             c = Commands.getUserChoice();
             Commands.executeUserChoice(c , characterList);

        }while( c != Commands.EXIT_CMD);

        /**
         * Menu create
         */
     //   int choice;
     //   do {
     //       Commands.getHelpChar();
      //      choice = Commands.getChoiceChar();
       //     Commands.executeCreate(choice, characterList);
       // }while ( choice != Commands.Exit_CMD);



       // Characters chara = new Characters("Carlos", 100, 50, 20);

       // public ArrayList<Characters> getCharacterList(){
         //   return characterList;
      //  }




    }
}
