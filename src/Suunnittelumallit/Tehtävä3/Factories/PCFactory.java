package Suunnittelumallit.Tehtävä3.Factories;

import Suunnittelumallit.Tehtävä3.Components.Component;

public interface PCFactory {
    Component createCase();
    Component createMotherboard();
    Component createCpu();
    Component createGpu();
    Component createRam();
    Component createSsd();
    Component createPower();

}
