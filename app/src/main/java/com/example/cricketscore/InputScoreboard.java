package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InputScoreboard extends AppCompatActivity {
    public void retire(View view){
        Intent intent=new Intent(InputScoreboard.this,AddNewBowler.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_scoreboard);
    }
}