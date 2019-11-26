package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
         List<Characters> characterList = new ArrayList<Characters>();

        System.out.println("Application has started"); //test message

        Commands.help();
        /**
         * Menu help
         */
        int c;
        do {  //loop while, if the user didn't write correctly a command, display a list of commands (à modifier)
             c = Commands.getUserChoice();
             Commands.executeUserChoice(c , characterList);
        }while( c != Commands.EXIT_CMD);



       // Characters chara = new Characters("Carlos", 100, 50, 20);

       // public ArrayList<Characters> getCharacterList(){
         //   return characterList;
      //  }




    }
}
