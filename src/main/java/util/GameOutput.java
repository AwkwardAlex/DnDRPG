package util;

import team.Team;
import team.race.AbstractRace;
import team.role.UnitMap;

import java.util.Map;

public class GameOutput {

    private static Map<String, Map<String, AbstractRace>> raceMap = UnitMap.getRace();

    public static void printRaces() {
        System.out.println("Chose one of three races:\n 1. Elf;\n 2. Human;\n 3. Dwarf;\n 4. View race stats.");
    }

    public static void printClasses(String race) {
        System.out.println("Chose one of two classes: " + "\n 1. "
                + raceMap.get(race).get("1").getClassName() + ";\n 2. "
                + raceMap.get(race).get("2").getClassName() + ".");
    }

    public static void printRaceStats() {
        System.out.println("Description of races: ");
        System.out.println("Elf stats:\n " +
                "Charisma - 15, Stamina - 10, Intellect - 25, Agility - 22, Concentration - 18;\n" +
                "Human stats:\n Charisma - 10, Stamina - 30, Intellect - 20, Agility - 15, Concentration - 15;\n" +
                "Dwarf stats:\n Charisma - 5, Stamina - 45, Intellect - 15, Agility - 20, Concentration - 5.");
    }

    public static void printHeroInfo(Team team, int i) {
        System.out.println("Information about " + team.getHeroes()[i].getHeroName() + ":\n " +
                "class - " + String.valueOf(team.getHeroes()[i].getClassName()) + ".");
    }

    public static void printHeroStats(Team team, int i) {
        System.out.println(team.getHeroes()[i].getHeroName() + " stats:\n" +
                " Charisma - " + team.getHeroes()[i].getCharisma() + ";\n" +
                " Stamina - " + team.getHeroes()[i].getStamina() + ";\n" +
                " Intellect - " + team.getHeroes()[i].getIntellect() + ";\n" +
                " Agility - " + team.getHeroes()[i].getAgility() + ";\n" +
                " Concentration - " + team.getHeroes()[i].getConcentration() + ".");
    }
}
