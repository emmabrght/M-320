/**
 * Subclass representing a defender, extending the Spieler class.
 */
public class Verteidiger extends Spieler {
    /**
     * Constructor for creating a defender with a specified name.
     * @param name The name of the defender.
     */
    Verteidiger(String name) {
        super(name);
    }

    @Override
    void spielen() {
        System.out.println(name + " verteidigt und nimmt am Spiel teil.");
    }
}