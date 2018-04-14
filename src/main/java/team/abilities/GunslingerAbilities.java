package team.abilities;

import dice.DiceSix;
import dice.DiceTen;
import lombok.Getter;

@Getter
public enum GunslingerAbilities {
    BOW_ATTACK("Bow Attack", 0, DiceSix.doubleRoll(), 0),
    DAGGER_ATTACK("Dagger Attack", 0, DiceSix.roll(), 0),
    MULTISHOT("Multishot", 30, 1, 2),
    RAPIDFIRE("Rapidfire", 30, 1, 3),
    BULLSEYE("Bullseye", 40, DiceTen.tripleRoll(), 3);

    public String name;
    public int cost;
    public int effect;
    public int cooldown;

    GunslingerAbilities(String name, int cost, int effect, int cooldown) {
        this.name = name;
        this.cost = cost;
        this.effect = effect;
        this.cooldown = cooldown;
    }
}
