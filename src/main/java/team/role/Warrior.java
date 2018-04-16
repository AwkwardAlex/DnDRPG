package team.role;

import lombok.Getter;
import lombok.Setter;
import team.UnitData;
import team.RageMeter;
import team.race.DwarfRace;

@Getter
@Setter
public class Warrior extends DwarfRace implements UnitData, RageMeter {

    public Warrior() {
        super("Warrior");
    }
}
