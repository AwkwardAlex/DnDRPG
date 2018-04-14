package team.role;

import lombok.Getter;
import lombok.Setter;
import team.LeaderStatus;
import team.RageMeter;
import team.race.DwarfRace;

@Getter
@Setter
public class Mechanist extends DwarfRace implements LeaderStatus, RageMeter {

    private int rage;
    private double rageRegen;

    public Mechanist() {
        super("Mechanist");
        this.rage = RageMeter.rage + (getAgility() * 4);
        this.rageRegen = getConcentration();
    }
}
