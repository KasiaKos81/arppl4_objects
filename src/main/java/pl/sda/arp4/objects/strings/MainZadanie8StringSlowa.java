package pl.sda.arp4.objects.strings;

public class MainZadanie8StringSlowa {

    public static void main(String[] args) {
      //  8. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na poszczególne słowa.
        //  Następnie aplikacja zlicza ilości wystąpień słów. Np. dla tekstu
       // ala lubi koty, ale ala nie jest przez koty lubiana
       // ala - 2
        //lubi - 1
        // koty - 2
        // ale - 1
        // nie - 1
        // jest - 1
        // przez - 1
        // lubiana - 1

        String tekst = "ala, ma kota";

        String[] slowa = tekst.split(" ");
        String alaPrzecinek = "ala, ";
        String wynikAlaBezPrzecinka = alaPrzecinek.replaceAll(",", "");
    }

}
