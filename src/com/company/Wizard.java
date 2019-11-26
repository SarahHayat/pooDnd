package com.company;

public class Wizard extends Characters {

    private int magicDamage;

public Wizard (String name, int damage, int maxLifePoints, int initiative, int magicDamage){

    super(name, maxLifePoints, damage, initiative);
    this.magicDamage = magicDamage;
}

    public int getMagicDamage(int Damage) {
        return this.magicDamage + Damage;
    }
}
