public class Angreifer extends Spieler{
    Angreifer(String name) {
        super(name);
    }

    // Erweiterung der spielen-Methode
    @Override
    void spielen() {
        System.out.println("Angreifer " + name + " ist im Angriff und nimmt am Spiel teil.");
    }

    void jogTraining() {
        System.out.println("Angreifer " + name + " macht Jogging-Training.");
    }
}
