package com.company;

public class Wizard extends Characters {

    private int maxMagicDamage;
    private int currentMagicDamage;


public Wizard (String name, int damage, int maxLifePoints, int initiative, int maxMagicDamage){

    super(name, maxLifePoints, damage, initiative);
    this.currentMagicDamage = maxMagicDamage*2;
    // Double the current magic damage for the first round
}

    public int getCurrentMagicDamage() { return this.currentMagicDamage/2; }

    public int getMaxMagicDamage() { return this.maxMagicDamage/2; }

    public int getDamage(int damage) {
        this.currentMagicDamage = currentMagicDamage/2;
        return this.currentMagicDamage + damage;
    } // Divide the magic damage by 2 and return it with the damage

    public void resetMagicDamage(){
        this.currentMagicDamage = maxMagicDamage*2;
        // Double the current magic damage for the first round
    }

    public String toString(){
        return (super.toString() + "Base Magic Damage : " + this.getMaxMagicDamage() + "\n"); // Send character's information

    }

}
