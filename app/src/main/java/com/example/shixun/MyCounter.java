package com.example.shixun;

import android.content.Intent;
import android.os.SystemClock;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;


public class MyCounter extends AppCompatActivity {


        Chronometer ch ;
        Button start ;
        Button pause ;
        Button restart ;
        Button btn_back;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_my_counter);
            //获取计时器组件
            ch = (Chronometer) findViewById(R.id.test);
            //获取开始按钮
            start = (Button) findViewById(R.id.start);
            //暂停计时按钮
            pause = (Button) findViewById(R.id.pause);
            //继续计时按钮
            restart = (Button) findViewById(R.id.go_on);
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //设置开始计时时间
                    ch.setBase(SystemClock.elapsedRealtime());
                    //启动计时器
                    ch.start();
                    pause.setEnabled(true);
                    restart.setEnabled(false);
                    start.setEnabled(false);
                }
            });
            //暂停按钮监听器
            pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start.setText("重新开始");
                    ch.stop();
                    start.setEnabled(true);
                    restart.setEnabled(true);
                    pause.setEnabled(false);
                }
            });
            //暂停按钮监听器
            restart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    start.setText("重新开始");
                    ch.start();
                    start.setEnabled(true);
                    pause.setEnabled(true);
                    restart.setEnabled(false);
                }
            });
            //为Chronomter绑定事件监听器
            ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                @Override
                public void onChronometerTick(Chronometer chronometer) {
                    //如果计时到现在超过了一小时秒
                    if (SystemClock.elapsedRealtime() - ch.getBase() > 3600 * 1000) {
                        ch.stop();
                        start.setEnabled(true);
                        restart.setEnabled(false);
                        pause.setEnabled(false);
                    }
                }
            });
            btn_back = findViewById(R.id.buttonBack);
            btn_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MyCounter.this,Clock.class);
                    startActivity(intent);
                }
            });
        }


}