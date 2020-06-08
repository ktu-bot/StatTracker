public class Game {
    int homeConsecutive;
    int awayConsecutive;
    Team opponents;
    Team home;

    public Game() {
    }

    public void ourPoint() {
        awayConsecutive = 0;
        homeConsecutive++;
        home.point();
    }

    public void theirPoint() {
        homeConsecutive = 0;
        awayConsecutive++;
        home.losePoint();
    }
}
