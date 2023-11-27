import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mannschaft mannschaft = erstelleMannschaft();

        int choice;
        do {
            System.out.println("Menü:");
            System.out.println("1. Spieler erstellen");
            System.out.println("2. Spieler zur Mannschaft hinzufügen");
            System.out.println("3. Spiel starten");
            System.out.println("0. Beenden");
            System.out.print("Auswahl: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Spieler spieler = erstelleSpieler();
                    mannschaft.spielerHinzufuegen(spieler);
                    break;
                case 2:
                    System.out.println("Spieler zur Mannschaft hinzufügen:");
                    System.out.print("Name des Spielers: ");
                    String spielerName = scanner.next();
                    Spieler existierenderSpieler = new Spieler(spielerName);
                    mannschaft.spielerHinzufuegen(existierenderSpieler);
                    break;
                case 3:
                        spielStarten(mannschaft);
                    break;
            }
        } while (choice != 0);
    }

    private static Mannschaft erstelleMannschaft() {
        return new Mannschaft(null, new ArrayList<>(), new ArrayList<>(), 21);
    }

    private static Spieler erstelleSpieler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Spieler erstellen:");
        System.out.print("Name des Spielers: ");
        String name = scanner.next();
        System.out.print("Rolle (Goalie, Angreifer, Verteidiger): ");
        String rolle = scanner.next();

        switch (rolle.toLowerCase()) {
            case "goalie":
                System.out.print("Körpergröße des Goalies: ");
                double koerpergroesse = scanner.nextDouble();
                return new Goalie(name, koerpergroesse);
            case "angreifer":
                return new Angreifer(name);
            case "verteidiger":
                return new Verteidiger(name);
            default:
                System.out.println("Ungültige Rolle. Spieler wird als Standardspieler erstellt.");
                return new Spieler(name);
        }
    }

    private static void spielStarten(Mannschaft mannschaft) {
        System.out.println("Spiel gestartet!");

        if (mannschaft.goalie != null) {
            mannschaft.goalie.spielen();
        } else {
            System.out.println("Es gibt keinen Spieler im Team.");
        }

        for (Angreifer angreifer : mannschaft.getAngreiferList()) {
            angreifer.spielen();
        }

        for (Verteidiger verteidiger : mannschaft.getVerteidigerList()) {
            verteidiger.spielen();
        }
    }

}