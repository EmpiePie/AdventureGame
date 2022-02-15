package game.player;

public class Equipment {
    boolean weapon;
    boolean body;
    boolean feet;
    boolean head;
    boolean spell;
    boolean item;

    public Equipment(boolean weapon, boolean body, boolean feet, boolean head, boolean spell, boolean item) {
        this.weapon = weapon;
        this.body = body;
        this.feet = feet;
        this.head = head;
        this.spell = spell;
        this.item = item;
    }

    public Equipment() {
    }

    public boolean isWeapon() {
        return false;
    }

    public boolean isBody() {
        return false;
    }

    public boolean isFeet() {
        return false;
    }

    public boolean isHead() {
        return false;
    }

    public boolean isSpell() {
        return false;
    }


    public boolean isItem() {
        return false;
    }

}
