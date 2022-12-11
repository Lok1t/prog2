package Moves.suicune;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    public Snarl(double pow, double acc) {
        super(Type.DARK, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "использует Snarl";
    }
}
