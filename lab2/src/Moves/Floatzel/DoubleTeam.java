package Moves.Floatzel;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected  void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe() {
        return "использует DoubleTeam";
    }
}
