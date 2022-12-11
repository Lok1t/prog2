package Pokemons;

import Moves.Shiftry.*;
import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Seedot{
    public Nuzleaf(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.DARK);
        super.setStats(70, 70,40,60,40,60);

        Extrasensory extrasensory = new Extrasensory(80, 100);
        super.setMove(extrasensory);
    }
}
