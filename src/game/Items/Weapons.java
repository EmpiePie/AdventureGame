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

    public String getSword(String name, int dmg, int Str, int Dex, int Int) {
        name = "Long Sword";
        dmg = 50;
        Str = 30;
        Dex = 20;
        Int = 0;
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getAxe(String name, int dmg, int Str, int Dex, int Int) {
        name = "Great Axe";
        dmg = 80;
        Str = 20;
        Dex = 0;
        Int = 0;
        return axe;
    }

    public void setAxe(String axe) {
        this.axe = axe;
    }

    public String getSpear(String name, int dmg, int Str, int Dex, int Int) {
        name = "Spear";
        dmg = 40;
        Str = 10;
        Dex = 40;
        Int = 10;
        return spear;
    }

    public void setSpear(String spear) {
        this.spear = spear;
    }

    public String getDaggers(String name, int dmg, int Str, int Dex, int Int) {
        name = "Set of Daggers";
        dmg = 50;
        Str = 0;
        Dex = 40;
        Int = 10;
        return daggers;
    }

    public void setDaggers(String daggers) {
        this.daggers = daggers;
    }

    public String getStaff(String name, int dmg, int Str, int Dex, int Int) {
        name = "Magic Staff";
        dmg = 20;
        Str = 0;
        Dex = 20;
        Int = 60;
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getKnife(String name, int dmg, int Str, int Dex, int Int) {
        name = "Hunting Knife";
        dmg = 20;
        Str = 0;
        Dex = 0;
        Int = 0;
        return knife;
    }

    public void setKnife(String knife) {
        this.knife = knife;
    }
}
