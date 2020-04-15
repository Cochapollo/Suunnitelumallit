package Suunnittelumallit.Tehtävä_13_Visitor.Creatures;

import Suunnittelumallit.Tehtävä_13_Visitor.State.Creature;
import Suunnittelumallit.Tehtävä_13_Visitor.State.CreatureState;
import Suunnittelumallit.Tehtävä_13_Visitor.Visitor.Visitor;

public class Charmander implements CreatureState {

    private int exp;

    @Override
    public void scream() { System.out.println("Charmander!"); }

    @Override
    public void run(Creature c) {
        System.out.println("Charmander runs away");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void attack(Creature c) {
        System.out.println("Charmader attacks the enemy");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void useAbility(Creature c) {
        System.out.println("Charmander Uses ability 'Tackle' ");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void evolve(Creature c) {
        System.out.println("\nCharmander evolves into Charmeleon\n");
        c.setState(new Charmeleon());
        c.Scream();
    }

    @Override
    public void accept(Visitor visitor) { visitor.visit(this); }

    @Override
    public void bonusExp(int i) {
        System.out.printf("Current Experience: %d\n",exp);
        exp += i;
        System.out.printf("Charmander gains %d bonus experience. Experience now %d\n",i,exp);
    }

    @Override
    public boolean experience() { return exp >= 10; }

    @Override
    public boolean maxlvl() { return false; }
}
