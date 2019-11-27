package com.company;

/**
 *
 * RPG Game - Characters : Warrior
 * @author Sarah, Maxence, Lucas, Laurent
 * @version 1.0
 */

public class Warrior extends Characters {

    private int shield;

    /**
     * Set the Warrior character
     * @param name the name of the character
     * @param maxLifePoints the maximum life points
     * @param damage the value of the character damage points
     * @param initiative the value of the initiative to determine which characters starts the fight
     * @param shield the value of the shield points
     */
    public Warrior (String name, int maxLifePoints, int damage, int initiative, int shield) {

        super(name, maxLifePoints, damage, initiative);
        this.shield = shield;

    }

    /**
     * Returns the value of shield points
     * @return shield
     */
    public int getShield() {

        return this.shield;

    }

    /**
     *
     * Determines the value of the inflicted damage
     * @param damage the value of damage
     *
     */

    public void inflictDamage (int damage) {
        if (damage > shield) {
            super.inflictDamage(damage);
        }
        else {
            System.out.println("The attack is blocked by the shield!");
        }
    }

    /**
     * Returns the Warrior profile
     * @return all information needed for the character
     */
    public String toString(){
        return (super.toString() + "Shield : " + this.shield+ "\n"); // Send character's information

    }

}

