package com.example.jiwon.wimbledone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by FRANKY on 4/29/18.
 */

public class MatchesFeedActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.blah);

        // Fetches saved information from profile creation survey.
        SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
        String name = settings.getString("name", "Jane Doe");
        String birthday = settings.getString("birthday", "11/11/1111");
        String sex = settings.getString("sex", "Unknown");
        String ntrp = settings.getString("ntrp", "beginner");
        String side = settings.getString("side", "righty");
        String hand = settings.getString("hand", "one handed");
        Log.d("User info: ", name+" "+birthday+" "+sex+" "+ntrp+" "+side+" "+hand);
    }
}
