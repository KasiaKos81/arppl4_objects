package pl.sda.arp4.objects.ZadanaDomowe;

public class Obywatel2 {
    private String imie;
    private String nazwisko;
    private String pesel;
    private Plec plec;

    public Obywatel2(String imie, String nazwisko, String pesel, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.plec = plec;
    }
    public void przedstawSie(){
        System.out.println("Nazywam sie " + imie + nazwisko + "urodzilem sie ");
    }

    @Override
    public String toString() {
        return "Obywatel2{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", plec=" + plec +
                '}';
    }
}
