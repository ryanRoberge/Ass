package com.example.sokoll.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode);

        final Button character =(Button) findViewById(R.id.Character_Mode);
        final Button syllable  =(Button) findViewById(R.id.Syllable_Mode);


        // Sends selection data to the next activity
        character.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String choice = "char";
                Intent i = new Intent(getApplicationContext(), Pre_game.class);
                i.putExtra("choice", choice);
                startActivity(i);

            }
        });

        // Sends selection data to the next activity
        syllable.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String choice = "syll";
                Intent i = new Intent(getApplicationContext(), Pre_game.class);
                i.putExtra("choice", choice);
                startActivity(i);

            }
        });

    }
}