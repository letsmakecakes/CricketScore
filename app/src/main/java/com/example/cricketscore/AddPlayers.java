package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPlayers extends AppCompatActivity {
    Button button;
    EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);
        button = (Button) findViewById(R.id.start_match);
        editText = (EditText) findViewById(R.id.striker);
        editText2 = (EditText) findViewById(R.id.non_striker);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String host = intent.getStringExtra("host");
                String away = intent.getStringExtra("away");
                String tossWon = intent.getStringExtra("tossWon");
                String optedFor = intent.getStringExtra("optedFor");
                String overs = intent.getStringExtra("overs");
                String striker = editText.toString();
                String nonStriker = editText2.toString();
                Intent intent1 = new Intent(getApplicationContext(), InputScoreboard.class);
                intent1.putExtra("host", host.toString());
                intent1.putExtra("away", away.toString());
                intent1.putExtra("tossWon", tossWon.toString());
                intent1.putExtra("optedFor", optedFor.toString());
                intent1.putExtra("overs", overs.toString());
                intent1.putExtra("striker", striker);
                intent1.putExtra("nonStriker", nonStriker);
                startActivity(intent1);
            }
        });

    }
}