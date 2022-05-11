package pl.sda.arp4.objects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// wypisanie wszystkich dostepnych opcji enum
        for (RodzajPojazdu rodzaj : RodzajPojazdu.values()) {
            System.out.println(rodzaj);

        }
        Scanner scanner = new Scanner(System.in);
        RodzajPojazdu zmienna = null;
        while (zmienna == null) {

        System.out.println("Podaj rodzaj pojazdu");
        String rodzajString = scanner.next();

        //zamiast pisać if/else dla wszystkich rozdajów i porównywać
        // możemy zastosować metodę .valueOf która wygenerowana jest dla każdego typu wyliczeniowego (enum)

        try {
            zmienna = RodzajPojazdu.valueOf(rodzajString.toUpperCase());
            System.out.println(zmienna);
        } catch (IllegalArgumentException iae){
            System.out.println("Wybrana opcja nie istnieje");
        }

    }
        System.out.println(zmienna);

}}
