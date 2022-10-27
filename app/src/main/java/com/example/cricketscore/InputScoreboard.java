package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class InputScoreboard extends AppCompatActivity {
    TextView teamsPlaying, batsman1, batsman2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_scoreboard);

        teamsPlaying = (TextView) findViewById(R.id.team_names);
        batsman1 = (TextView) findViewById(R.id.batsman_1);
        batsman2 = (TextView) findViewById(R.id.batsman_2);

        SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        // The value will be default as empty string because for
        // the very first time when the app is opened, there is nothing to show
        String host = sh.getString("host", "");
        String visitor = sh.getString("visitor", "");
        teamsPlaying.setText(host + " VS \n" + visitor);
        batsman1.setText(sh.getString("striker", ""));
        batsman2.setText(sh.getString("nonStriker", ""));
        int overs = sh.getInt("overs", 0);
    }
}