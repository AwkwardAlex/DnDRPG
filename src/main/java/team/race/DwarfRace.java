package team.race;

import lombok.Getter;
import team.race.stats.RaceStats;

@Getter
public abstract class DwarfRace extends AbstractRace {

    public DwarfRace(String className) {
        super();
        this.className = className;
        this.raceName = RaceStats.DWARF.getRaceName();
        this.charisma = RaceStats.DWARF.getCharisma();
        this.stamina = RaceStats.DWARF.getStamina();
        this.intellect = RaceStats.DWARF.getIntellect();
        this.agility = RaceStats.DWARF.getAgility();
        this.concentration = RaceStats.DWARF.getConcentration();
    }
}
