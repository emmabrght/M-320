import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Heizung heizung1 = new Heizung(14, 30, 45, 13);

        Heizung heizung2 = new Heizung(17, 30, 45, 14);

        System.out.println(heizung1.getTemperature());
        System.out.println(heizung2.getTemperature());
        heizung1.makeItWarmer();
        heizung2.makeItColder();

    }
}