package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finished extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished);
        Intent intent = getIntent();
        int A = intent.getIntExtra("ScoreA",0);
        int B = intent.getIntExtra("ScoreB",0);
        String won;
        if(A > B)
            won = "Team A won.";
        else if(A < B)
            won = "Team B won.";
        else
            won = "Match drawn.";
        TextView finText = findViewById(R.id.wonmessage);
        finText.setText(won);
    }
}


