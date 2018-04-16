package team.role;

import lombok.Getter;
import lombok.Setter;
import team.RageMeter;
import team.UnitData;
import team.race.HumanRace;

@Getter
@Setter
public class Paladin extends HumanRace implements UnitData, RageMeter {

    public Paladin() {
        super("Paladin");
    }
}
