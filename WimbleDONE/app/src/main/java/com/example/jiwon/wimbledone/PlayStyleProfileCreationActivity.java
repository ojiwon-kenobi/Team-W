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

public class PlayStyleProfileCreationActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_style_profile_creation);

        Button continueButton = findViewById(R.id.playStyleContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayStyleProfileCreationActivity.this, PlayerMatchList.class);
                startActivity(intent);
            }
        });

        final Button leftyButton = findViewById(R.id.leftyButton);
        Button rightyButton = findViewById(R.id.rightyButton);

        leftyButton.setBackgroundColor(Color.GRAY);
        rightyButton.setBackgroundColor(Color.GRAY);

        leftyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("side", "lefty");
                editor.commit();

                v.setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.rightyButton)).setBackgroundColor(Color.GRAY);
            }
        });

        rightyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("side", "righty");
                editor.commit();

                v.setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.leftyButton)).setBackgroundColor(Color.GRAY);
            }
        });

        Button oneHandedButton = findViewById(R.id.oneHandedButton);
        Button twoHandedButton = findViewById(R.id.twoHandedButton);

        oneHandedButton.setBackgroundColor(Color.GRAY);
        twoHandedButton.setBackgroundColor(Color.GRAY);

        oneHandedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("hand", "one handed");
                editor.commit();

                v.setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.twoHandedButton)).setBackgroundColor(Color.GRAY);
            }
        });

        twoHandedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("hand", "two handed");
                editor.commit();

                v.setBackgroundColor(Color.DKGRAY);
                ((Button) findViewById(R.id.oneHandedButton)).setBackgroundColor(Color.GRAY);
            }
        });
    }
}
