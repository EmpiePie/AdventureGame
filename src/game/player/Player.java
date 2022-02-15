package game.player;


public class Player {
    int playerHealth = 100;   //Player Max Health, based on Vitality Stat
    int playerDamage = 10;   //Player Melee Damage, based on Strength Stat
    int playerSpellDmg = 0; //Player Spell Damage, based on Intelligence
    int playerStr = 10;      //Player Strength, based on Weapon and Gear. Affects player Damage.
    int playerInt = 10;      //Player Intelligence, based on Weapon and Gear. Affects Spell Damage.
    int playerDex = 10;      //PLayer Dexterity, based on Weapon and Gear. Affects Dodge chance.
    int playerVit = 10;      //Player Vitality, based on Gear. Affects Total Health.


    public Player(int playerHealth, int playerDamage, int playerSpellDmg, int playerStr, int playerInt,
                  int playerDex, int playerVit) {
        this.playerHealth = playerHealth;
        this.playerDamage = playerDamage;
        this.playerSpellDmg = playerSpellDmg;
        this.playerStr = playerStr;
        this.playerInt = playerInt;
        this.playerDex = playerDex;
        this.playerVit = playerVit;

    }

    public Player() {
    }

    public int getPlayerHealth() {
        return playerHealth;
    }


    public int getPlayerDamage() {
        return playerDamage;
    }


    public int getPlayerSpellDmg() {
        return playerSpellDmg;
    }


    public int getPlayerStr() {
        return playerStr;
    }


    public int getPlayerInt() {
        return playerInt;
    }


    public int getPlayerDex() {
        return playerDex;
    }


    public int getPlayerVit() {
        return playerVit;
    }

}
