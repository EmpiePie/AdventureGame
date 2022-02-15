package game.Items;

public class BodyGear {
    String leatherBody;
    String ironBody;
    String steelBody;
    String robeBody;

    public BodyGear(String leatherBody, String ironBody, String steelBody, String robeBody) {
        this.leatherBody = leatherBody;
        this.ironBody = ironBody;
        this.steelBody = steelBody;
        this.robeBody = robeBody;
    }

    public String getLeatherBody(String bName, int bVit, int bStr, int bDex, int bInt) {
        bName = "Leather Tunic";
        bVit = 30;
        bStr = 20;
        bDex = 70;
        bInt = 30;
        return leatherBody;
    }

    public void setLeatherBody(String leatherBody) {
        this.leatherBody = leatherBody;
    }

    public String getIronBody(String bName, int bVit, int bStr, int bDex, int bInt) {
        bName = "Iron Chain Mail";
        bVit = 40;
        bStr = 60;
        bDex = 20;
        bInt = 30;
        return ironBody;
    }

    public void setIronBody(String ironBody) {
        this.ironBody = ironBody;
    }

    public String getSteelBody(String bName, int bVit, int bStr, int bDex, int bInt) {
        bName = "Steel Breast Plate";
        bVit = 70;
        bStr = 50;
        bDex = 10;
        bInt = 20;
        return steelBody;
    }

    public void setSteelBody(String steelBody) {
        this.steelBody = steelBody;
    }

    public String getRobeBody(String bName, int bVit, int bStr, int bDex, int bInt) {
        bName = "Silk Robe";
        bVit = 30;
        bStr = 20;
        bDex = 30;
        bInt = 70;
        return robeBody;
    }

    public void setRobeBody(String robeBody) {
        this.robeBody = robeBody;
    }
}
