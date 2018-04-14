package team.race;

import lombok.Getter;
import team.race.stats.RaceStats;

@Getter
public abstract class HumanRace extends AbstractRace {

    public HumanRace(String className) {
        super();
        this.className = className;
        this.raceName = RaceStats.HUMAN.getRaceName();
        this.charisma = RaceStats.HUMAN.getCharisma();
        this.stamina = RaceStats.HUMAN.getStamina();
        this.intellect = RaceStats.HUMAN.getIntellect();
        this.agility = RaceStats.HUMAN.getAgility();
        this.concentration = RaceStats.HUMAN.getConcentration();
    }
}
