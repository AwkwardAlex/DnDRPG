package team.role;

import lombok.Getter;
import lombok.Setter;
import team.LeaderStatus;
import team.ManaMeter;
import team.RageMeter;
import team.race.HumanRace;


@Getter
@Setter
public class Priest extends HumanRace implements LeaderStatus, RageMeter, ManaMeter {

    private int rage;
    private double rageRegen;
    private int mana;
    private double manaRegen;

    public Priest() {
        super("Priest");
        this.rage = RageMeter.rage + (getAgility() * 4);
        this.rageRegen = getConcentration();
        this.mana = getIntellect() * 2;
        this.manaRegen = (getIntellect() / 4) + (getConcentration() * 1.5);
    }
}
