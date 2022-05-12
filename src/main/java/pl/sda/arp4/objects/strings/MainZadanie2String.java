package pl.sda.arp4.objects.strings;

import java.util.Locale;
import java.util.Scanner;

public class MainZadanie2String {

    public static void main(String[] args) {

      //  Wczytaj od użytkownika jedną linię tekstu i przypisz ją do zmiennej text a
        // a następnie wczytaj od użytkownika linię tekstu i przypisz je do zmiennej searched.
        // Następnie przeszukaj tekst w poszukiwaniu słowa przypisanego do zmiennej searched.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj linię tekstu");
        String text = scanner.nextLine();
        System.out.println("podaj słowo");
        String search = scanner.nextLine();
        System.out.println(text.toLowerCase().contains(search.toLowerCase()));

        System.out.println("znaleziono: " + text.contains(search));

        // wypisz alfabet a do z
        char i;
        for (i = 'A'; i <+ 'Z' ; i++) {
            System.out.print(i + " ");

        }






    }
}
