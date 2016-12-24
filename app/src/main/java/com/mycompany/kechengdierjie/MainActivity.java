package com.mycompany.kechengdierjie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    public void show(View view){
        switch (view.getId()){
            case R.id.add_3_points:
                scoreTeamA+=3;
                break;
            case R.id.add_2_points:
                scoreTeamA+=2;
                break;
            case R.id.free_throws:
                scoreTeamA++;
                break;
            case R.id.add_3_points_in_B:
                scoreTeamB+=3;
                break;
            case R.id.add_2_points_in_B:
                scoreTeamB+=2;
                break;
            case R.id.free_throws_in_B:
                scoreTeamB++;
            default:
                break;

        }
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);

    }
    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */
    public void displayTeamA(int score) {
        TextView textView = (TextView)findViewById(R.id.teamA_score);
        textView.setText(""+score);
    }

    public void displayTeamB(int score){
        TextView textView = (TextView)findViewById(R.id.teamB_score);
        textView.setText(""+score);
    }

    public void rest(View view) {
        displayTeamA(0);
        displayTeamB(0);
        scoreTeamB = 0;
        scoreTeamA = 0;
    }

}
