package com.example.shixun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FunctionActivity extends AppCompatActivity {
    ImageButton Btn1;
    ImageButton Btn2;
    ImageButton Btn3;
    ImageButton Btn5;
    private TextView TXT;
    private Button Btn4;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Btn1 = findViewById(R.id.Button_temp);
        Btn2 = findViewById(R.id.Button_light);
        Btn3 = findViewById(R.id.Button_clock);
        Btn4 = findViewById(R.id.button4);
        Btn5 = findViewById(R.id.button_wifi);
        TXT = findViewById(R.id.username);

        Intent intent=getIntent();
        TXT.setText(intent.getStringExtra("data"));

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FunctionActivity.this,Temperature.class);
                startActivity(intent);
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FunctionActivity.this,Light.class);
                startActivity(intent);
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FunctionActivity.this,Clock.class);
                startActivity(intent);
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FunctionActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FunctionActivity.this,Wifi_function.class);
                startActivity(intent);
            }
        });


    }



}



