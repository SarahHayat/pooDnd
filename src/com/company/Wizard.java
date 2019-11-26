package com.company;

public class Wizard extends Characters {

    private int magicDamage;

public Wizard (String name, int damage, int maxLifePoints, int initiative, int MagicDamage){

    super(name, maxLifePoints, damage, initiative);
    this.magicDamage = maxLifePoints;
}

}
