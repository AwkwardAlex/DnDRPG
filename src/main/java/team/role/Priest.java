package team.role;

import lombok.Getter;
import lombok.Setter;
import team.UnitData;
import team.ManaMeter;
import team.RageMeter;
import team.race.HumanRace;


@Getter
@Setter
public class Priest extends HumanRace implements UnitData, RageMeter, ManaMeter {

    private int rage;
    private double rageRegen;

    public Priest() {
        super("Priest");
    }

    public void calculateAgility(int points) {
        this.agility = agility + points;
        calculateRage(this.rage);
        calculateRageRegen(this.rageRegen);
        calculateDodgeChance(this.getDodgeChance());
    }

    public void calculateRage(int rage) {
        this.rage = rage + (agility * 4);
    }

    public void calculateRageRegen(double rageRegen) {
        this.rageRegen = rageRegen + concentration;
    }
}
