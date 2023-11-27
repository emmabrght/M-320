/**
 * Subclass representing a goalie, extending the Spieler class.
 */
public class Goalie extends Spieler {
    double koerpergroesse;

    /**
     * Constructor for creating a goalie with a specified name and height.
     * @param name The name of the goalie.
     * @param koerpergroesse The height of the goalie.
     */
    Goalie(String name, double koerpergroesse) {
        super(name);
        this.koerpergroesse = koerpergroesse;
    }

    /**
     * Overridden method representing playing action for a goalie.
     */
    @Override
    void spielen() {
        System.out.println("Koerpergrosse: " + koerpergroesse);
        System.out.println(name + " steht im Tor und nimmt am Spiel teil.");
        System.out.println();
    }

}
