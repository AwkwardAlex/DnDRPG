package util;

import team.race.AbstractRace;
import team.role.UnitMap;

import java.util.Map;

public class UserInput {

    private static Map<String, Map<String, AbstractRace>> raceMap = UnitMap.getRace();
    private static UserInput userInput;

    private UserInput() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of UserInput");
    }

    public static UserInput getInput() {
        if (userInput == null) {
            userInput = new UserInput();
        }
        return userInput;
    }

    public static String choseTeamName() {
        System.out.println("Enter a name for your team: ");
        while (true) {
            String teamName = ScannerUtil.getString();
            System.out.println("You have chosen: " + teamName +
                    " as your team name.\nPress 1 to confirm this choice, or press any other button to change name");
            if ("1".equals(ScannerUtil.getString())) {
                return teamName;
            } else {
                System.out.println("Enter another name.");
            }
        }
    }
    public static String choseRace() {
        while (true) {
            GameOutput.printRaces();
            String race = ScannerUtil.getString();
            if ("4".equals(race)) {
                GameOutput.printRaceStats();
            } else if (UnitMap.getRace().containsKey(race.toLowerCase())) {
                return race;
            } else
                System.out.println("Choice not recognized");
        }
    }

    public static String choseClass(String race) {
        GameOutput.printClasses(race);
        while (true) {
            String classChoice = ScannerUtil.getString();
            if (UnitMap.getRace().get(race).containsKey(classChoice)) {
                System.out.println("You have chosen: " + UnitMap.getRace().get(race).get(classChoice).getClassName());
                return classChoice;
            }
            System.out.println("Wrong input, please try again.");
        }
    }

    public static String choseName() {
        System.out.println("Enter a name for this character: ");
        String heroName;
        while (true) {
            heroName = ScannerUtil.getString();
            System.out.println("Press 1 if you want to keep this name, or press any other button to change name.");
            if ("1".equals(ScannerUtil.getString())) {
                return heroName;
            } else {
                System.out.println("Enter another name.");
            }
        }
    }
}

