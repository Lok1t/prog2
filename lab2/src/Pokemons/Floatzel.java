package Pokemons;

import Moves.Floatzel.*;
import ru.ifmo.se.pokemon.*;

public class Floatzel extends Buizel {
    public Floatzel(String name, int level){
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(85, 105, 55, 85, 50, 115);

        IceFang iceFang = new IceFang(65, 95);
        super.setMove(iceFang);
    }
}
