package Pokemons;

import Moves.Floatzel.Confide;
import Moves.Shiftry.*;
import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon {
    public Seedot(String name, int level){
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(40, 40, 50, 30, 30, 30);

        Swagger swagger = new Swagger(0, 85);
        Confide confide = new Confide(0, 100);
        super.setMove(swagger, confide);
    }
}