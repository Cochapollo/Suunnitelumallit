package Suunnittelumallit.Tehtävä1;

public class Lapsi extends AterioivaOtus {
    @Override
    public Juoma createJuoma() {
        return new Maito();
    }
}
