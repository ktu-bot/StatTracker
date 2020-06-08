import java.util.ArrayList;
import java.util.List;
import

public class Team {

    public List<Player> team;

    public Team() {
        team = new ArrayList<>();
    }

    public void point() {
        for (Player p : team) {
            if (p.isPlaying())
                p.pm++;
        }
    }

    public void losePoint() {
        for (Player p : team) {
            if (p.isPlaying())
                p.pm--;
        }
    }

    public void addPlayer(int i) {
        team  = team.add(new Player(i));
    }
}
