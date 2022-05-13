package pl.sda.arp4.objects.ZadanaDomowe;

import java.util.Scanner;

public class Cezar {

    // Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego monoalfabetycznego.
    // Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n, o którą przesunięty jest alfabet za pomocą którego szyfrujemy tekst.
    // Dla uproszczenia można przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego, tj. 'a' – 'z' (26 znaków) oraz spacji.
    //
    //Przykład 1.
    //        Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
    //        Podaj przesunięcie: 2
    //        Zaszyfrowany tekst: cdtcmcfcdtcb
    //    Przykład 2.
    //        Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
    //        Podaj przesunięcie: -2
    //        Zaszyfrowany tekst: abrakadabraz

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ciąg znaków");
        String podaneZnaki = scanner.nextLine();
        String podaneZnakiPoPrzesunieciu = " ";
        System.out.println("podaj o ile znaki mają się przesunąć - (liczbę)");
        int n = scanner.nextInt();
        for (int i = 0; i < podaneZnaki.length(); i++) {
            char c = (char) (podaneZnaki.charAt(i) + n);

            podaneZnakiPoPrzesunieciu = podaneZnakiPoPrzesunieciu + c;

            }
        System.out.println("tekst po szyfrowaniu " + podaneZnakiPoPrzesunieciu);

        }

    }

