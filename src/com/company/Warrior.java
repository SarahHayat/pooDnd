package com.company;

public class Warrior extends Characters {

    private int shield;

    public Warrior (String name, int maxLifePoints, int damage, int initiative, int shield) {

        super(name, maxLifePoints, damage, initiative);
        this.shield = shield;

    }

    public int getShield() {

        return this.shield;

    }


}

