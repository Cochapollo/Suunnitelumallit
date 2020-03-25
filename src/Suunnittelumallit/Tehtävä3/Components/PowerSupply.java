package Suunnittelumallit.Tehtävä3.Components;

public class PowerSupply implements Component{

    private String nimi;
    private float hinta;

    public PowerSupply(String nimi, float hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public float getHinta() {
        return hinta;
    }

    @Override
    public String toString(){
        return nimi + " " + hinta + "€";
    }
}
