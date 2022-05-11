package pl.sda.arp4.objects;

import java.util.Scanner;

public class Obywatel {

    private String imie;
    private String pesel;

    public Obywatel(String imie, String pesel) {
        this.imie = imie;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "imie='" + imie + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}


