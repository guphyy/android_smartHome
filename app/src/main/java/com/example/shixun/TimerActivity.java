package com.example.shixun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimerActivity extends AppCompatActivity {

    private Button mbtnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        mbtnback = findViewById(R.id.btn_back);

        mbtnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = null;
                intent1 = new Intent(TimerActivity.this,Light.class);
                startActivity(intent1);
            }
        });
    }
}
