package team.race;

import lombok.Getter;

@Getter
public abstract class HumanRace extends AbstractRace {

    private String className;

    public HumanRace(String className) {
        super(10, 30, 20, 15, 15, 100);
        this.className = className;
    }
}
