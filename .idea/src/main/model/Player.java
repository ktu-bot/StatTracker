public class Player {

    boolean playing;
    int number;
    int point;
    int pm;


    public Player(int number) {
        this.number = number;
        point = 0;
        pm = 0;
        playing = false;
    }

    public int getpm() {
        return pm;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void pointEarned() {
        point++;
    }

    public void pointLost() {
        point--;
    }

    public int getPoint() {
        return point;
    }

}
