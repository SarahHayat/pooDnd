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

    public void inflictDamage (int damage) {
        if (damage > shield) {
            super.inflictDamage(damage);
        }
    }

    public String toString(){
        return (super.toString() + "Shield : " + this.shield+ "\n"); // Send character's information

    }

}

