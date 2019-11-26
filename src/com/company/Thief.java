package com.company;

public class Thief extends Characters {

    private int dodge;
    private int criticalDamage;

    public Thief (String name, int damage, int maxLifePoints, int initiative, int dodge){

        super(name, maxLifePoints, damage, initiative);
        this.dodge = dodge;
    }

    public int getDodge() {

        return this.dodge;
    }

    public int getCriticalDamage() {

        return this.criticalDamage;
    }

    public String toString(){
        return (super.toString() + "Critical damage : " + this.getCriticalDamage() + "\n"); // Send character's information

    }
}
