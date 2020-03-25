package Suunnittelumallit.Tehtävä3;

import Suunnittelumallit.Tehtävä3.Components.*;
import Suunnittelumallit.Tehtävä3.Factories.NotSogoodPC;
import Suunnittelumallit.Tehtävä3.Factories.PCFactory;
import Suunnittelumallit.Tehtävä3.Factories.VeryGoodPC;

public class Main {

    public static Component buildPC(PCFactory p) {
        Component pc = p.createCase();
        Component storage = p.createSsd();
        Component power = p.createPower();
        Component mb = p.createMotherboard();
        Component cpu = p.createCpu();
        Component gpu = p.createGpu();
        Component ram = p.createRam();
        ((Case) pc).addComponent(power);
        ((Case) pc).addComponent(storage);
        ((Case) pc).addComponent(mb);
        ((Motherboard) mb).addComponent(gpu);
        ((Motherboard) mb).addComponent(cpu);
        ((Motherboard) mb).addComponent(ram);
        return pc;
    }

    public static void main(String[] args) {

        PCFactory p = new NotSogoodPC();
        PCFactory b = new VeryGoodPC();

        Component c = buildPC(p);
        System.out.print("\nHalvan tietokoneen:\n" + c + "Koneen kokonaishinta: " + c.getHinta() + "€\n");
        c = buildPC(b);
        System.out.print("\nMahtavan tietokoneen:\n" + c + "Koneen kokonaishinta: " + c.getHinta() + "€\n");

    }
}
