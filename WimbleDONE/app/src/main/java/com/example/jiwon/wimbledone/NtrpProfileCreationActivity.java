package com.example.jiwon.wimbledone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

/**
 * Created by FRANKY on 4/29/18.
 */

public class NtrpProfileCreationActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ntrp_profile_creation);

        Button continueButton = findViewById(R.id.ntrpContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NtrpProfileCreationActivity.this, SexProfileCreationActivity.class);
                startActivity(intent);
            }
        });

        Button beginnerButton = findViewById(R.id.beginnerButton);
        Button intermediateButton = findViewById(R.id.intermediateButton);
        Button expertButton = findViewById(R.id.expertButton);

        beginnerButton.setBackgroundColor(Color.GRAY);
        intermediateButton.setBackgroundColor(Color.GRAY);
        expertButton.setBackgroundColor(Color.GRAY);

        beginnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("ntrp", "beginner");
                editor.commit();

                ((Button) v).setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.intermediateButton)).setBackgroundColor(Color.GRAY);
                ((Button) findViewById(R.id.expertButton)).setBackgroundColor(Color.GRAY);
            }
        });

        intermediateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("ntrp", "intermediate");
                editor.commit();

                ((Button) v).setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.beginnerButton)).setBackgroundColor(Color.GRAY);
                ((Button) findViewById(R.id.expertButton)).setBackgroundColor(Color.GRAY);
            }
        });

        expertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("ntrp", "expert");
                editor.commit();

                ((Button) v).setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.beginnerButton)).setBackgroundColor(Color.GRAY);
                ((Button) findViewById(R.id.intermediateButton)).setBackgroundColor(Color.GRAY);
            }
        });
    }
}
