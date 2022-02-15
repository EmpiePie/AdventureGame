package game.Items;

public class HeadGear {
    String leatherHead;
    String ironHead;
    String steelHead;
    String robeHead;

    public HeadGear(String leatherHead, String ironHead, String steelHead, String robeHead) {
        this.leatherHead = leatherHead;
        this.ironHead = ironHead;
        this.steelHead = steelHead;
        this.robeHead = robeHead;
    }

    public String getLeatherHead(String name, int Vit, int Str, int Dex, int Int) {
        name = "Leather Cap";
        Vit = 10;
        Str = 10;
        Dex = 20;
        Int = 10;
        return leatherHead;
    }

    public void setLeatherHead(String leatherHead) {
        this.leatherHead = leatherHead;
    }

    public String getIronHead(String name, int Vit, int Str, int Dex, int Int) {
        name = "Iron Helm";
        Vit = 10;
        Str = 20;
        Dex = 10;
        Int = 10;
        return ironHead;
    }

    public void setIronHead(String ironHead) {
        this.ironHead = ironHead;
    }

    public String getSteelHead(String name, int Vit, int Str, int Dex, int Int) {
        name = "Steel Full Helm";
        Vit = 20;
        Str = 10;
        Dex = 10;
        Int = 10;
        return steelHead;
    }

    public void setSteelHead(String steelHead) {
        this.steelHead = steelHead;
    }

    public String getRobeHead(String name, int Vit, int Str, int Dex, int Int) {
        name = "Circlet";
        Vit = 10;
        Str = 10;
        Dex = 10;
        Int = 20;
        return robeHead;
    }

    public void setRobeHead(String robeHead) {
        this.robeHead = robeHead;
    }
}
