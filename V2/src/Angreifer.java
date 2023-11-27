/**
 * Subclass representing an attacker, extending the Spieler class.
 */
public class Angreifer extends Spieler {
    /**
     * Constructor for creating an attacker with a specified name.
     * @param name The name of the attacker.
     */
    Angreifer(String name) {
        super(name);
    }

    /**
     * Method representing jogging training action for an attacker.
     */
    void jogTraining() {
        System.out.println("Angreifer " + name + " macht Jogging-Training.");
    }

    @Override
    void spielen() {
        System.out.println(name + " ist im Angriff und nimmt am Spiel teil.");
    }

}
