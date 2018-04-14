package team.role;

import lombok.Getter;
import lombok.Setter;
import team.LeaderStatus;
import team.RageMeter;
import team.race.DwarfRace;

@Getter
@Setter
public class Warrior extends DwarfRace implements LeaderStatus, RageMeter {

    private int rage;
    private double rageRegen;

    public Warrior() {
        super("Warrior");
        this.rage = RageMeter.rage + (getAgility() * 4);
        this.rageRegen = getConcentration();
    }
}
