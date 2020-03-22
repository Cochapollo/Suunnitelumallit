package Suunnittelumallit.Tehtävä1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus lapsi = new Lapsi();
        opettaja.aterioi();
        lapsi.aterioi();
        opiskelija.aterioi();
    }
}
