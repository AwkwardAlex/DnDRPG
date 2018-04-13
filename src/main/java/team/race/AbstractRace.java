package team.race;

import lombok.Getter;
import lombok.Setter;
import team.LeaderStatus;

@Setter
@Getter
public abstract class AbstractRace implements LeaderStatus {

    private String heroName;
    private String className;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;
    private int health;
    private double healthRegen;
    private int initiativePoints;
    private double dodgeChance;
    private int level;
    private double bonusExperienceGain;
    private boolean isLeader;

    public AbstractRace(int charisma, int stamina, int intellect, int agility, int concentration, int health) {
        this.charisma = charisma;
        this.stamina = stamina;
        this.intellect = intellect;
        this.agility = agility;
        this.concentration = concentration;
        this.initiativePoints = charisma / 2;
        this.bonusExperienceGain = charisma;
        this.health = (health + (stamina * 2)) + concentration;
        this.healthRegen = stamina / 4;
        this.dodgeChance = agility / 2;
    }

    public void fearEnemy() {
        double chanceToFear = ((charisma / 2) * 0.75);
        if (charisma > 40) {
            // fear method
        } else {
            // failed to fear
        }
    }

    @Override
    public void setLeader() {
        this.isLeader = true;
    }

    public String setName(String name) {
        return this.heroName = name;
    }
}
