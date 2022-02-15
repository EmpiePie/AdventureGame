package game.Items;

public class Weapons {
    String wName;
    int wDmg;
    int wStr;
    int wDex;
    int wInt;


    public Weapons() {

    }

    public Weapons getSword() {
        wName = "Long Sword";
        wDmg = 50;
        wStr = 30;
        wDex = 20;
        wInt = 0;
        return this;
    }


    public Weapons getAxe() {
        wName = "Great Axe";
        wDmg = 80;
        wStr = 20;
        wDex = 0;
        wInt = 0;
        return this;
    }


    public Weapons getSpear() {
        wName = "Spear";
        wDmg = 40;
        wStr = 10;
        wDex = 40;
        wInt = 10;
        return this;
    }


    public Weapons getDaggers() {
        wName = "Set of Daggers";
        wDmg = 50;
        wStr = 0;
        wDex = 40;
        wInt = 10;
        return this;
    }


    public Weapons getStaff() {
        wName = "Magic Staff";
        wDmg = 20;
        wStr = 0;
        wDex = 20;
        wInt = 60;
        return this;
    }


    public Weapons getKnife() {
        String wName = "Hunting Knife";
        wDmg = 20;
        wStr = 0;
        wDex = 0;
        wInt = 0;
        return this;
    }


}
