package Suunnittelumallit.Tehtävä_14_Builder;

import Suunnittelumallit.Tehtävä_14_Builder.Builder.BurgerBuilder;
import Suunnittelumallit.Tehtävä_14_Builder.Builder.Hesburger;
import Suunnittelumallit.Tehtävä_14_Builder.Builder.McDonalds;

public class Main {

    public static void main(String[] args) {
        MasterChef d = new MasterChef();
        BurgerBuilder hesburger = new Hesburger();
        BurgerBuilder mcDonalds = new McDonalds();
        d.setBurgerBuilder(hesburger);
        d.constructBurger();
        System.out.println(d.getBurger());
        d.setBurgerBuilder(mcDonalds);
        d.constructBurger();
        System.out.println(d.getBurger());
    }
}
