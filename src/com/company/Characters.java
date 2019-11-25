package com.company;

public class Characters { //Characters Function

    private String name;
    private int damage;
    private int maxLifePoints;
    private int currentLifePoints;
    private int initiative;

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

    public void getCharacter(){
        System.out.println("-------- " + this.name +" --------");
        System.out.println("1 - Help");
        System.out.println("2 - Exit");
    }

}
