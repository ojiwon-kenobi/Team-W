package com.example.jiwon.wimbledone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;
import java.util.Random;

/**
 * Created by Jiwon on 4/19/18.
 */

public class SMSCodeConfirmationActivity extends AppCompatActivity {
    Button contB;
    EditText numET;
    TextView tv;
    TextView underline;
    private String pn= "phoneNumber";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_code);
        getWindow().setStatusBarColor(this.getResources().getColor(R.color.elegant_black));
        tv= findViewById(R.id.editnumber);
        numET = (EditText) findViewById(R.id.numET);

        Bundle extras= this.getIntent().getExtras();
        Long value = extras.getLong(pn);
        tv.setText("+" + value);

        Random rnd = new Random();
        final int passcode = 100000 + rnd.nextInt(900000);
        Toast toast= Toast.makeText(getApplicationContext(),
                "Use " + passcode + " as WimbleDONE account security code.", Toast.LENGTH_LONG);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        TextView toastTV = (TextView) toastLayout.getChildAt(0);
        toastTV.setTextSize(20);
        toast.show();

        underline = (TextView) findViewById(R.id.underline);
        underline.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Toast ladida = Toast.makeText(getApplicationContext(),
                                                       "Use " + passcode + " as WimbleDONE account security code.", Toast.LENGTH_LONG);
                                               LinearLayout ladidaLayout = (LinearLayout) ladida.getView();
                                               TextView ladidaTV = (TextView) ladidaLayout.getChildAt(0);
                                               ladidaTV.setTextSize(20);
                                               ladida.show();

                                           }
                                       });



        contB = (Button)findViewById(R.id.smsContinue);
        contB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SMSCodeConfirmationActivity.this, NameProfileCreationActivity.class);
                Integer intttt = Integer.parseInt(numET.getText().toString());
                if (intttt == passcode){
                    //gif
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...", Toast.LENGTH_SHORT).show();
                    startActivity(i);

                } else {
                    Toast.makeText(SMSCodeConfirmationActivity.this, "Wrong Credentials!!", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}