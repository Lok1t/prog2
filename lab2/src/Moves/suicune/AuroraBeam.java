package Moves.suicune;

import ru.ifmo.se.pokemon.*;

public class AuroraBeam extends SpecialMove {
    public AuroraBeam(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect = new Effect().chance(0.1).stat(Stat.ATTACK, -1);
        p.addEffect(effect);
    }
    @Override
    protected String describe() {
        return "использует AuroraBeam";
    }
}
