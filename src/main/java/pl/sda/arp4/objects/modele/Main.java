package pl.sda.arp4.objects.modele;

public class Main {

    public static void main(String[] args) {

        // java jako język obiektowy
        // obietk typu samochód
        // obiekt typu.. kot, pies, itd

        Pies pies1 = new Pies();
        pies1.imie = "Burek";
        System.out.println(pies1);

        Pies pies2 = new Pies();
        pies2.imie = "Waclaw";
        System.out.println(pies2);

        Student student1 = new Student("Kasia", "Kos");
     //   student1.imie = "Kasia";
       // student1.nazwisko = "Kos";
        System.out.println(student1);
        System.out.println("Ten student ma na imię " + student1.getImie());

        student1.przedstawSie();
    }



}
