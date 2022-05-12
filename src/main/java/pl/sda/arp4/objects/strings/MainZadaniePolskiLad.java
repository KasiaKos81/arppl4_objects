package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadaniePolskiLad {

    // Napisać program obliczający należny podatek dochodowy od osób ﬁzycznych. W programie zdefiniuj wartość dochód (double) na pewną wartość i po obliczeniu wypisywać na ekranie należny podatek. Podatek obliczany jest wg. następujących reguł:
    // do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
    //od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00

    public static void main(String[] args) {

        final double PROG_PODATKOWY = 85520;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dochód");

        double dochod = scanner.nextDouble();
        double podatek;

        if(dochod <= PROG_PODATKOWY) {
            podatek = dochod * 0.18 - 556.02;
        } else {
            double nadwyzka = dochod - PROG_PODATKOWY;
            podatek = 14839.02 + (nadwyzka * 0.32);
        }
        System.out.println("podatek wynosi " + podatek);



    }
}
