package pl.sda.arp4.objects;

public class MainMis {

    public static void main(String[] args) {

        Mis mis1 = new Mis(10, "Tasha");
        Mis mis2 = new Mis(9, "Uszatek");

        System.out.println(mis1);
        System.out.println(mis2);
        System.out.println("Był sobie miś o imieniu " + mis1.getImie() + " który miał " + mis1.getWiek() + " lat");

    }
}
