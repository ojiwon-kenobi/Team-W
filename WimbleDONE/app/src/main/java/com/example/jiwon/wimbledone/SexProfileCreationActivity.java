package com.example.jiwon.wimbledone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by FRANKY on 4/29/18.
 */

public class SexProfileCreationActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sex_profile_creation);

        Button continueButton = findViewById(R.id.sexContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SexProfileCreationActivity.this, PlayStyleProfileCreationActivity.class);
                startActivity(intent);
            }
        });

        Button femaleButton = findViewById(R.id.femaleButton);
        Button maleButton = findViewById(R.id.maleButton);
        Button otherButton = findViewById(R.id.otherButton);

        femaleButton.setBackgroundColor(Color.GRAY);
        maleButton.setBackgroundColor(Color.GRAY);
        otherButton.setBackgroundColor(Color.GRAY);

        femaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("sex", "female");
                editor.commit();

                ((Button) v).setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.maleButton)).setBackgroundColor(Color.GRAY);
                ((Button) findViewById(R.id.otherButton)).setBackgroundColor(Color.GRAY);
            }
        });

        maleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("sex", "male");
                editor.commit();

                ((Button) v).setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.femaleButton)).setBackgroundColor(Color.GRAY);
                ((Button) findViewById(R.id.otherButton)).setBackgroundColor(Color.GRAY);
            }
        });

        otherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("sex", "other");
                editor.commit();

                ((Button) v).setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.femaleButton)).setBackgroundColor(Color.GRAY);
                ((Button) findViewById(R.id.maleButton)).setBackgroundColor(Color.GRAY);
            }
        });
    }
}
