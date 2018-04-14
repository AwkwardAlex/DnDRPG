package team.abilities;

import dice.DiceSix;
import dice.DiceTen;
import lombok.Getter;

@Getter
public enum  MageAbilities {
    ATTACK("Basic attack", 0, DiceSix.roll(), 0),
    FIREBALL("Fireball", 45, DiceTen.doubleRoll(), 3),
    SPELL_SHIELD("Spell Shield", 15, 60, 2),
    FROST_BOLT("Frost Bolt", 20, DiceSix.doubleRoll(), 1),
    DISPELL("Dispell", 20, 1, 3),
    STONE_GAZE("Stone Gaze", 20, 2, 4);

    public String name;
    public int cost;
    public int effect;
    public int cooldown;

    MageAbilities(String name, int cost, int effect, int cooldown) {
        this.name = name;
        this.cost = cost;
        this.effect = effect;
        this.cooldown = cooldown;
    }
}
