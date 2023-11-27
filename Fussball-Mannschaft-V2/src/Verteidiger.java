public class Verteidiger extends Spieler{
    Verteidiger(String name) {
        super(name);
    }

    // Erweiterung der spielen-Methode
    @Override
    void spielen() {
        System.out.println("Verteidiger " + name + " verteidigt und nimmt am Spiel teil.");
    }
}
