package team.race;

import lombok.Getter;
import lombok.Setter;
import team.LeaderStatus;

@Setter
@Getter
public abstract class AbstractRace implements LeaderStatus {

    public String raceName;
    private String heroName;
    public String className;
    public int charisma;
    public int stamina;
    public int intellect;
    public int agility;
    public int concentration;
    private int health;
    private double healthRegen;
    private int initiativePoints;
    private double dodgeChance;
    private int level;
    private double bonusExperienceGain;
    private boolean isLeader;
    private static final int STARTING_HEALTH = 100;

    public AbstractRace() {
        this.initiativePoints = charisma / 2;
        this.bonusExperienceGain = charisma;
        this.health = (STARTING_HEALTH + (stamina * 2)) + concentration;
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
