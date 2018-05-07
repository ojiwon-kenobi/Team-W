package com.example.jiwon.wimbledone;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jiwon on 4/19/18.
 */

public class SMSCodeActivity extends AppCompatActivity {
    TextView underline;
    Button b1;
    TextView phonenum;
    private String pn= "phoneNumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_num);
        getWindow().setStatusBarColor(this.getResources().getColor(R.color.elegant_black));
        phonenum= findViewById(R.id.numET);

        underline = findViewById(R.id.underline);
        underline.setPaintFlags(underline.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


        b1 = findViewById(R.id.smsContinue);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SMSCodeActivity.this, SMSCodeConfirmationActivity.class);
                Bundle bundle = new Bundle();
                bundle.putLong(pn, Long.parseLong(phonenum.getText().toString()));
                i.putExtras(bundle);
                startActivity(i);
            }
        });


    }


}