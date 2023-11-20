import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Flug flug = new Flug();
        Passenger passenger = new Passenger();

        while (true) {
            flug.printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    flug.addPassenger(passenger);
                    break;
                case 2:
                    flug.removePassenger(passenger);
                    break;
                case 3:
                    flug.passengerListAusgeben();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}