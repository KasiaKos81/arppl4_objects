package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie1String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz tekst");
        String tekst = scanner.nextLine();

        // sprawdz czy w tekscie znajduje sie slowo ania

        if (tekst.contains("ania")){
        System.out.println("tekst zawiera słowo ania");
        } else {
            System.out.println("teskst nie zawiera slowa ania");
        }

        // czy zaczyna sie od slowa ania

        System.out.println("starts with " + tekst.startsWith("ania"));

        // czy konczy sie słowem ania
        System.out.println("ends with " + tekst.endsWith("ania"));

        // czy tekst równa sie slowu ania
        System.out.println("equals: " + tekst.equals("ania"));

        // sprawdz czy tekst (niezaleznie od wielkosci) zawiera ania
        System.out.println("equals: " + tekst.toLowerCase().contains("ania"));

        // zwróć indeks (nr znaku/litery) pierwszego wsytąpienia słowa ania
        System.out.println("indexOf: " + tekst.indexOf("ania"));



    }
}
