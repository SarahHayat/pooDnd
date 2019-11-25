package com.company;

public class Characters { //Characters Function

    private String name;
    private int damage;
    private int maxLifePoints;
    private int currentLifePoints;
    private int initiative;


    public Characters(String name, int maxLifePoints, int damage, int initiative){

        this.name = name;
        this.damage = damage;
        this.maxLifePoints = maxLifePoints;
        this.initiative = initiative;
        this.currentLifePoints = maxLifePoints;

    }

    public Characters(String name){
        this(name, 100, 10, 5);
    }

    public String getName(){
        return this.name;
    }

    public int getDamage(){
        return this.damage;
    }

    public int getMaxLifePoints(){
        return this.maxLifePoints;
    }

    public int getCurrentLifePoints(){
        return this.currentLifePoints;
    }

    public int getInitiative(){
        return this.initiative;
    }

    public void inflictDamage(int damage){
        this.currentLifePoints = currentLifePoints - damage;
    }

    public String toString(){
        return ("-------- " + this.name +" --------" + "\\n" + "Damage : " + this.damage + "\\n" +
                "Max Life Points : " + this.maxLifePoints + "\\n" + "Current Life Points : " + this.currentLifePoints + "\\n" +
                "Initiative : " + this.initiative);

    }

}
