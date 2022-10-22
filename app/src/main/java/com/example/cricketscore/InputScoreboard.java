package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InputScoreboard extends AppCompatActivity {
    TextView textView;
    public void retire(View view){
        Intent intent=new Intent(InputScoreboard.this,AddNewBowler.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_scoreboard);
        textView = (TextView) findViewById(R.id.team_names);
        Intent intent = getIntent();
        String host = intent.getStringExtra("host");
        textView.setText("");
        textView.setText(host);
    }
}