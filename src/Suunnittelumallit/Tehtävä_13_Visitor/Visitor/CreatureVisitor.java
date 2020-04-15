package Suunnittelumallit.Tehtävä_13_Visitor.Visitor;

import Suunnittelumallit.Tehtävä_13_Visitor.Creatures.Charizard;
import Suunnittelumallit.Tehtävä_13_Visitor.Creatures.Charmander;
import Suunnittelumallit.Tehtävä_13_Visitor.Creatures.Charmeleon;

public class CreatureVisitor implements Visitor {

    @Override
    public void visit(Charmander k) { k.bonusExp(2); }

    @Override
    public void visit(Charmeleon w) { w.bonusExp(4); }

    @Override
    public void visit(Charizard c) { c.bonusExp(6); }
}
