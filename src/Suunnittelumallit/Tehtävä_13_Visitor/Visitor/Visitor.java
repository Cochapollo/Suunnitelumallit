package Suunnittelumallit.Tehtävä_13_Visitor.Visitor;

import Suunnittelumallit.Tehtävä_13_Visitor.Creatures.Charizard;
import Suunnittelumallit.Tehtävä_13_Visitor.Creatures.Charmander;
import Suunnittelumallit.Tehtävä_13_Visitor.Creatures.Charmeleon;

public interface Visitor {
    void visit(Charmander k);
    void visit(Charmeleon w);
    void visit(Charizard c);
}
