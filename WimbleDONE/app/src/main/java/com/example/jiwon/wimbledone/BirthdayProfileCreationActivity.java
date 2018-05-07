package com.example.jiwon.wimbledone;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import java.util.Calendar;

/**
 * Created by FRANKY on 4/29/18.
 */

public class BirthdayProfileCreationActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birthday_profile_creation);

        final EditText dateEditText = findViewById(R.id.dateEditText);
        TextWatcher mDateEntryWatcher = new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String working = s.toString();
                boolean isValid = true;
                if (working.length()==2 && before ==0) {
                    if (Integer.parseInt(working) < 1 || Integer.parseInt(working)>12) {
                        isValid = false;
                    } else {
                        working+="/";
                        dateEditText.setText(working);
                        dateEditText.setSelection(working.length());
                    }
                } else if (working.length()==5 && before ==0) {
                    String enteredDay = working.substring(3);
                    if (Integer.parseInt(enteredDay) < 1 || Integer.parseInt(enteredDay) > 31) {
                        isValid = false;
                    } else {
                        working+="/";
                        dateEditText.setText(working);
                        dateEditText.setSelection(working.length());
                    }
                } else if (working.length()==10 && before ==0) {
                    String enteredYear = working.substring(6);
                    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                    if (Integer.parseInt(enteredYear) > currentYear) {
                        isValid = false;
                    }
                } else if (working.length()!=10) {
                    isValid = false;
                }

                if (!isValid) {
                    dateEditText.setError("Enter a valid date: MM/DD/YYYY");
                } else {
                    dateEditText.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        };
        dateEditText.addTextChangedListener(mDateEntryWatcher);

        Button continueButton = findViewById(R.id.birthdayContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences settings = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                EditText editText = findViewById(R.id.dateEditText);
                editor.putString("birthday", editText.getText().toString());
                editor.commit();

                Intent intent = new Intent(BirthdayProfileCreationActivity.this, NtrpProfileCreationActivity.class);
                startActivity(intent);
            }
        });
    }
}
