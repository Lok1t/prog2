package Moves.Shiftry;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc) {
        super(Type.FLYING, pow, acc);
    }

    @Override
    protected String describe() {
        return "использует AerialAce";
    }
}
