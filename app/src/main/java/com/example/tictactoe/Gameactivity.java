package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Gameactivity extends AppCompatActivity {

    ImageButton easy,hard,medium;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameactivity);

        easy = (ImageButton) findViewById(R.id.imageButton);
        hard = (ImageButton) findViewById(R.id.imageButton2);
        medium = (ImageButton) findViewById(R.id.imageButton4);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Gameactivity.this,Game.class);
                startActivity(intent1);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Gameactivity.this,Gamehard.class);
                startActivity(intent2);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Gameactivity.this,Gamemedium.class);
                startActivity(intent2);
            }
        });


    }
}
