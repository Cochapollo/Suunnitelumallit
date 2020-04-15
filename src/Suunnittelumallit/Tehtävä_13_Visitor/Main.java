package Suunnittelumallit.Tehtävä_13_Visitor;

import Suunnittelumallit.Tehtävä_13_Visitor.Creatures.Charmander;
import Suunnittelumallit.Tehtävä_13_Visitor.State.Creature;
import Suunnittelumallit.Tehtävä_13_Visitor.Visitor.CreatureVisitor;
import Suunnittelumallit.Tehtävä_13_Visitor.Visitor.Visitor;

public class Main {

    public static void main(String[] args) {
        Creature c = new Creature(new Charmander());
        Visitor v = new CreatureVisitor();
        c.Scream();
        do {
            c.accept(v);
            c.Attack();
            c.Run();
            c.useAbility();
        }while (!c.getMaxlvl());

    }
}
