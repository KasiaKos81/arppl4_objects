package pl.sda.arp4.objects.kalkulator;

import java.util.Scanner;

public class MainNull {
    public static void main(String[] args) {

        // tworzymy kalkulator

        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();


        System.out.println("podaj liczbe 1");
        int liczbaPierwsza = scanner.nextInt();
        System.out.println("podaj liczbe 2");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Podaj działanie matematyczne (dodaj, odejmij, pomnoz, podziel):");
        String dzialanie = scanner.next();

        // doulbe (typ prymitywny) (tylko liczba)
        // Double (typ obiektowy / złozony / klasowy)
        // int -> Integer (typ obiektowy dla int)
        Integer wynik = null;
        switch(dzialanie) {
            case "dodaj":
                wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
                break;
            case "odejmij":
                wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
                break;
            case "pomnoz":
                wynik = kalkulator.pomnóż(liczbaPierwsza, liczbaDruga);
                break;
            case "podziel":
                try { // obsługa wyjątków, blok kodu w którym może wystapic bład
                    wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);

                    System.out.println("Wynik = " + wynik);
                } catch(ArithmeticException nazwaZmiennejWyjatku) {
                    // catch -> blok który wywoła sie jesli wystapi błąd i go złapiemy
                    System.out.println("Nie można dzielic przez zero");

                }
                break;
            default:
                System.out.println("Niepoprawna komenda");

        }
        if(wynik != null){
            System.out.println("Wynik= " + wynik);
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

