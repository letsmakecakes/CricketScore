package com.example.cricketscore;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddMatch extends AppCompatActivity {
    EditText host, visitor, overs;
    RadioGroup tossWonRadioGroup, optedForRadioGroup;
    Button next;
    String tossWon, optedFor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_match);

        host = (EditText) findViewById(R.id.host_team);
        visitor = (EditText) findViewById(R.id.visitor_team);
        tossWonRadioGroup = (RadioGroup) findViewById(R.id.toss_won);
        optedForRadioGroup = (RadioGroup) findViewById(R.id.opted_for);
        overs = (EditText) findViewById(R.id.overs);
        next = (Button) findViewById(R.id.next);

        tossWonRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
              switch (i) {
                  case R.id.host_won: tossWon = "host"; break;
                  case R.id.visitor_team: tossWon = "visitor"; break;
              }
            }
        });

        optedForRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
              switch(i) {
                  case R.id.bat: optedFor = "bat"; break;
                  case R.id.bowl: optedFor = "bowl"; break;
              }
            }
        });

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddPlayers.class);
                // Storing data into SharedPreferences
                // Creating an Editor object to edit(write to the file)
                SharedPreferences.Editor myEdit = sharedPreferences.edit();
                // Storing the key and its value as the data fetched from edittext
                myEdit.putString("host", host.getText().toString());
                myEdit.putString("visitor", visitor.getText().toString());
                myEdit.putString("tossWon", tossWon);
                myEdit.putString("optedFor", optedFor);
                myEdit.putInt("overs", Integer.parseInt(overs.getText().toString()));
                // Once the changes have been made,
                // we need to commit to apply those changes made,
                // otherwise, it will throw an error
                myEdit.commit();
                startActivity(intent);
            }
        });
    }
}