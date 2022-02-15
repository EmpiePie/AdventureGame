package game.Items;

public class Spells {
    String fireball;
    String iceShard;
    String silence;
    String lightGlobe;

    public Spells(String fireball, String iceShard, String silence, String lightGlobe) {
        this.fireball = fireball;
        this.iceShard = iceShard;
        this.silence = silence;
        this.lightGlobe = lightGlobe;
    }

    public String getFireball(int spDmg) {
        spDmg = 50;
        return fireball;
    }

    public void setFireball(String fireball) {
        this.fireball = fireball;
    }

    public String getIceShard(int spDmg, boolean isChilled) {
        spDmg = 20;
        isChilled = true;
        return iceShard;
    }

    public void setIceShard(String iceShard) {
        this.iceShard = iceShard;
    }

    public String getSilence(boolean isSilent) {
        isSilent = true;
        return silence;
    }

    public void setSilence(String silence) {
        this.silence = silence;
    }

    public String getLightGlobe(boolean isLight) {
        isLight = true;
        return lightGlobe;
    }

    public void setLightGlobe(String lightGlobe) {
        this.lightGlobe = lightGlobe;
    }
}
