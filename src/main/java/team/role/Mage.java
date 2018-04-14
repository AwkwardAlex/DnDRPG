package team.role;

import lombok.Getter;
import lombok.Setter;
import team.LeaderStatus;
import team.ManaMeter;
import team.race.ElfRace;

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

