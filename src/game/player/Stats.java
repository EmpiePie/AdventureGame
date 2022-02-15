package game.player;


public class Stats {
    int playerHealth;   //Player Max Health, based on Vitality Stat
    int playerDamage;   //Player Melee Damage, based on Strength Stat
    int playerSpellDmg; //Player Spell Damage, based on Intelligence
    int playerStr;      //Player Strength, based on Weapon and Gear. Affects player Damage.
    int playerInt;      //Player Intelligence, based on Weapon and Gear. Affects Spell Damage.
    int playerDex;      //PLayer Dexterity, based on Weapon and Gear. Affects Dodge chance.
    int playerVit;      //Player Vitality, based on Gear. Affects Total Health.


    public Stats(int playerHealth, int playerDamage, int playerSpellDmg, int playerStr, int playerInt,
                 int playerDex, int playerVit) {
        this.playerHealth = playerHealth;
        this.playerDamage = playerDamage;
        this.playerSpellDmg = playerSpellDmg;
        this.playerStr = playerStr;
        this.playerInt = playerInt;
        this.playerDex = playerDex;
        this.playerVit = playerVit;

    }

    public int getPlayerHealth(int maxHealth) {
        maxHealth = 100;
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerDamage(int dmg) {
        dmg = 10;
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public int getPlayerSpellDmg(int spDmg) {
        spDmg = 0;
        return playerSpellDmg;
    }

    public void setPlayerSpellDmg(int playerSpellDmg) {
        this.playerSpellDmg = playerSpellDmg;
    }

    public int getPlayerStr(int Str) {
        Str = 10;
        return playerStr;
    }

    public void setPlayerStr(int playerStr) {
        this.playerStr = playerStr;
    }

    public int getPlayerInt(int Int) {
        Int = 10;
        return playerInt;
    }

    public void setPlayerInt(int playerInt) {
        this.playerInt = playerInt;
    }

    public int getPlayerDex(int Dex) {
        Dex = 10;
        return playerDex;
    }

    public void setPlayerDex(int playerDex) {
        this.playerDex = playerDex;
    }

    public int getPlayerVit(int Vit) {
        Vit = 0;
        return playerVit;
    }

    public void setPlayerVit(int playerVit) {
        this.playerVit = playerVit;
    }

}
