package com.example.shixun;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ZuceActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button register;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zuce);
        findViews();
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name=username.getText().toString().trim();
                String pass=password.getText().toString().trim();
                Log.i("TAG",name+"_"+pass);
                UserService uService=new UserService(ZuceActivity.this);
                User user=new User();
                user.setUsername(name);
                user.setPassword(pass);
                uService.register(user);
                Toast.makeText(ZuceActivity.this, "注册成功", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void findViews() {
        username=(EditText) findViewById(R.id.et_1);
        password=(EditText) findViewById(R.id.et_2);
        register=(Button) findViewById(R.id.btn_login);
    }

}
