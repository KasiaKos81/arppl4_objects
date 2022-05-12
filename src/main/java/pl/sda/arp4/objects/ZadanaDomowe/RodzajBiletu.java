package pl.sda.arp4.objects.ZadanaDomowe;

public enum RodzajBiletu {

    NORMALNY_GODZINA(0.3), // oddzielny obiekt => a
    ULGOWY_STUDENCKI(1.7),
    NORMALNY_CALODNIOWY(0.9),
    ULGOWY_EMERYT(5.3);


    // zmienna która jest stała :)
    private final double cena;

    RodzajBiletu(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}
