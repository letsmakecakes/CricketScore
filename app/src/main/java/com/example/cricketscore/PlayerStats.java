package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlayerStats extends AppCompatActivity {
    String players[];
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
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(PlayerStats.this, android.R.layout.simple_dropdown_item_1line, players);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Intent intent = new Intent(PlayerStats.this, PlayerInfo.class);
                intent.putExtra("player", item);
                intent.putExtra("team", team);
                startActivity(intent);
            }
        });
    }

   /* public void submit(View view){
        Intent intent=new Intent(PlayerStats.this,PlayerInfo.class);
        startActivity(intent);
    }*/
}