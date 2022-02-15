package game.rooms;


import game.Items.Weapons;

public class Room00 {
    private String name = "**Hunting Cabin**\n\n";
    private String description = "You are in a cabin with one door leading outside.\n" +
            "\n" +
            "DIRECTIONS: E\n";
    private Weapons knife01 = new Weapons().getKnife();

    public Room00(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public Room00() {

    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


}
