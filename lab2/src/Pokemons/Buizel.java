package Pokemons;

import Moves.Floatzel.*;
import ru.ifmo.se.pokemon.*;

public class Buizel extends Pokemon {
    public Buizel(String name, int level){
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(55, 65, 35, 60, 30, 85);

        RockTomb rockTomb = new RockTomb(60, 95);
        Confide confide = new Confide(0, 100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 100);
        super.setMove(rockTomb, confide, doubleTeam);
    }
}
