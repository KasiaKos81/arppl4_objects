package pl.sda.arp4.objects.modele;

import java.util.Scanner;

public class MainObywatel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        String imie = scanner.next();

        System.out.println("Podaj pesel");
        String pesel = scanner.next();

        Obywatel obywatel1 = new Obywatel(imie, pesel);

        System.out.println(obywatel1);






    }
}
