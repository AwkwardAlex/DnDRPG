import team.Team;
import util.GameOutput;
import util.UserInput;

public class Game {

    private static final int TEAM_MEMBERS = 3;

    public void playGame() {
        String teamName = UserInput.choseTeamName();
        Team cool = new Team(teamName);
        for (int i = 0; i < TEAM_MEMBERS; i++) {
            GameOutput.printHeroInfo(cool, i);
            GameOutput.printHeroStats(cool, i);
        }
    }
}
