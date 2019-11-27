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

    super(name, maxLifePoints, damage, initiative);
    this.maxMagicDamage = maxMagicDamage;
    this.currentMagicDamage = this.maxMagicDamage*2;
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

    public int getMaxMagicDamage() { return this.maxMagicDamage; }

    /**
     * Get the Wizard damage
     * Divide the magic damage by 2 and return it with the damage
     * @param damage
     * @return currentMagicDamage
     *
     */
    public int getDamage() {
        this.currentMagicDamage = this.getCurrentMagicDamage();
        if (this.currentMagicDamage > 0) {
            System.out.println("A magic trick makes the wizard stronger : \u001B[32m+"+this.currentMagicDamage+" HP of damage!\u001B[0m");
        }
        return (this.currentMagicDamage + super.getDamage());
    }


    /**
     * Resets the life points and the magic points of a character back to the original amount
     *
     */
    public void resetCharacter(){
        super.resetCharacter();
        this.currentMagicDamage = maxMagicDamage*2;

    }

    /**
     * Returns the Wizard profile
     * @return all information needed for the character
     */

    public String toString(){
        return (super.toString() + "Base Magic Damage : " + this.getMaxMagicDamage() + "\n"); // Send character's information

    }

}
