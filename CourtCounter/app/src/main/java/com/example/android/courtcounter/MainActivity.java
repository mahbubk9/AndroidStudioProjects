package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when +3 button is clicked.
     */
    public void plusThree(View view) {
        scoreTeamA=scoreTeamA+3 ;
        displayForTeamA(scoreTeamA);
    }

    public void plusTwo(View view) {
        scoreTeamA=scoreTeamA+2 ;
        displayForTeamA(scoreTeamA);

    }

    public void freeThrow(View view) {
        scoreTeamA=scoreTeamA+1 ;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when +3 button is clicked.
     */
    public void plusThreeB(View view) {
        scoreTeamB=scoreTeamB+3 ;
        displayForTeamB(scoreTeamB);
    }

    public void plusTwoB(View view) {
        scoreTeamB=scoreTeamB+2 ;
        displayForTeamB(scoreTeamB);

    }

    public void freeThrowB(View view) {
        scoreTeamB=scoreTeamB+1 ;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

}
