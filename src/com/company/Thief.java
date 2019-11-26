package com.company;

import java.util.Random;

public class Thief extends Characters {

    private int probDodge;
    private int probCritical;
    private boolean criticalPreviousTurn;

    public Thief (String name, int damage, int maxLifePoints, int initiative, int probDodge, int probCritical){

        super(name, maxLifePoints, damage, initiative);
        this.probDodge = probDodge;
        this.probCritical = probCritical;
        this.criticalPreviousTurn = false;
    }

    /**
     * Get the probability of dodge
     * @return probDodge
     *
     */
    public int getProbDodge() { return this.probDodge; }

    /**
     * Get the probability of Critical Damage
     * @return probCritical
     *
     */

    public int getProbCritical() { return this.probCritical; }

    /**
     *
     * @param damage
     *
     */

    public void inflictDamage(int damage){

        Random random = new Random();
        int luck = random.nextInt(101);
        // random number between 0 and 100

        if (luck <= this.getProbDodge()){
            // Do nothing, the thief dodges the attack
        }
        else {
            this.inflictDamage(damage);
        }
    }

    /**
     *
     *
     *
     */

    public int getDamage(){

        Random random = new Random();
        int luck = random.nextInt(101);
        // random number between 0 and 100

        if (luck <= this.getProbCritical() && criticalPreviousTurn == false){
            criticalPreviousTurn = true;
            return super.getDamage()*2;
        }
        else {
            criticalPreviousTurn = false;
            return super.getDamage();
        }
    }

    public String toString(){
        return (super.toString() + "Dodge probability : " + this.getProbDodge() + "\n"
                + "Critical hit probability : " + this.getProbCritical() + "\n");// Send character's information
    }
}
