package team.role;

import lombok.Getter;
import lombok.Setter;
import team.ManaMeter;
import team.LeaderStatus;
import team.race.ElfRace;

@Getter
@Setter
public class Gunslinger extends ElfRace implements LeaderStatus, ManaMeter {

    private int mana;
    private double manaRegen;

    public Gunslinger() {
        super("Gunslinger");
        this.mana = getIntellect() * 2;
        this.manaRegen = (getIntellect() / 4) + (getConcentration() * 1.5);
    }
}
