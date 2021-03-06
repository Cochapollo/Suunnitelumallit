package Suunnittelumallit.Tehtävä3.Components;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements Component {

    private String nimi;
    private float hinta;
    private List<Component> list = new ArrayList<>();

    public Motherboard(String nimi, float hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public void addComponent(Component c) {
        list.add(c);
    }

    @Override
    public float getHinta() {
        float t = hinta;
        for (Component c : list) {
            t += c.getHinta();
        }
        return t;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Component c : list) s.append(c+"\n");
        return nimi + " " + hinta + "€\n" + s;
    }
}
