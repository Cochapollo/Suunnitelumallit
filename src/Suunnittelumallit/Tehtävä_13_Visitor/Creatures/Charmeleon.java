package Suunnittelumallit.Tehtävä_13_Visitor.Creatures;

import Suunnittelumallit.Tehtävä_13_Visitor.State.Creature;
import Suunnittelumallit.Tehtävä_13_Visitor.State.CreatureState;
import Suunnittelumallit.Tehtävä_13_Visitor.Visitor.Visitor;

public class Charmeleon implements CreatureState {

    private int exp;

    @Override
    public void scream() { System.out.println("Charmeleon!"); }

    @Override
    public void run(Creature c) {
        System.out.println("Charmeleon runs away");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void attack(Creature c) {
        System.out.println("Charmeleon attack the enemy");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void useAbility(Creature c) {
        System.out.println("Charmeleon uses ability 'Ember' ");
        exp++;
        if (experience()) evolve(c);
    }

    @Override
    public void evolve(Creature c) {
        System.out.println("\nCharmeleon evolves into Charizard\n");
        c.setState(new Charizard());
        c.Scream();
    }

    @Override
    public void accept(Visitor visitor) { visitor.visit(this);}

    @Override
    public void bonusExp(int i) {
        System.out.printf("Current Experience: %d\n",exp);
        exp += i;
        System.out.printf("Charmeleon gains %d bonus experience. Experience now %d\n",i,exp);
    }

    @Override
    public boolean experience() { return exp >= 15; }

    @Override
    public boolean maxlvl() { return false; }
}
