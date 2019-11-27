package com.company;

/**
 *
 * RPG Game - Characters : Wizard
 * @author Sarah, Maxence, Lucas, Laurent
 * @version 1.0
 */

public class Wizard extends Characters {

    private int maxMagicDamage;
    private int currentMagicDamage;


    /**
     * Set the Wizard parameters
     * Double the current magic damage for the first round
     * @param name the name of the character of the wizard
     * @param damage the value of the character damage points
     * @param maxLifePoints the value maximum life points of the wizard
     * @param initiative the value of the initiative to determine which characters starts the fight
     * @param maxMagicDamage the value of the maximum magic damage
     */
    public Wizard (String name, int damage, int maxLifePoints, int initiative, int maxMagicDamage){

    super(name, maxLifePoints, damage, initiative );
    this.currentMagicDamage = maxMagicDamage*2;
}
    /**
     * Get the current Magic Damage
     * @return currentMagicDamage
     *
     */
    public int getCurrentMagicDamage() { return this.currentMagicDamage/2; }

    /**
     * Get the maximum of Magic Damage
     * @return maxMagicDamage
     *
     */

    public int getMaxMagicDamage() { return this.maxMagicDamage/2; }

    /**
     * Get the Wizard damage
     * Divide the magic damage by 2 and return it with the damage
     * @param damage
     * @return currentMagicDamage
     *
     */
    public int getDamage(int damage) {
        this.currentMagicDamage = currentMagicDamage/2;
        return this.currentMagicDamage + damage;
    }

    /**
     * Reset the Wizard damage
     * Reset magic damage when the fight.
     *
     */
    public void resetMagicDamage(){
        this.currentMagicDamage = maxMagicDamage*2;

    }

    /**
     * Returns the Wizard profile
     * @return all information needed for the character
     */

    public String toString(){
        return (super.toString() + "Base Magic Damage : " + this.maxMagicDamage + "\n"); // Send character's information

    }

}
