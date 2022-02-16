package game.Items;

public class BodyGear {
    String bName;
    int bVit;
    int bStr;
    int bDex;
    int bInt;

    public BodyGear() {
    }

    public BodyGear getLeatherBody() {
        bName = "Leather Tunic";
        bVit = 30;
        bStr = 20;
        bDex = 70;
        bInt = 30;
        return this;
    }


    public BodyGear getIronBody() {
        bName = "Iron Chain Mail";
        bVit = 40;
        bStr = 60;
        bDex = 20;
        bInt = 30;
        return this;
    }


    public BodyGear getSteelBody() {
        bName = "Steel Breast Plate";
        bVit = 70;
        bStr = 50;
        bDex = 10;
        bInt = 20;
        return this;
    }


    public BodyGear getRobeBody() {
        bName = "Silk Robe";
        bVit = 30;
        bStr = 20;
        bDex = 30;
        bInt = 70;
        return this;
    }

}
