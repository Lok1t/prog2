package Moves.Floatzel;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(double pow, double acc) {
        super(Type.ROCK, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует RockTomb";
    }
}
