package Suunnittelumallit.Tehtävä1;

public class Opiskelija extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Kalja();
    }
}
