package Moves.Shiftry;

import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove {
    public Extrasensory(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.1){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Extrasensory";
    }
}
