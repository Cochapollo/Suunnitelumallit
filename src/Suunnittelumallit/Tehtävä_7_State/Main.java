package Suunnittelumallit.Tehtävä_7_State;

import Suunnittelumallit.Tehtävä_7_State.CreatureState.Creature;
import Suunnittelumallit.Tehtävä_7_State.Creatures.Koffing;

public class Main {

    public static void main(String[] args) {
        Creature c = new Creature(new Koffing());
        c.Scream();
        do {
            c.Attack();
            c.Run();
            c.useAbility();
        }while (!c.getMaxlvl());

    }
}
