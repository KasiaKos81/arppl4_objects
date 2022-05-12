package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadanie5String {

    // Napisz program który zlicza wystąpienia liter w tekście. Posłuż się do tego pętlami for/while.
    // (spróbuj zaimplementować na dwa sposoby).
    //sposób 1/wskazówka 1: wykorzystaj kody ascii liter i iteruj tekst tyle razy,
    // ile mamy liter w alfabecie i porównuj litery z kodami ascii
    //*sposób 2/wskazówka 2: wykorzystaj do zliczania dodatkową tablicę.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] znaki = text.toCharArray();

        for (int i = 0; i < znaki.length; i++) {
            char literkai = znaki[i];

            int licznik = 0;
            for (int j = 0; j < znaki.length; j++) {
                char literkaj = znaki[j];

                if((j < i) && (literkai == literkaj)){
                    break;

                }
                if (literkai == literkaj) {
                    licznik = licznik + 1;
                }
            }

            // wypisz tylko jeśli licznik != 0
            // będzie = 0 jeśli obecna litera jest powtórzona.
            if (licznik != 0) {
                System.out.println(literkai + " ->" + licznik);
            }
        }

                }

            }


