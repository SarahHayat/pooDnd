package com.company;

import java.util.Random;

/**
 *
 * RPG Game - Characters : Thief
 * @author Sarah, Maxence, Lucas, Laurent
 * @version 1.0
 */

public class Thief extends Characters {

    private int probDodge;
    private int probCritical;
    private boolean criticalPreviousTurn;

    /**
     * Set the Thief parameters
     * @param name the name of the character
     * @param damage the value of the character damage points
     * @param maxLifePoints the maximum life points
     * @param initiative the value of the initiative to determine which characters starts the fight
     * @param probDodge the value of dodge's move probability
     * @param probCritical the value of critical hit's probability
     */
    public Thief (String name, int damage, int maxLifePoints, int initiative, int probDodge, int probCritical){

        super(name, maxLifePoints, damage, initiative);
        this.probDodge = probDodge;
        this.probCritical = probCritical;
        this.criticalPreviousTurn = false;
    }

    /**
     * Get the probability of dodge
     * @return probDodge
     *
     */
    public int getProbDodge() { return this.probDodge; }

    /**
     * Get the probability of Critical Damage
     * @return probCritical
     *
     */

    public int getProbCritical() { return this.probCritical; }

    /**
     *
     * @param damage the value of the damage
     */

    public void inflictDamage(int damage){

        Random random = new Random();
        int luck = random.nextInt(101);
        // random number between 0 and 100
        System.out.println("Luck :"+luck+" | Prob : "+this.probDodge);


        if (luck <= this.probDodge){
            // The thief dodges the attack
            System.out.println("But the attack is dodged!");

        }
        else {
            super.inflictDamage(damage);
        }
    }

    /**
     * Get the damage of the thief
     * Double the damage when critical hit used by the thief
     * Critical hit can be used on 2 consecutive attacks.
     */

    public int getDamage(){

        Random random = new Random();
        int luck = random.nextInt(101);
        // random number between 0 and 100

        if (luck <= this.probCritical && criticalPreviousTurn == false){
            System.out.println("Critical hit!");
            criticalPreviousTurn = true;
            return super.getDamage()*2;
        }
        else {
            criticalPreviousTurn = false;
            return super.getDamage();
        }
    }

    /**
     * Returns the Thief profile
     * @return all information needed for the character
     */
    public String toString(){
        return (super.toString() + "Dodge probability : " + this.getProbDodge() + "\n"
                + "Critical hit probability : " + this.getProbCritical() + "\n");// Send character's information
    }
}
