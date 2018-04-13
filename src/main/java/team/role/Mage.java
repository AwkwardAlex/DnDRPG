package team.role;

import lombok.Getter;
import lombok.Setter;
import team.race.ElfRace;
import team.LeaderStatus;
import team.ManaMeter;

@Getter
@Setter
public class Mage extends ElfRace implements LeaderStatus, ManaMeter {

    private int mana;
    private double manaRegen;

    public Mage() {
        super("Mage");
        this.mana = getIntellect() * 2;
        this.manaRegen = (getIntellect() / 4) + (getConcentration() * 1.5);
    }
}

