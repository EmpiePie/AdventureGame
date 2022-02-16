package game.Items;

public class FootGear {
    String fName;
    int fVit;
    int fStr;
    int fDex;
    int fInt;

    public FootGear() {
    }

    public FootGear getLeatherFoot() {
        fName = "Leather Boots";
        fVit = 20;
        fStr = 10;
        fDex = 50;
        fInt = 20;
        return this;
    }


    public FootGear getIronFoot() {
        fName = "Iron Boots";
        fVit = 20;
        fStr = 50;
        fDex = 10;
        fInt = 20;
        return this;
    }


    public FootGear getSteelFoot() {
        fName = "Steel Boots";
        fVit = 50;
        fStr = 30;
        fDex = 10;
        fInt = 10;
        return this;
    }


    public FootGear getRobeFoot() {
        fName = "Sandals";
        fVit = 20;
        fStr = 10;
        fDex = 10;
        fInt = 60;
        return this;
    }

}
