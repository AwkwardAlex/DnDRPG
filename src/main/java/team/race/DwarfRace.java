package team.race;

import lombok.Getter;
import team.UnitData;
import team.race.stats.RaceStats;

@Getter
public abstract class DwarfRace extends AbstractRace implements UnitData {

    private int rage;
    private double rageRegen;

    public DwarfRace(String className) {
        super();
        this.className = className;
        this.raceName = RaceStats.DWARF.getRaceName();
        this.charisma = RaceStats.DWARF.getCharisma();
        this.stamina = RaceStats.DWARF.getStamina();
        this.intellect = RaceStats.DWARF.getIntellect();
        this.agility = RaceStats.DWARF.getAgility();
        this.concentration = RaceStats.DWARF.getConcentration();
        calculateHealth(STARTING_HEALTH);
        calculateHealthRegen(STARTING_HEALTH_REGEN);
        calculateLevel(STARTING_LEVEL);
        calculateInitiative(STARTING_INITIATIVE);
        calculateBonusXPGain(STARTING_XP_GAIN);
        calculateDodgeChance(STARTING_DODGE_CHANCE);
    }

    @Override
    public void calculateAgility(int points) {
        this.agility = agility + points;
        calculateRage(this.rage);
        calculateRageRegen(this.rageRegen);
        calculateDodgeChance(this.getDodgeChance());
    }

    private void calculateRage(int rage) {
        this.rage = rage + (agility * 4);
    }

    private void calculateRageRegen(double rageRegen) {
        this.rageRegen = rageRegen + concentration;
    }
}
