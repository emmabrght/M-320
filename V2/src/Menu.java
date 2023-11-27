import java.util.Scanner;

/**
 * Class representing a menu for managing a soccer team.
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        Goalie goalie = null;
        Angreifer[] angreifer = null;
        Verteidiger[] verteidiger = null;
        Mannschaft mannschaft = null;

        do {
            printMenu();
            System.out.print("Please enter your choice (1/2, 0 to exit): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    goalie = createGoalie(scanner);
                    angreifer = createAngreiferArray(scanner);
                    verteidiger = createVerteidigerArray(scanner);

                    mannschaft = new Mannschaft(goalie, angreifer, verteidiger);
                    break;
                case 2:
                    if (mannschaft != null) {
                        System.out.println();
                        System.out.println("Goalie: ");
                        mannschaft.spielerHinzufuegen(goalie);
                        System.out.println("Angreifer:");
                        for (Angreifer an : angreifer) {
                            mannschaft.spielerHinzufuegen(an);
                        }
                        System.out.println();
                        System.out.println("verteidiger: ");
                        for (Verteidiger ve : verteidiger) {
                            mannschaft.spielerHinzufuegen(ve);
                        }
                    } else {
                        System.out.println("Please create a team first (Option 1)");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
            }
        } while (choice != 0);
    }

    /**
     * Method for printing the menu options.
     */
    private static void printMenu() {
        System.out.println();
        System.out.println("Mannschaft ");
        System.out.println("1. Mannschaft erstellen");
        System.out.println("2. Mannschaft ausdrucken");
        System.out.println("3. Exit");
        System.out.println();
    }

    /**
     * Method for creating a goalie with user input.
     * @param scanner The Scanner object for user input.
     * @return The created Goalie object.
     */
    private static Goalie createGoalie(Scanner scanner) {
        System.out.print("Name des Goalie: ");
        String name = scanner.nextLine();
        System.out.print("Körpergröße des Torwarts (in Metern): ");
        double koerpergroesse = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        return new Goalie(name, koerpergroesse);
    }

    /**
     * Method for creating an array of attackers with user input.
     * @param scanner The Scanner object for user input.
     * @return The array of created Angreifer objects.
     */
    private static Angreifer[] createAngreiferArray(Scanner scanner) {
        System.out.print("Anzahl der Angreifer: ");
        int numAngreifer = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Angreifer[] angreifer = new Angreifer[numAngreifer];
        for (int i = 0; i < numAngreifer; i++) {
            System.out.print("Name des Angreifers " + (i + 1) + ": ");
            String name = scanner.nextLine();
            angreifer[i] = new Angreifer(name);
        }
        return angreifer;
    }

    /**
     * Method for creating an array of defence with user input.
     * @param scanner The Scanner object for user input.
     * @return The array of created Verteidiger objects.
     */
    private static Verteidiger[] createVerteidigerArray(Scanner scanner) {
        System.out.print("Anzahl der Verteidiger: ");
        int numVerteidiger = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Verteidiger[] verteidiger = new Verteidiger[numVerteidiger];
        for (int i = 0; i < numVerteidiger; i++) {
            System.out.print("Name des Verteidigers " + (i + 1) + ": ");
            String name = scanner.nextLine();
            verteidiger[i] = new Verteidiger(name);
        }
        return verteidiger;
    }
}