package com.example.cricketscore;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayerStats extends AppCompatActivity {
    String[] players;
    String team;
    ListView listView;
    Database database;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);

        Intent intent = getIntent();
        team = intent.getStringExtra("team");
        database = new Database(this);
        cursor = database.getPlayers(team);
        players = new String[cursor.getCount()];

        if(cursor.getCount() > 0) {
            int i = 0;
            while(cursor.moveToNext()) {
                players[i] = cursor.getString(i);
                ++ i;
            }
        }

        listView = (ListView) findViewById(R.id.player_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(PlayerStats.this, android.R.layout.simple_dropdown_item_1line, players);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            String item = adapterView.getItemAtPosition(i).toString();
            Intent intent1 = new Intent(PlayerStats.this, PlayerInfo.class);
            intent1.putExtra("player", item);
            intent1.putExtra("team", team);
            startActivity(intent1);
        });
    }

   /* public void submit(View view){
        Intent intent=new Intent(PlayerStats.this,PlayerInfo.class);
        startActivity(intent);
    }*/
}