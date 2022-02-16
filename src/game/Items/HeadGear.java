package game.Items;

public class HeadGear {
    String hName;
    int hVit;
    int hStr;
    int hDex;
    int hInt;

    public HeadGear() {
    }

    public HeadGear getLeatherHead() {
        hName = "Leather Cap";
        hVit = 10;
        hStr = 10;
        hDex = 20;
        hInt = 10;
        return this;
    }


    public HeadGear getIronHead() {
        hName = "Iron Helm";
        hVit = 10;
        hStr = 20;
        hDex = 10;
        hInt = 10;
        return this;
    }


    public HeadGear getSteelHead() {
        hName = "Steel Full Helm";
        hVit = 20;
        hStr = 10;
        hDex = 10;
        hInt = 10;
        return this;
    }


    public HeadGear getRobeHead() {
        hName = "Circlet";
        hVit = 10;
        hStr = 10;
        hDex = 10;
        hInt = 20;
        return this;
    }

}
