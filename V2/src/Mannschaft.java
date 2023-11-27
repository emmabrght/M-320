/**
 * Class representing a team with a goalie, attackers, and defenders.
 */
public class Mannschaft {
    Goalie goalie;
    Angreifer[] angreifer;
    Verteidiger[] verteidiger;

    /**
     * Constructor for creating a team with a goalie, attackers, and defenders.
     * @param goalie The goalie of the team.
     * @param angreifer The array of attackers in the team.
     * @param verteidiger The array of defenders in the team.
     */
    Mannschaft(Goalie goalie, Angreifer[] angreifer, Verteidiger[] verteidiger) {
        this.goalie = goalie;
        this.angreifer = angreifer;
        this.verteidiger = verteidiger;
    }

    /**
     * Method for adding a player to the team.
     * @param spieler The player to be added to the team.
     */
    void spielerHinzufuegen(Spieler spieler) {
        spieler.zeigeName();
        spieler.spielen();
    }

    /**
     * Overridden method to provide a string representation of the team.
     * @return A string representation of the team.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Mannschaft:\n");

        if (goalie != null) {
            result.append("Goalie: ").append(goalie).append("\n");
        }

        if (angreifer != null) {
            result.append("Angreifer:\n");
            for (Angreifer an : angreifer) {
                result.append(an).append("\n");
            }
        }

        if (verteidiger != null) {
            result.append("Verteidiger:\n");
            for (Verteidiger ve : verteidiger) {
                result.append(ve).append("\n");
            }
        }

        return result.toString();
    }


}