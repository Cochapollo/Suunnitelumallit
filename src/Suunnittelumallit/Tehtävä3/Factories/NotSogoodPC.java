package Suunnittelumallit.Tehtävä3.Factories;

import Suunnittelumallit.Tehtävä3.Components.*;

public class NotSogoodPC implements PCFactory{
    @Override
    public Component createCase() {
        return new Case("Cheep Case",65);
    }

    @Override
    public Component createMotherboard() { return new Motherboard("Cheep Motherboard",55); }

    @Override
    public Component createCpu() {
        return new Cpu("Cheep CPU",55);
    }

    @Override
    public Component createGpu() {
        return new Gpu("Cheep GPU",100);
    }

    @Override
    public Component createRam() {
        return new Ram("1 x DDR 3 4 Gt",10);
    }

    @Override
    public Component createSsd() { return new HardDrive("200 Gt Hard Drive",15); }

    @Override
    public Component createPower() { return new PowerSupply("Cheep PowerSupply", 25); }

}
