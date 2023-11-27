public class Spieler {
    String name;

    Spieler(String name) {
        this.name = name;
    }

    void zeigeName() {
        System.out.println("Spieler: " + name);
    }

    void spielen() {
        System.out.println("Spieler " + name + " nimmt am Spiel teil.");
    }
}
