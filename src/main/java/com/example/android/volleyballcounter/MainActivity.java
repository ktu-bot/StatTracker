package com.example.android.volleyballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem; 


public class MainActivity extends AppCompatActivity {

    int pointsForTeamA = 0;
    int pointsForTeamB = 0;
    int setsForTeamA = 0;
    int setsForTeamB = 0;
    int pointsForWin = 25;
    int assesTeamA = 0;
    int assesTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void pointForTeamA(View v) {
        pointsForTeamA = pointsForTeamA + 1;
        displayPointsForTeamA(pointsForTeamA);
        if (pointsForTeamA >= pointsForWin && (pointsForTeamA-pointsForTeamB) >= 2) {
            setsForTeamA = setsForTeamA +1;
            displaySetsForTeamA(setsForTeamA);
            pointsReset();
        }
        tieBreak();
        gameMessage(getString(R.string.team_a));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void pointForTeamB(View v) {
        pointsForTeamB = pointsForTeamB + 1;
        displayPointsForTeamB(pointsForTeamB);
        if (pointsForTeamB >= pointsForWin && (pointsForTeamB-pointsForTeamA) >= 2) {
            setsForTeamB = setsForTeamB +1;
            displaySetsForTeamB(setsForTeamB);
            pointsReset();
        }
        tieBreak();
        gameMessage(getString(R.string.team_b));
    }

    /**
     * Increase the asses for Team A by 1 point.
     */
    public void assesTeamA(View v){
        assesTeamA = assesTeamA + 1;
        displayAssesTeamA(assesTeamA);
    }

    /**
     * Increase the asses for Team B by 1 point.
     */
    public void assesTeamB(View v){
        assesTeamB = assesTeamB + 1;
        displayAssesTeamB(assesTeamB);
    }

    /**
     * Reset points for Team A and Team B.
     */

    public void pointsReset () {
        pointsForTeamA = 0;
        displayPointsForTeamA(pointsForTeamA);
        pointsForTeamB = 0;
        displayPointsForTeamB(pointsForTeamB);
    }

    /**
     * Reset sets for Team A and Team B.
     */

    public void setsReset () {
        setsForTeamA = 0;
        displaySetsForTeamA(setsForTeamA);
        setsForTeamB = 0;
        displaySetsForTeamB(setsForTeamB);
    }

    /**
     * Reset asses for Team A and Team B.
     */

    public void assesReset () {
        assesTeamA = 0;
        displayAssesTeamA(assesTeamA);
        assesTeamB = 0;
        displayAssesTeamB(assesTeamB);
    }

    /**
     * Reset points and sets for Team A and Team B.
     */
    public void reset (View v) {
        findViewById(R.id.button_points_team_a).setEnabled(true);
        findViewById(R.id.button_points_team_b).setEnabled(true);
        pointsReset();
        setsReset();
        assesReset();
        pointsForWin = 25;
        displayGameMessage("");
    }

    /**
     * Change of points for tie break.
     */
    public void tieBreak () {
        if (setsForTeamA+setsForTeamB >= 4) {
            pointsForWin = 15;
        }
    }

    /**
     * Creating game over message
     */

    public void gameMessage (String name) {
        if (setsForTeamA == 3 || setsForTeamB == 3)
        {
            pointsForTeamA = 0;
            pointsForTeamB = 0;
            findViewById(R.id.button_points_team_a).setEnabled(false);
            findViewById(R.id.button_points_team_b).setEnabled(false);
            displayGameMessage("Game over! " + name + " won!\nPress RESET" );
        }
    }

    /**
     * Displays points for Team A.
     *
     * @param score points for Team A.
     */
    public void displayPointsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.points_a_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays sets for Team A.
     * @param score sets for Team A.
     */
    public void displaySetsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sets_a_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays points for Team B.
     * @param score points for Team B.
     */
    public void displayPointsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.points_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays sets for Team B.
     * @param score sets for Team B.
     */
    public void displaySetsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sets_b_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays game message.
     * @param message is containing game over message to display it
     */
    public void displayGameMessage(String message) {
        TextView scoreView = (TextView) findViewById(R.id.game_message);
        scoreView.setText(String.valueOf(message));
    }

    /**
     * Displays asses for team A.
     * @param asses is value of asses gained by Team A
     */
    public void displayAssesTeamA(int asses) {
        TextView scoreView = (TextView) findViewById(R.id.asses_team_a);
        scoreView.setText(String.valueOf(asses));
    }

    /**
     * Displays asses for team B.
     * @param asses is value of asses gained by Team B
     */
    public void displayAssesTeamB(int asses) {
        TextView scoreView = (TextView) findViewById(R.id.asses_team_b);
        scoreView.setText(String.valueOf(asses));
    }

}

