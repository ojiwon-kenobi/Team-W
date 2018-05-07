package com.example.jiwon.wimbledone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jiwon.wimbledone.R;

import org.w3c.dom.Text;

public class profilePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);



//        Button backbttn = (Button) findViewById(R.id.back_bttn);
//
//        backbttn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                finish();
//            }
//        });


        SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
        String mName = settings.getString("name", "");
        String mNtrp = settings.getString("ntrp", "");
        String mSex = settings.getString("sex", "");
        String mHand = settings.getString("hand", "");
        String mSide = settings.getString("side", "");





//        editor.putString("ntrp", "intermediate");
//        editor.putString("sex", "female");
//editor.putString("hand", "one handed");
//        editor.putString("side", "righty");

        TextView mUserName = (TextView) findViewById(R.id.user_name);
        TextView mmNtrp = (TextView) findViewById(R.id.ntrp_);
        TextView mmSex = (TextView) findViewById(R.id.gender_);
        TextView mmHand = (TextView) findViewById(R.id.side_);
        TextView mmSide = (TextView) findViewById(R.id.backhand_);
        mUserName.setText(mName);
        mmNtrp.setText(mNtrp);
        mmSex.setText(mSex);
        mmHand.setText(mHand);
        mmSide.setText(mSide);

    }






}
