package pl.sda.arp4.objects.ZadanaDomowe;

import java.util.Scanner;

public class Zadanie1Bilet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RodzajBiletu rodzaj = null;

        do {

            // poaj rodzaj (dostępne rodzaje: NORMALNY, ULGOWY_STUDENCKI itd)
            System.out.print("Podaj rodzaj biletu (dostępne rodzaje: ");
            for(RodzajBiletu rozdajBiletu : RodzajBiletu.values()){
                System.out.println(rozdajBiletu + " ");
            }
            System.out.println("):");

            String wpisaneSlowo = scanner.next();
            try{
                RodzajBiletu.valueOf(wpisaneSlowo);
            } catch (IllegalArgumentException iae){
                System.err.println("Nie ma takiej opcji");
            }

        } while (rodzaj == null);


        System.out.println("Podaj ilość biletów które chcesz kupić:");
        int iloscBiletow = scanner.nextInt();

        System.out.println("Cena biletów to: " + (iloscBiletow* rodzaj.getCena()));
    }
}







