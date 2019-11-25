package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started"); //test message

        System.out.println("-------- MENU --------");
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        if( str == 1){
            Commands.help();
        } else if ( str == 0){
            Commands.exit();
        }

        /* do {
               System.out.println("1 - Afficher l'aide des commandes");
               System.out.println("2 - Quitter l'application")

               Scanner sc = new Scanner(System.in);
               int choix = sc.nextInt();
        }  switch (choix) {
                case 1 : Commands.help();
                         break();

                case 2 : Commands.exit();
                         break;

                default: Commands.help();

        } while (choix != 2 )*/

    }
}
