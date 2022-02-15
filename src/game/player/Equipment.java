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

    public boolean isWeapon() {
        weapon = false;
        return weapon;
    }

    public void setWeapon(boolean weapon) {
        this.weapon = weapon;
    }

    public boolean isBody() {
        body = false;
        return body;
    }

    public void setBody(boolean body) {
        this.body = body;
    }

    public boolean isFeet() {
        feet = false;
        return feet;
    }

    public void setFeet(boolean feet) {
        this.feet = feet;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public boolean isSpell() {
        return spell;
    }

    public void setSpell(boolean spell) {
        this.spell = spell;
    }

    public boolean isItem() {
        return item;
    }

    public void setItem(boolean item) {
        this.item = item;
    }
}
