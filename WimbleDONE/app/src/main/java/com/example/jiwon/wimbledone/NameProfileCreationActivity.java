package com.example.jiwon.wimbledone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Jiwon on 4/19/18.
 */

public class NameProfileCreationActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_profile_creation);

        Button continueButton = findViewById(R.id.nameContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                EditText editText = findViewById(R.id.nameEditText);
                editor.putString("name", editText.getText().toString());
                editor.commit();

                Intent intent = new Intent(NameProfileCreationActivity.this, BirthdayProfileCreationActivity.class);
                startActivity(intent);
            }
        });
    }
}
