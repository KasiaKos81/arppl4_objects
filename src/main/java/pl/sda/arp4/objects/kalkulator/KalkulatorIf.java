package pl.sda.arp4.objects.kalkulator;

import java.util.Scanner;

public class KalkulatorIf {
    public static void main(String[] args) {

        // tworzymy kalkulator

        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        int wynik;

        System.out.println("podaj liczbe 1");
        int liczbaPierwsza = scanner.nextInt();
        System.out.println("podaj liczbe 2");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Podaj działanie matematyczne (dodaj, odejmij, pomnoz, podziel):");
        String dzialanie = scanner.next();

        if ("dodaj".equals(dzialanie)) {
            wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("odejmij".equals(dzialanie)) {
            wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("pomnoz".equals(dzialanie)) {
            wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
            System.out.println("Wynik = " + wynik);
        } else if ("podziel".equals(dzialanie)) {
            try { // obsługa wyjątków, blok kodu w którym może wystapic bład
                wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);

                System.out.println("Wynik = " + wynik);
            } catch (ArithmeticException nazwaZmiennejWyjatku) {
                // catch -> blok który wywoła sie jesli wystapi błąd i go złapiemy
                System.out.println("Nie można dzielic przez zero");
            }
        } else {
            System.out.println("Niepoprawna komenda");
        }

     //   wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
       // System.out.println("Wynik = " + wynik);

        //wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
        //System.out.println("Wynik = " + wynik);

        //wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
        //System.out.println("Wynik = " + wynik);

        //try { // obsługa wyjątków, blok kodu w którym może wystapic bład
          //  wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);

            //System.out.println("Wynik =" + wynik);
        //} catch(ArithmeticException nazwaZmiennejWyjatku) {
            // catch -> blok który wywoła sie jesli wystapi błąd i go złapiemy
          //  System.out.println("Nie można dzielic przez zero");

        }

    }

