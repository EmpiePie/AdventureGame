package game.Items;

public class FootGear {
    String leatherFoot;
    String ironFoot;
    String steelFoot;
    String robeFoot;

    public FootGear(String leatherFoot, String ironFoot, String steelFoot, String robeFoot) {
        this.leatherFoot = leatherFoot;
        this.ironFoot = ironFoot;
        this.steelFoot = steelFoot;
        this.robeFoot = robeFoot;
    }

    public String getLeatherFoot(String name, int Vit, int Str, int Dex, int Int) {
        name = "Leather Boots";
        Vit = 20;
        Str = 10;
        Dex = 50;
        Int = 20;
        return leatherFoot;
    }

    public void setLeatherFoot(String leatherFoot) {
        this.leatherFoot = leatherFoot;
    }

    public String getIronFoot(String name, int Vit, int Str, int Dex, int Int) {
        name = "Iron Boots";
        Vit = 20;
        Str = 50;
        Dex = 10;
        Int = 20;
        return ironFoot;
    }

    public void setIronFoot(String ironFoot) {
        this.ironFoot = ironFoot;
    }

    public String getSteelFoot(String name, int Vit, int Str, int Dex, int Int) {
        name = "Steel Boots";
        Vit = 50;
        Str = 30;
        Dex = 10;
        Int = 10;
        return steelFoot;
    }

    public void setSteelFoot(String steelFoot) {
        this.steelFoot = steelFoot;
    }

    public String getRobeFoot(String name, int Vit, int Str, int Dex, int Int) {
        name = "Sandals";
        Vit = 20;
        Str = 10;
        Dex = 10;
        Int = 60;
        return robeFoot;
    }

    public void setRobeFoot(String robeFoot) {
        this.robeFoot = robeFoot;
    }
}
