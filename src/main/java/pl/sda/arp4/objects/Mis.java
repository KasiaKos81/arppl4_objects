package pl.sda.arp4.objects;

public class Mis {

    private int wiek;
    private String imie;

    public Mis(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Mis{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
