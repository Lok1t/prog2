package Moves.Shiftry;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        p.confuse();
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
