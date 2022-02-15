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

    public String getLeatherFoot(String fName, int fVit, int fStr, int fDex, int fInt) {
        fName = "Leather Boots";
        fVit = 20;
        fStr = 10;
        fDex = 50;
        fInt = 20;
        return leatherFoot;
    }

    public void setLeatherFoot(String leatherFoot) {
        this.leatherFoot = leatherFoot;
    }

    public String getIronFoot(String fName, int fVit, int fStr, int fDex, int fInt) {
        fName = "Iron Boots";
        fVit = 20;
        fStr = 50;
        fDex = 10;
        fInt = 20;
        return ironFoot;
    }

    public void setIronFoot(String ironFoot) {
        this.ironFoot = ironFoot;
    }

    public String getSteelFoot(String fName, int fVit, int fStr, int fDex, int fInt) {
        fName = "Steel Boots";
        fVit = 50;
        fStr = 30;
        fDex = 10;
        fInt = 10;
        return steelFoot;
    }

    public void setSteelFoot(String steelFoot) {
        this.steelFoot = steelFoot;
    }

    public String getRobeFoot(String fName, int fVit, int fStr, int fDex, int fInt) {
        fName = "Sandals";
        fVit = 20;
        fStr = 10;
        fDex = 10;
        fInt = 60;
        return robeFoot;
    }

    public void setRobeFoot(String robeFoot) {
        this.robeFoot = robeFoot;
    }
}
