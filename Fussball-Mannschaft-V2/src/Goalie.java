public class Goalie extends Spieler{
    double koerpergroesse;

    Goalie(String name, double koerpergroesse) {
        super(name);
        this.koerpergroesse = koerpergroesse;
    }

    @Override
    void spielen() {
        System.out.println("Goalie " + name + " steht im Tor und nimmt am Spiel teil.");
    }
}
