package Suunnittelumallit.Tehtävä2.Factories;

import Suunnittelumallit.Tehtävä2.Products.*;

public class BossFactory implements ChineseFactory {

    @Override
    public Pants createPants() {
        return new BossPants();
    }

    @Override
    public Shirt createShirt() {
        return new BossShirt();
    }

    @Override
    public Hat createHat() {
        return new BossHat();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }

    @Override
    public String toString(){
        return createHat().toString()+", "+createShirt().toString()+", "+createPants().toString()+" ja "+createShoes().toString();
    }
}
