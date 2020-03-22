package Suunnittelumallit.Tehtävä2.Factories;

import Suunnittelumallit.Tehtävä2.Products.Hat;
import Suunnittelumallit.Tehtävä2.Products.Pants;
import Suunnittelumallit.Tehtävä2.Products.Shirt;
import Suunnittelumallit.Tehtävä2.Products.Shoes;

public interface ChineseFactory {
    Pants createPants();
    Shirt createShirt();
    Hat createHat();
    Shoes createShoes();
    String toString();
}
