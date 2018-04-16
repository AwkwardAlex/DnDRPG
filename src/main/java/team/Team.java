package team;

import lombok.Setter;
import team.race.AbstractRace;
import team.role.UnitMap;
import util.UserInput;

import java.util.Map;

@lombok.Getter
@Setter
public class Team {
    private static final int TEAM_MEMBERS = 3;

    private AbstractRace[] heroes;

    private String name;

    public Team(String name) {
        heroes = createTeam();
        this.name = name;
    }

    private AbstractRace[] createTeam() {
        AbstractRace[] heroes = new AbstractRace[TEAM_MEMBERS];
        heroes[0] = createLeader();
        for (int i = 1; i < TEAM_MEMBERS; i++) {
            System.out.println("You are now creating another hero.");
            heroes[i] = createHero();
        }
        return heroes;
    }

    private AbstractRace createHero() {
        try {
            String heroName = UserInput.choseName();
            String race = UserInput.choseRace();
            String classChoice = UserInput.choseClass(race);
            AbstractRace newHero = UnitMap.getHero(race, classChoice);
            newHero.setHeroName(heroName);
            return newHero;
        } catch (IllegalAccessException | InstantiationException e) {
            System.err.println("Caught" + e);
        }
        return null;
    }

    private AbstractRace createLeader() {
        System.out.println("You are now creating a leader for your team.");
        AbstractRace newLeader = createHero();
        newLeader.setLeader();
        return newLeader;
    }
}

