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

    public String getLeatherHead(String hName, int hVit, int hStr, int hDex, int hInt) {
        hName = "Leather Cap";
        hVit = 10;
        hStr = 10;
        hDex = 20;
        hInt = 10;
        return leatherHead;
    }

    public void setLeatherHead(String leatherHead) {
        this.leatherHead = leatherHead;
    }

    public String getIronHead(String hName, int hVit, int hStr, int hDex, int hInt) {
        hName = "Iron Helm";
        hVit = 10;
        hStr = 20;
        hDex = 10;
        hInt = 10;
        return ironHead;
    }

    public void setIronHead(String ironHead) {
        this.ironHead = ironHead;
    }

    public String getSteelHead(String hName, int hVit, int hStr, int hDex, int hInt) {
        hName = "Steel Full Helm";
        hVit = 20;
        hStr = 10;
        hDex = 10;
        hInt = 10;
        return steelHead;
    }

    public void setSteelHead(String steelHead) {
        this.steelHead = steelHead;
    }

    public String getRobeHead(String hName, int hVit, int hStr, int hDex, int hInt) {
        hName = "Circlet";
        hVit = 10;
        hStr = 10;
        hDex = 10;
        hInt = 20;
        return robeHead;
    }

    public void setRobeHead(String robeHead) {
        this.robeHead = robeHead;
    }
}
