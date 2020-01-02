package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA = 0;
    int scoreB = 0;

    private void displayA() {
        TextView quantityTextView = findViewById(R.id.scoreOfA);
        quantityTextView.setText(""+scoreA);
    }
    private void displayB() {
        TextView quantityTextView = findViewById(R.id.scoreOfB);
        quantityTextView.setText(""+scoreB);
    }
    public void threePointerA(View view) {
        scoreA = scoreA + 3;
        displayA();
    }
    public void threePointerB( View view) {
        scoreB = scoreB + 3;
        displayB();
    }
    public void twoPointerA(View view ) {
        scoreA = scoreA + 2;
        displayA();
    }
    public void twoPointerB(View view) {
        scoreB = scoreB + 2;
        displayB();
    }
    public void freeA( View view) {
        scoreA = scoreA + 1;
        displayA();
    }
    public void freeB(View view) {
        scoreB = scoreB + 1;
        displayB();
    }
    public void resetAll(View view){
        Toast.makeText(view.getContext(),"Resetting..",Toast.LENGTH_SHORT).show();
        scoreA = 0;
        scoreB = 0;
        displayA();
        displayB();
    }
    public void finishGame(View view)
    {
        Toast.makeText(view.getContext(),"Finishing",Toast.LENGTH_SHORT).show();
        Intent fin = new Intent(this,finished.class);
        fin.putExtra("ScoreA",scoreA);
        fin.putExtra("ScoreB",scoreB);
        startActivity(fin);
    }
}
