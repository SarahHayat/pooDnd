package com.company;

import java.util.Scanner;

public class Characters { //Characters Function

    private String name;
    private int damage;
    private int maxLifePoints;
    private int currentLifePoints;
    private int initiative;


    public Characters(String name, int maxLifePoints, int damage, int initiative){

        this.name = name;
        this.damage = damage;
        this.maxLifePoints = maxLifePoints;
        this.initiative = initiative;
        this.currentLifePoints = maxLifePoints;

    }

   /* public static Characters newChar(){
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

        return char1;
    }*/

    public String getName(){

        return this.name;
    }

    public int getDamage(){

        return this.damage;
    }

    public int getMaxLifePoints(){

        return this.maxLifePoints;
    }

    public int getCurrentLifePoints(){

        return this.currentLifePoints;
    }

    public int getInitiative(){

        return this.initiative;
    }

    public void inflictDamage(int damage){
        this.currentLifePoints = currentLifePoints - damage;
    }

    public String toString(){
        return ("-------- " + this.name +" --------" + "\n" + "Damage : " + this.damage + "\n" +
                "Max Life Points : " + this.maxLifePoints + "\n" + "Current Life Points : " + this.currentLifePoints + "\n" +
                "Initiative : " + this.initiative+ "\n"); // Send character's information

    }

}
