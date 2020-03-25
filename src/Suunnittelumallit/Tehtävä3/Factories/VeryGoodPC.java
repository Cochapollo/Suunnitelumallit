package Suunnittelumallit.Tehtävä3.Factories;

import Suunnittelumallit.Tehtävä3.Components.*;

public class VeryGoodPC implements PCFactory{
    @Override
    public Component createCase() {
        return new Case("RGP very cool Case", 500);
    }

    @Override
    public Component createMotherboard() {
        return new Motherboard("Motherboard", 200);
    }

    @Override
    public Component createCpu() { return new Cpu("Radeon 3990x", 2200); }

    @Override
    public Component createGpu() {
        return new Gpu("RTX 2080 Ti", 2800);
    }

    @Override
    public Component createRam() {
        return new Ram("8xRGP 3600 mHz Ram", 1200);
    }

    @Override
    public Component createSsd() { return new HardDrive("2 x 2 Tb M.2 SSD", 1200); }

    @Override
    public Component createPower() { return new PowerSupply("Corsair RM850x White Series, 80 PLUS Gold -ATX-virtalähde, 850 W", 179); }

}