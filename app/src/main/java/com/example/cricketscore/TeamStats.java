package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;


public class TeamStats extends AppCompatActivity {
    public void next(View view) {
        Intent intent = new Intent(TeamStats.this, PlayerStats.class);
        startActivity(intent);
    }

    Database database;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_stats);

        database = new Database(this);
        cursor = database.getTeams();
        if(cursor.getCount() > 0) {
            while(cursor.moveToNext()) {

            }
        }
    }
}