package com.company;

public class Thief extends Characters {

    private int dodge;

    public Thief (String name, int damage, int maxLifePoints, int initiative, int dodge){

        super(name, maxLifePoints, damage, initiative);
        this.dodge = dodge;
    }

    public int getDodge() {
        return this.dodge;
    }
}
