package game.Items;

public class Weapons {
    String sword;
    String axe;
    String spear;
    String daggers;
    String staff;
    String knife;

    public Weapons(String sword, String axe, String spear, String daggers, String staff, String knife) {
        this.sword = sword;
        this.axe = axe;
        this.spear = spear;
        this.daggers = daggers;
        this.staff = staff;
        this.knife = knife;
    }

    public String getSword(String wName, int wDmg, int wStr, int wDex, int wInt) {
        wName = "Long Sword";
        wDmg = 50;
        wStr = 30;
        wDex = 20;
        wInt = 0;
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getAxe(String wName, int wDmg, int wStr, int wDex, int wInt) {
        wName = "Great Axe";
        wDmg = 80;
        wStr = 20;
        wDex = 0;
        wInt = 0;
        return axe;
    }

    public void setAxe(String axe) {
        this.axe = axe;
    }

    public String getSpear(String wName, int wDmg, int wStr, int wDex, int wInt) {
        wName = "Spear";
        wDmg = 40;
        wStr = 10;
        wDex = 40;
        wInt = 10;
        return spear;
    }

    public void setSpear(String spear) {
        this.spear = spear;
    }

    public String getDaggers(String wName, int wDmg, int wStr, int wDex, int wInt) {
        wName = "Set of Daggers";
        wDmg = 50;
        wStr = 0;
        wDex = 40;
        wInt = 10;
        return daggers;
    }

    public void setDaggers(String daggers) {
        this.daggers = daggers;
    }

    public String getStaff(String wName, int wDmg, int wStr, int wDex, int wInt) {
        wName = "Magic Staff";
        wDmg = 20;
        wStr = 0;
        wDex = 20;
        wInt = 60;
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getKnife(String wName, int wDmg, int wStr, int wDex, int wInt) {
        wName = "Hunting Knife";
        wDmg = 20;
        wStr = 0;
        wDex = 0;
        wInt = 0;
        return knife;
    }

    public void setKnife(String knife) {
        this.knife = knife;
    }
}
