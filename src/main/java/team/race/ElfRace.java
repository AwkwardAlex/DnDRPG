package team.race;

import lombok.Getter;

@Getter
public abstract class ElfRace extends AbstractRace {

    private String className;

    public ElfRace(String className) {
        super(15, 10, 25, 22, 18, 100);
        this.className = className;
    }
}
