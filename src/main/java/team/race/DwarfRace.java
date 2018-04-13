package team.race;

import lombok.Getter;

@Getter
public abstract class DwarfRace extends AbstractRace {

    private String className;

    public DwarfRace(String className) {
        super(5, 45, 15, 20, 5, 100);
        this.className = className;
    }
}
