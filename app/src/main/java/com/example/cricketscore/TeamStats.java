package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TeamStats extends AppCompatActivity {
    String[] teams;
    Database database;
    Cursor cursor;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_stats);

        database = new Database(this);
        cursor = database.getTeams();
        teams = new String[cursor.getCount()];
        if(cursor.getCount() > 0) {
            int i = 0;
            while(cursor.moveToNext()) {
                teams[i] = cursor.getString(i);
                ++ i;
            }
        }
        listView = (ListView) findViewById(R.id.team_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(TeamStats.this, android.R.layout.simple_dropdown_item_1line, teams);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            String item = adapterView.getItemAtPosition(i).toString();
            Intent intent = new Intent(TeamStats.this, PlayerStats.class);
            intent.putExtra("team", item);
            startActivity(intent);
        });
    }
    /*public void next(View view) {
        Intent intent = new Intent(TeamStats.this, PlayerStats.class);
        startActivity(intent);
    }*/
}