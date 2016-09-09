package com.example.sokoll.ass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class expert_or_reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert_or_reg);

        final Bundle extras = getIntent().getExtras();

        final Button reg  = (Button) findViewById(R.id.Regular_Button);
        final Button expert  = (Button) findViewById(R.id.button2);

        reg.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                String choice = "reg";

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("choice3", choice);
                i.putExtras(extras);
                startActivity(i);

            }
        });

        expert.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                String choice = "expert";

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("choice3", choice);
                i.putExtras(extras);
                startActivity(i);

            }
        });

    }
}
