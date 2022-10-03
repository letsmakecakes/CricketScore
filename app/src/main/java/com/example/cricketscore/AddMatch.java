package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddMatch extends AppCompatActivity {
    EditText host, away, overs;
    RadioGroup tossWon, optedFor;
    public void next(View view){
        Intent intent=new Intent(AddMatch.this,AddPlayers.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_match);
        host = (EditText) findViewById(R.id.host_team);
        away = (EditText) findViewById(R.id.away_team);
        overs = (EditText) findViewById(R.id.overs);
        tossWon = (RadioGroup) findViewById(R.id.toss_won);
        optedFor = (RadioGroup) findViewById(R.id.opted_for);
    }

    public void reset(View view) {
        host.setText("");
        away.setText("");
    }
}