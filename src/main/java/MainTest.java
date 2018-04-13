import team.Team;
import util.GameOutput;
import util.UserInput;

public class MainTest {
    public static void main(String[] args) {
        String teamName = UserInput.choseTeamName();
        Team cool = new Team(teamName);
        for (int i = 0; i < 3; i++) {
            GameOutput.printHeroInfo(cool, i);
            GameOutput.printHeroStats(cool, i);
        }
    }
}
