package team.role;

import lombok.Getter;
import lombok.Setter;
import team.ManaMeter;
import team.UnitData;
import team.race.ElfRace;

@Getter
@Setter
public class Mage extends ElfRace implements UnitData, ManaMeter {

    public Mage() {
        super("Mage");
    }
}

