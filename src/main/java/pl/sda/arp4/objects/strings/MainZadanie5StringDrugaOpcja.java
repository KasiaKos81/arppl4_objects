package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie5StringDrugaOpcja {

    // Napisz program który zlicza wystąpienia liter w tekście. Posłuż się do tego pętlami for/while.
    // (spróbuj zaimplementować na dwa sposoby).
    //sposób 1/wskazówka 1: wykorzystaj kody ascii liter i iteruj tekst tyle razy,
    // ile mamy liter w alfabecie i porównuj litery z kodami ascii
    //*sposób 2/wskazówka 2: wykorzystaj do zliczania dodatkową tablicę.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj test");
        String text = scanner.nextLine();

        char[] znaki = text.toCharArray();
        int[] zliczeniaZnakow = new int[127];

        for (int i = 0; i < znaki.length; i++) {
            char znak = znaki[i];
            zliczeniaZnakow[znak] = zliczeniaZnakow[znak] + 1; // ++ inkrementacja
        }
        for (int i = 0; i < zliczeniaZnakow.length; i++) {
            if(zliczeniaZnakow[i] > 0){
                System.out.println(((char)i) + " ->" + zliczeniaZnakow[i]); // (char) = konwersja ina na char
            }

        }





                }

            }


