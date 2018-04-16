package team.role;

import lombok.Getter;
import lombok.Setter;
import team.UnitData;
import team.ManaMeter;
import team.race.ElfRace;

@Getter
@Setter
public class Mage extends ElfRace implements UnitData, ManaMeter {

    private int mana;
    private double manaRegen;
    private static final int STARTING_HEALTH = 100;

    public Mage() {
        super("Mage");
        this.mana = getIntellect() * 2;
        this.manaRegen = (getIntellect() / 4) + (getConcentration() * 1.5);
    }
}

