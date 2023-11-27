/**
 * The base class representing a player.
 */
public class Spieler {
    String name;

    /**
     * Constructor for creating a player with a specified name.
     * @param name The name of the player.
     */
    Spieler(String name) {
        this.name = name;
    }

    /**
     * Method representing playing action for a player.
     */
    void spielen() {
        System.out.println(name + " nimmt am Spiel teil.");
    }
    void zeigeName() {
        System.out.println("Spieler: " + name);
    }
}
