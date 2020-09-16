package com.example.shixun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Light extends AppCompatActivity {
    private Button Btn;
    private Button Btn2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhaoming);

        Btn = findViewById(R.id.buttonBack);
        Btn2 = findViewById(R.id.buttonTimer);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Light.this,FunctionActivity.class);
                startActivity(intent);
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Light.this,TimerActivity.class);
                startActivity(intent);
            }
        });

    }



}



