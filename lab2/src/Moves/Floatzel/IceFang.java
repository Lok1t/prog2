package Moves.Floatzel;

import ru.ifmo.se.pokemon.*;

public class IceFang extends PhysicalMove {
    public IceFang(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect freeze = new Effect().chance(0.1).condition(Status.FREEZE);
        p.addEffect(freeze);
        if(Math.random() < 0.1){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует IceFang";
    }
}
