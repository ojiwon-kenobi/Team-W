package com.example.jiwon.wimbledone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jiwon on 4/19/18.
 */

public class LoginFBActivity extends AppCompatActivity {
    private Button cont;
    private Button cancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fb_login);
        cont = (Button) findViewById(R.id.fbContinueButton);
        cancel = (Button) findViewById(R.id.fbCancelButton);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginFBActivity.this, LoginActivity.class);

//                Bundle extras = new Bundle();
//                i.putExtras(extras);
                startActivity(i);

            }

        });
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //need gif of roundy circly thing going into a check mark
                Intent i = new Intent(LoginFBActivity.this, NameProfileCreationActivity.class);
                Bundle extras = new Bundle();
                i.putExtras(extras);
                startActivity(i);
            }
        });

    }

}