package pl.sda.arp4.objects.ZadanaDomowe;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieObywatel2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plec plec = null;
        do {
            System.out.println("Podaj plec (" + Arrays.toString(Plec.values()) + "): ");
            String wpisaneSlowo = scanner.next();
            try {
                plec = Plec.valueOf(wpisaneSlowo.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.err.println("Nie ma takiej opcji.");
            }
        } while (plec == null);

        System.out.println("Podaj swoje imie:");
        String wpisaneImie = scanner.next();

        System.out.println("Podaj swoje nazwisko:");
        String wpisaneNazwisko = scanner.next();

        System.out.println("Podaj swoje pesel:");
        String wpisanePesel = scanner.next();

        Obywatel2 obywatel = new Obywatel2(wpisaneImie, wpisaneNazwisko, wpisanePesel, plec);
        obywatel.przedstawSie();
    }
}
