package battle;

import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {
    public static void main(String[] args) {
        Battle b = new Battle();
        Buizel buizel = new Buizel("Бульба", 32);
        Suicune suicune = new Suicune( "Чемп", 78);
        Floatzel floatzel = new Floatzel("Картошка", 26);
        Nuzleaf  nuzleaf = new Nuzleaf("Росток", 43);
        Shiftry shiftry = new Shiftry("Дерево", 40);
        Seedot seedot = new Seedot("Жёлудь", 87);
        b.addAlly(buizel);
        b.addAlly(suicune);
        b.addAlly(floatzel);
        b.addFoe(nuzleaf);
        b.addFoe(shiftry);
        b.addFoe(seedot);
        b.go();
    }
}
