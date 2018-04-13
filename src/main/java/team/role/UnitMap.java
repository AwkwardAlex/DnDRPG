package team.role;

import team.race.AbstractRace;
import team.role.Gunslinger;
import team.race.DwarfRace;
import team.race.ElfRace;
import team.race.HumanRace;
import util.UserInput;

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

    public static Map<String, AbstractRace> getElfHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Gunslinger());
        raceHeroes.put("2", new Mage());

        return raceHeroes;
    }

    public static Map<String, AbstractRace> getHumanHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Priest());
        raceHeroes.put("2", new Paladin());

        return raceHeroes;
    }

    public static Map<String, AbstractRace> getDwarfHeroes() {
        Map<String, AbstractRace> raceHeroes = new HashMap<>();

        raceHeroes.put("1", new Warrior());
        raceHeroes.put("2", new Mechanist());

        return raceHeroes;
    }
}
