package team.race;

import lombok.Getter;
import team.race.stats.RaceStats;

@Getter
public abstract class ElfRace extends AbstractRace {

    public ElfRace(String className) {
        super();
        this.className = className;
        this.raceName = RaceStats.ELF.getRaceName();
        this.charisma = RaceStats.ELF.getCharisma();
        this.stamina = RaceStats.ELF.getStamina();
        this.intellect = RaceStats.ELF.getIntellect();
        this.agility = RaceStats.ELF.getAgility();
        this.concentration = RaceStats.ELF.getConcentration();
    }
}
