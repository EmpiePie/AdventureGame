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

    public String getLeatherBody(String name, int Vit, int Str, int Dex, int Int) {
        name = "Leather Tunic";
        Vit = 30;
        Str = 20;
        Dex = 70;
        Int = 30;
        return leatherBody;
    }

    public void setLeatherBody(String leatherBody) {
        this.leatherBody = leatherBody;
    }

    public String getIronBody(String name, int Vit, int Str, int Dex, int Int) {
        name = "Iron Chain Mail";
        Vit = 40;
        Str = 60;
        Dex = 20;
        Int = 30;
        return ironBody;
    }

    public void setIronBody(String ironBody) {
        this.ironBody = ironBody;
    }

    public String getSteelBody(String name, int Vit, int Str, int Dex, int Int) {
        name = "Steel Breast Plate";
        Vit = 70;
        Str = 50;
        Dex = 10;
        Int = 20;
        return steelBody;
    }

    public void setSteelBody(String steelBody) {
        this.steelBody = steelBody;
    }

    public String getRobeBody(String name, int Vit, int Str, int Dex, int Int) {
        name = "Silk Robe";
        Vit = 30;
        Str = 20;
        Dex = 30;
        Int = 70;
        return robeBody;
    }

    public void setRobeBody(String robeBody) {
        this.robeBody = robeBody;
    }
}
