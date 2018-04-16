package team.race;

import lombok.Getter;
import lombok.Setter;
import team.UnitData;

@Setter
@Getter
public abstract class AbstractRace implements UnitData {

    public String raceName;
    public String className;
    public int charisma;
    public int stamina;
    public int intellect;
    public int agility;
    public int concentration;
    public int health;
    private String heroName;
    private double healthRegen;
    private int initiativePoints;
    private double dodgeChance;
    private int level;
    private double bonusExperienceGain;
    private boolean isLeader;

    public AbstractRace() {
    }

    public void fearEnemy() {
        double chanceToFear = ((charisma / 2) * 0.75);
        if (charisma > 40) {
            // fear method
        } else {
            // failed to fear
        }
    }

    public void setLeader() {
        this.isLeader = true;
    }

    public String setName(String name) {
        return this.heroName = name;
    }

    public void calculateInitiative(int initiative) {
        this.initiativePoints = initiative + (charisma / 2);
    }

    public void calculateBonusXPGain(double bonusExperienceGain) {
        this.bonusExperienceGain = bonusExperienceGain = charisma;
    }

    public void calculateHealth(int health) {
        this.health = (health + (stamina * 2)) + concentration;
    }

    public void calculateHealthRegen(double healthRegen) {
        this.healthRegen = healthRegen + (stamina / 4);
    }

    public void calculateDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance + (agility / 2);
    }

    public void calculateLevel(int level) {
        this.level = +level;
    }

    public void calculateCharisma(int points) {
        this.charisma = charisma + points;
        calculateInitiative(this.initiativePoints);
        calculateBonusXPGain(this.bonusExperienceGain);
    }

    public void calculateStamina(int points) {
        this.stamina = stamina + points;
        calculateHealth(this.health);
        calculateHealthRegen(this.healthRegen);
    }

    public void calculateIntellect(int points) {
        this.intellect = intellect + points;
    }

    public void calculateAgility(int points) {
        this.agility = agility + points;
        calculateDodgeChance(this.dodgeChance);
    }

    public void calculateConcentration(int points) {
        this.concentration = concentration + points;
        calculateHealth(this.health);
    }
}


