package team.race;

import lombok.Getter;
import team.ManaMeter;
import team.UnitData;
import team.race.stats.RaceStats;

@Getter
public abstract class HumanRace extends AbstractRace implements UnitData, ManaMeter {

    private int mana;
    private double manaRegen;

    public HumanRace(String className) {
        super();
        this.className = className;
        this.raceName = RaceStats.HUMAN.getRaceName();
        this.charisma = RaceStats.HUMAN.getCharisma();
        this.stamina = RaceStats.HUMAN.getStamina();
        this.intellect = RaceStats.HUMAN.getIntellect();
        this.agility = RaceStats.HUMAN.getAgility();
        this.concentration = RaceStats.HUMAN.getConcentration();
        calculateHealth(STARTING_HEALTH);
        calculateHealthRegen(STARTING_HEALTH_REGEN);
        calculateLevel(STARTING_LEVEL);
        calculateInitiative(STARTING_INITIATIVE);
        calculateBonusXPGain(STARTING_XP_GAIN);
        calculateDodgeChance(STARTING_DODGE_CHANCE);
        calculateMana(STARTING_MANA);
        calculateManaRegen(STARTING_MANA_REGEN);
    }

    @Override
    public void calculateIntellect(int points) {
        this.intellect = intellect + points;
        calculateMana(this.mana);
        calculateManaRegen(this.manaRegen);
    }

    private void calculateMana(int mana) {
        this.mana = mana + intellect * 2;
    }

    private void calculateManaRegen(double manaRegen) {
        this.manaRegen = manaRegen + (intellect / 4) + (concentration * 1.5);
    }
}
