package team.abilities;

import dice.*;
import lombok.Getter;

@Getter
public enum PriestAbilities {
    FIST_ATTACK("Fist attack", 0, DiceTen.roll(), 0),
    LAY_OF_FISTS("Lay of Fists", 10, 3, 3),
    BATTLE_FURY("Battle Fury", 30, DiceSix.doubleRoll(), 4),
    HAND_OF_GOD("Hand of God", 25, 20, 2),
    BATTLE_TRANCE("Battle Trance", 65, 1, 4);

    public String name;
    public int cost;
    public int effect;
    public int cooldown;

    PriestAbilities(String name, int cost, int effect, int cooldown) {
        this.name = name;
        this.cost = cost;
        this.effect = effect;
        this.cooldown = cooldown;
    }
}
