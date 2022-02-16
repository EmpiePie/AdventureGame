package game.Items;

public class Spells {
    int spDmg;
    boolean isChilled;
    boolean isSilent;
    boolean isLight;

    public Spells() {
    }

    public Spells getFireball() {
        spDmg = 50;
        return this;
    }


    public Spells getIceShard() {
        spDmg = 20;
        isChilled = true;
        return this;
    }


    public Spells getSilence() {
        isSilent = true;
        return this;
    }


    public Spells getLightGlobe() {
        isLight = true;
        return this;
    }

}
