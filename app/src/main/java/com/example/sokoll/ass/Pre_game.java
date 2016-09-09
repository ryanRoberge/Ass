package com.example.sokoll.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pre_game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_game);

        final Bundle extras = getIntent().getExtras();

        final Button easy  = (Button) findViewById(R.id.Easy_Button);
        final Button med  = (Button) findViewById(R.id.Medium_Button);
        final Button hard  = (Button) findViewById(R.id.Hard_Button);
        final EditText name = (EditText) findViewById(R.id.editText);
        final TextView msg = (TextView) findViewById(R.id.textView3);

        // Sends selection data to the next activity if name has been entered
        easy.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!name.getText().toString().equals("") && !name.getText().toString().equals("Enter Name"))
                {
                    String choice = "easy";
                    Intent i = new Intent(getApplicationContext(), expert_or_reg.class);
                    i.putExtra("choice2", choice);
                    i.putExtra("name", name.getText().toString());
                    i.putExtras(extras);
                    startActivity(i);
                }

                else
                {
                    msg.setText("Please enter your name first.");
                }

            }
        });


        // Sends selection data to the next activity if name has been entered
        med.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!name.getText().toString().equals("") && !name.getText().toString().equals("Enter Name"))
                {
                    String choice = "med";
                    Intent i = new Intent(getApplicationContext(), expert_or_reg.class);
                    i.putExtra("choice2", choice);
                    i.putExtra("name", name.getText().toString());
                    i.putExtras(extras);
                    startActivity(i);
                }

                else
                {
                    msg.setText("Please enter your name first.");
                }

            }
        });

        // Sends selection data to the next activity if name has been entered
        hard.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!name.getText().toString().equals("") && !name.getText().toString().equals("Enter Name"))
                {
                    String choice = "hard";
                    Intent i = new Intent(getApplicationContext(), expert_or_reg.class);
                    i.putExtra("choice2", choice);
                    i.putExtra("name", name.getText().toString());
                    i.putExtras(extras);
                    startActivity(i);
                }

                else
                {
                    msg.setText("Please enter your name first.");
                }

            }
        });


    }
}
