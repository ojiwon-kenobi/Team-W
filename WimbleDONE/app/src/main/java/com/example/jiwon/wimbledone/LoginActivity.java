package com.example.jiwon.wimbledone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button fbLogin;
    Button phoneNumLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        setTitle("Log into WimbleDONE");

        fbLogin = (Button) findViewById(R.id.fbLoginButton);
        phoneNumLogin = (Button) findViewById(R.id.phoneNumLoginButton);

        fbLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, LoginFBActivity.class);
                Bundle extras = new Bundle();

                i.putExtras(extras);
                startActivity(i);
            }
        });


        phoneNumLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, SMSCodeActivity.class);
                Bundle extras = new Bundle();

                i.putExtras(extras);
                startActivity(i);
            }
        });
    }
}