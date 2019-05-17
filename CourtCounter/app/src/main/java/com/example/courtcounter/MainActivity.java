package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // -----  Team A Code ----- //

    public void threePointsA(View view){
        scoreA += 3;
        displayA(scoreA);
    }

    public void twoPointsA(View view){
        scoreA += 2;
        displayA(scoreA);
    }

    public void freeThrowA(View view){
        scoreA += 1;
        displayA(scoreA);
    }


    // -----  Team B Code ----- //

    public void threePointsB(View view){
        scoreB += 3;
        displayB(scoreB);
    }

    public void twoPointsB(View view){
        scoreB += 2;
        displayB(scoreB);
    }

    public void freeThrowB(View view){
        scoreB += 1;
        displayB(scoreB);
    }


    // -----  Reset Code ----- //

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }


    // -----  Display Code ----- //

    public void displayA(int score){
        TextView newScore = (TextView) findViewById(R.id.scoreA_text_view);
        newScore.setText("" + score);
    }

    public void displayB(int score){
        TextView newScore = (TextView) findViewById(R.id.scoreB_text_view);
        newScore.setText("" + score);
    }
}
