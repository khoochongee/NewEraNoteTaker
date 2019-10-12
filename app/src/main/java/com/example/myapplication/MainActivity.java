package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView edtUsername,edtPassword;
    Button btnLogin;
    private String username= "KhooChongEe";
    private String password= "khoochongee1255";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        edtUsername=findViewById(R.id.user_input);
        edtPassword=findViewById(R.id.password_input);
        btnLogin=findViewById(R.id.btn_login);
    }

    private void setListeners(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername=edtUsername.getText().toString();
                String inputPassword=edtPassword.getText().toString();

                if(inputUsername.equals(username)&& inputPassword.equals(password)){
                    Toast.makeText(MainActivity.this,"Login Sucessful",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,afterLogin.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this,"Login Fail",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
