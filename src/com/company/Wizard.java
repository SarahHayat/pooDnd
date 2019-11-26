package com.company;

public class Wizard extends Characters {

    private int maxMagicDamage;
    private int currentMagicDamage;


public Wizard (String name, int damage, int maxLifePoints, int initiative, int maxMagicDamage){

    super(name, maxLifePoints, damage, initiative);
    this.currentMagicDamage = maxMagicDamage*2;
    // Double the current magic damage for the first round
}

    public int getCurrentMagicDamage(int damage) {
         return (this.currentMagicDamage);
    }

    public int getMaxMagicDamage(int damage) {
        return (this.maxMagicDamage);
    }

    public int getDamage(int damage) {
        return (this.currentMagicDamage)/2 + damage;
    } // Divide the magic damage by 2 each round

    public void resetMagicDamage(){
        this.currentMagicDamage = maxMagicDamage*2;
        // Double the current magic damage for the first round
    }

    public String toString(){
        return (super.toString() + "Base Magic Damage : " + this.maxMagicDamage+ "\n"); // Send character's information

    }

}
