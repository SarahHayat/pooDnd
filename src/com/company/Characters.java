package com.company;

import java.util.Scanner;

/**
 *
 * RPG Game - Characters
 * @author Sarah, Maxence, Lucas, Laurent
 * @version 1.0
 */

public class Characters { //Characters Function

    private String name;
    private int damage;
    private int maxLifePoints;
    private int currentLifePoints;
    private int initiative;

    /**
     * Set the character parameters
     * @param name the name of the character
     * @param maxLifePoints the maximum life points
     * @param damage the character damage points
     * @param initiative the value of the initiative to determine which character starts the fight
     */
    public Characters(String name, int maxLifePoints, int damage, int initiative){

        this.name = name;
        this.damage = damage;
        this.maxLifePoints = maxLifePoints;
        this.initiative = initiative;
        this.currentLifePoints = maxLifePoints;

    }



    /**
     * Returns the character's name
     * @return name
     */
    public String getName(){

        return this.name;
    }

    /**
     * Returns the character's damage
     * @return damage
     */
    public int getDamage(){

        return this.damage;
    }

    /**
     * Returns the character's maximum life points
     * @return maxLifePoints
     */

    public int getMaxLifePoints(){

        return this.maxLifePoints;
    }

    /**
     * Returns the character current life points
     * @return CurrentLifePoints
     */

    public int getCurrentLifePoints(){

        return this.currentLifePoints;
    }

    /**
     * Returns the value of the initiative
     * @return initiative
     */

    public int getInitiative(){

        return this.initiative;
    }

    /**
     * Returns character's damage
     * @param damage
     */

    public void inflictDamage(int damage){
        this.currentLifePoints = currentLifePoints - damage;
    }

    /**
     * Returns the character profile
     * @return all information needed for the character
     */
    public String toString(){
        return ("-------- " + this.name +" --------" + "\n" + "Damage : " + this.damage + "\n" +
                "Max Life Points : " + this.maxLifePoints + "\n" + "Current Life Points : " + this.currentLifePoints + "\n" +
                "Initiative : " + this.initiative+ "\n"); // Send character's information

    }


}
