package com.example.shixun;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Temperature extends AppCompatActivity {
    private Button Btn;
    private Button B1;
    private Button B2;
    private EditText Txt;
    private  String mes;
    private TextView wendu;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        Btn = findViewById(R.id.et_111);
        Txt = findViewById(R.id.et_1);
        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        wendu = findViewById(R.id.wendu);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Temperature.this,FunctionActivity.class);
                startActivity(intent);
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    FileOutputStream fi_out;
                    fi_out= openFileOutput("user_msg.txt",MODE_PRIVATE);
                    String name=Txt.getText().toString();
                    fi_out.write(name.getBytes());
                    fi_out.close();
                    Log.i("TAG","上传成功");
                    Toast.makeText(Temperature.this, "上传成功", Toast.LENGTH_LONG).show();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });


        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    FileInputStream fi_input;
                    fi_input= openFileInput("user_msg.txt");
                    byte[] buffer =new byte[fi_input.available()];
                    fi_input.read(buffer);
                    mes = new String(buffer);
                    wendu.setText(mes);
                    fi_input.close();
                    Log.i("TAG","下载成功");
                    Toast.makeText(Temperature.this, "下载成功", Toast.LENGTH_LONG).show();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });



    }

}



