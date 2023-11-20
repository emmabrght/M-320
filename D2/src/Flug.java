import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flug {
    List<Passenger> passengers = new ArrayList<Passenger>();
    Scanner scanner = new Scanner(System.in);

   void printMenu() {
        System.out.println("Passenger List TUI");
        System.out.println("1. Add Passenger");
        System.out.println("2. Remove Passenger");
        System.out.println("3. Display Passenger List");
    }

    void addPassenger(Passenger passenger){
        System.out.print("Enter passenger name: ");
        String nameToAdd = scanner.nextLine();
        passengers.add(passenger);
        passenger.setName(nameToAdd);
        System.out.println(passenger.getName() + " added to the passenger list.");
    }
    void removePassenger(Passenger passenger){
        System.out.print("Enter passenger name to remove: ");
        String nameToRemove = scanner.nextLine();
        boolean passengerFound = false;
        for (Passenger p : passengers) {
            if (p.getName().equals(nameToRemove)) {
                passengers.remove(p);
                passengerFound = true;
                System.out.println(passenger.getName() + " removed from the passenger list.");
                break;
            }
        }
         if (!passengerFound) {
            System.out.println(nameToRemove + " not found in the passenger list.");
        }
    }
    void passengerListAusgeben(){
        for (Passenger p: passengers) {
            p.nameAusgeben();
        }
    }
}
