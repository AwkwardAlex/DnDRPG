package team.role;

import team.race.AbstractRace;

import java.util.HashMap;
import java.util.Map;

public class UnitMap {

    public static Map<String, Map<String, AbstractRace>> getRace() {
        Map<String, Map<String, AbstractRace>> races = new HashMap<>();

        races.put("1", getElfHeroes());
        races.put("2", getHumanHeroes());
        races.put("3", getDwarfHeroes());

        return races;
    }

    private static Map<String, AbstractRace> getElfHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Gunslinger());
        raceHeroes.put("2", new Mage());

        return raceHeroes;
    }

    private static Map<String, AbstractRace> getHumanHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Priest());
        raceHeroes.put("2", new Paladin());

        return raceHeroes;
    }

    private static Map<String, AbstractRace> getDwarfHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Warrior());
        raceHeroes.put("2", new Mechanist());

        return raceHeroes;
    }
}
