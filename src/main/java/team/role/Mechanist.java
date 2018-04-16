package team.role;

import lombok.Getter;
import lombok.Setter;
import team.UnitData;
import team.RageMeter;
import team.race.DwarfRace;

@Getter
@Setter
public class Mechanist extends DwarfRace implements UnitData, RageMeter {

    public Mechanist() {
        super("Mechanist");
    }
}
