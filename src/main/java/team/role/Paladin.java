package team.role;

import lombok.Getter;
import lombok.Setter;
import team.UnitData;
import team.RageMeter;
import team.race.HumanRace;

@Getter
@Setter
public class Paladin extends HumanRace implements UnitData, RageMeter {

    private int rage;
    private double rageRegen;

    public Paladin() {
        super("Paladin");
    }
}
