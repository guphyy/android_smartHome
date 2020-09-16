package com.example.shixun;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Clock extends AppCompatActivity {
    private Button Btn_back;
    private Button Btn_showDigital;
    private Button Btn_counter;
    private Button Btn_reset;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        Btn_back = findViewById(R.id.buttonBack);
        Btn_showDigital = findViewById(R.id.button_digital);
        Btn_counter = findViewById(R.id.button_counter);
        Btn_reset = findViewById(R.id.button_reset);

        Btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Clock.this,FunctionActivity.class);
                startActivity(intent);
            }
        });

        Btn_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Clock.this, MyCounter.class);
                startActivity(intent);
            }
        });

        Btn_showDigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Clock.this, DigitalTime.class);
                startActivity(intent);
            }
        });
        Btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast ;
                Toast.makeText(getApplicationContext(),"时间已校准",Toast.LENGTH_LONG).show();
            }
        });



    }



};



