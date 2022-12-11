package Pokemons;

import Moves.suicune.*;
import ru.ifmo.se.pokemon.*;

public class Suicune extends Pokemon {
    public Suicune(String name, int level){
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(100, 75, 115, 90, 115, 85);

        HydroPump hydroPump = new HydroPump(110, 80);
        AuroraBeam auroraBeam = new AuroraBeam(65, 100);
        Snarl snarl = new Snarl(55, 95);
        CalmMind calmMind = new CalmMind(0, 100);
        super.setMove(hydroPump, auroraBeam, snarl, calmMind);
    }
}
