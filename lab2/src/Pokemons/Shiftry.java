package Pokemons;

import Moves.Shiftry.*;
import ru.ifmo.se.pokemon.Type;

public class Shiftry extends Nuzleaf{
    public Shiftry(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.DARK);
        super.setStats(90, 100,60,90,60,80);

        AerialAce aerialAce = new AerialAce(60, 10000);
        super.setMove(aerialAce);
    }
}
