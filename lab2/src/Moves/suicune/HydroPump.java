package Moves.suicune;

import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove {
    public HydroPump(double pow, double acc) {
        super(Type.WATER, pow, acc);
    }

    @Override
    protected String describe() {
        return "использует HydroPump";
    }
}
