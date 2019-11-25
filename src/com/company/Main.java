package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started"); //test message

        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        if( str == 1){
            Commands.help();
        }else if ( str == 0){
            Commands.exit();
        }

    }
}
