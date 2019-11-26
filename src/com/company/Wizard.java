package com.company;

public class Wizard extends Characters {

    private int maxMagicDamage;
    private int currentMagicDamage;


public Wizard (String name, int damage, int maxLifePoints, int initiative, int maxMagicDamage){

    super(name, maxLifePoints, damage, initiative);
    this.currentMagicDamage = maxMagicDamage*2;
    // Double the current magic damage for the first round
}
    /**
     * Get the current Magic Damage
     * @param
     * @return currentMagicDamage
     *
     */
    public int getCurrentMagicDamage() { return this.currentMagicDamage/2; }

    /**
     * Get the current Magic Damage
     * @param
     * @return currentMagicDamage
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
     * Double the current magic damage for the first round
     * @param
     *
     */
    public void resetMagicDamage(){
        this.currentMagicDamage = maxMagicDamage*2;

    }

    public String toString(){
        return (super.toString() + "Base Magic Damage : " + this.getMaxMagicDamage() + "\n"); // Send character's information

    }

}
