package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int GoalA = 0;
    int FreeA = 0;
    int OffA = 0;
    int YellowA = 0;
    int RedA = 0;
    int CornerA = 0;
    int GoalB = 0;
    int FreeB = 0;
    int OffB = 0;
    int YellowB = 0;
    int RedB = 0;
    int CornerB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementGoalA(View view) {
        GoalA =  GoalA + 1;
        displayGoalA(GoalA);
    }

    public void decrementGoalA(View view) {
        GoalA =  GoalA - 1;
        displayGoalA(GoalA);
    }


    public void incrementFreeA(View view) {
        FreeA =  FreeA + 1;
        displayFreeA(FreeA);
    }

    public void decrementFreeA(View view) {
        FreeA =  FreeA - 1;
        displayFreeA(FreeA);
    }

    public void incrementOffA(View view) {
        OffA =  OffA + 1;
        displayOffA(OffA);
    }

    public void decrementOffA(View view) {
        OffA =  OffA - 1;
        displayOffA(OffA);
    }


    public void incrementYellowA(View view) {
        YellowA =  YellowA + 1;
        displayYellowA(YellowA);
    }

    public void decrementYellowA(View view) {
        YellowA =  YellowA - 1;
        displayYellowA(YellowA);
    }

    public void incrementRedA(View view) {
        RedA =  RedA + 1;
        displayRedA(RedA);
    }

    public void decrementRedA(View view) {
        RedA =  RedA - 1;
        displayRedA(RedA);
    }

    public void incrementCornerA(View view) {
        CornerA =  CornerA + 1;
        displayCornerA(CornerA);
    }

    public void decrementCornerA(View view) {
        CornerA =  CornerA - 1;
        displayCornerA(CornerA);
    }


    public void incrementGoalB(View view) {
        GoalB =  GoalB + 1;
        displayGoalB(GoalB);
    }

    public void decrementGoalB(View view) {
        GoalB =  GoalB - 1;
        displayGoalB(GoalB);
    }

    public void incrementFreeB(View view) {
        FreeB =  FreeB + 1;
        displayFreeB(FreeB);
    }

    public void decrementFreeB(View view) {
        FreeB =  FreeB - 1;
        displayFreeB(FreeB);
    }

    public void incrementOffB(View view) {
        OffB =  OffB + 1;
        displayOffB(OffB);
    }

    public void decrementOffB(View view) {
        OffB =  OffB - 1;
        displayOffB(OffB);
    }

    public void incrementYellowB(View view) {
        YellowB =  YellowB + 1;
        displayYellowB(YellowB);
    }

    public void decrementYellowB(View view) {
        YellowB =  YellowB - 1;
        displayYellowB(YellowB);
    }

    public void incrementRedB(View view) {
        RedB =  RedB + 1;
        displayRedB(RedB);
    }

    public void decrementRedB(View view) {
        RedB =  RedB - 1;
        displayRedB(RedB);
    }

    public void incrementCornerB(View view) {
        CornerB =  CornerB + 1;
        displayCornerB(CornerB);
    }

    public void decrementCornerB(View view) {
        CornerB =  CornerB - 1;
        displayCornerB(CornerB);
    }


    private void displayGoalA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumGoalsA);
        scoreView.setText(String.valueOf(number));
    }

    private void displayFreeA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumFreeA);
        scoreView.setText(String.valueOf(number));
    }

    private void displayOffA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumOffA);
        scoreView.setText(String.valueOf(number));
    }

    private void displayYellowA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumYellowA);
        scoreView.setText(String.valueOf(number));
    }

    private void displayRedA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumRedA);
        scoreView.setText(String.valueOf(number));
    }

    private void displayCornerA(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumCornerA);
        scoreView.setText(String.valueOf(number));
    }

    private void displayGoalB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumGoalsB);
        scoreView.setText(String.valueOf(number));
    }

    private void displayFreeB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumFreeB);
        scoreView.setText(String.valueOf(number));
    }

    private void displayOffB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumOffB);
        scoreView.setText(String.valueOf(number));
    }

    private void displayYellowB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumYellowB);
        scoreView.setText(String.valueOf(number));
    }

    private void displayRedB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumRedB);
        scoreView.setText(String.valueOf(number));
    }

    private void displayCornerB(int number) {
        TextView scoreView = (TextView) findViewById(R.id.IntSumCornerB);
        scoreView.setText(String.valueOf(number));
    }

    public void reset(View v) {
        GoalA = 0;
        FreeA = 0;
        OffA = 0;
        YellowA = 0;
        RedA = 0;
        CornerA = 0;
        GoalB = 0;
        FreeB = 0;
        OffB = 0;
        YellowB = 0;
        RedB = 0;
        CornerB = 0;
        displayGoalA(GoalA);
        displayFreeA(FreeA);
        displayOffA(OffA);
        displayYellowA(YellowA);
        displayRedA(RedA);
        displayCornerA(CornerA);
        displayGoalB(GoalB);
        displayFreeB(FreeB);
        displayOffB(OffB);
        displayYellowB(YellowB);
        displayRedB(RedB);
        displayCornerB(CornerB);

    }


}
