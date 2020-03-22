package Suunnittelumallit.Tehtävä2;

import Suunnittelumallit.Tehtävä2.Factories.BossFactory;
import Suunnittelumallit.Tehtävä2.Factories.ChineseFactory;

public class Main {
    public static void main(String[] args) {
        // vaihda tätä nii vaihtuu vaatteet
        ChineseFactory lol = new BossFactory();
        System.out.println("Jasperilla on päällään " +lol.toString());
    }


}
