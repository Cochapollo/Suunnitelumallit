package Suunnittelumallit.Tehtävä2.Factories;

import Suunnittelumallit.Tehtävä2.Products.*;

public class AdidasFactory implements ChineseFactory {

    @Override
    public Pants createPants() {
        return new AdidasPants();
    }

    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Hat createHat() {
        return new AdidasHat();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }

    @Override
    public String toString(){
        return createHat().toString()+", "+createShirt().toString()+", "+createPants().toString()+" ja "+createShoes().toString();
    }
}
