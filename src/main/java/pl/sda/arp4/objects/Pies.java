package pl.sda.arp4.objects;

public class Pies {

    // modyfikatory dostepu
    // / private
    // ' 'default aka niejawny aka 'package protected'
    // protected
    // public

    String imie;
// konstruktor bezparametrowy
  //  public Pies() {
   // }


  //  public Pies(String imie) {
    //    this.imie = imie;
    // }

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
