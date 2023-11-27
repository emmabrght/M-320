import java.util.ArrayList;
import java.util.List;

public class Mannschaft {
    Goalie goalie;
    List<Angreifer> angreiferList;
    List<Verteidiger> verteidigerList;
    int maxSpieler;

    Mannschaft(Goalie goalie, List<Angreifer> angreiferList, List<Verteidiger> verteidigerList, int maxSpieler) {
        this.goalie = goalie;
        this.angreiferList = angreiferList;
        this.verteidigerList = verteidigerList;
        this.maxSpieler = maxSpieler;
    }

    void spielerHinzufuegen(Spieler spieler) {
        if (spieler instanceof Goalie) {
            if (goalie != null) {
                throw new IllegalArgumentException("Es kann nur ein Goalie in der Mannschaft sein.");
            }
            goalie = (Goalie) spieler;
        } else if (spieler instanceof Angreifer) {
            if (angreiferList.size() + 1 > maxSpieler) {
                throw new IllegalArgumentException("Die maximale Anzahl von Angreifern wurde erreicht.");
            }
            angreiferList.add((Angreifer) spieler);
        } else if (spieler instanceof Verteidiger) {
            if (verteidigerList.size() + 1 > maxSpieler) {
                throw new IllegalArgumentException("Die maximale Anzahl von Verteidigern wurde erreicht.");
            }
            verteidigerList.add((Verteidiger) spieler);
        }

        spieler.zeigeName();
        spieler.spielen();
    }

    List<Angreifer> getAngreiferList() {
        return new ArrayList<>(angreiferList);
    }

    List<Verteidiger> getVerteidigerList() {
        return new ArrayList<>(verteidigerList);
    }
}
