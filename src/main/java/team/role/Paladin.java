package team.role;

import lombok.Getter;
import lombok.Setter;
import team.LeaderStatus;
import team.RageMeter;
import team.race.HumanRace;

@Getter
@Setter
public class Paladin extends HumanRace implements LeaderStatus, RageMeter {

    private int rage;
    private double rageRegen;

    public Paladin() {
        super("Paladin");
        this.rage = RageMeter.rage + (getAgility() * 4);
        this.rageRegen = getConcentration();
    }
}
