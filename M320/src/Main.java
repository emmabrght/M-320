import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Heizung heizung1 = new Heizung(14, 15, 12, 13);

        Heizung heizung2 = new Heizung(12, 13, 14, 15);

        System.out.println(heizung1.getTemperature());
        System.out.println(heizung2.getTemperature());
        System.out.println(heizung2.makeItColder(2));
    }
}