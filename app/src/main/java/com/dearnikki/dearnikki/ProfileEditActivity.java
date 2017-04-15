package com.dearnikki.dearnikki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class ProfileEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        final EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
        final EditText etLastName = (EditText) findViewById(R.id.etLastName);
        final RadioGroup rdgrpGender = (RadioGroup) findViewById(R.id.rdgrpGender);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etBio = (EditText) findViewById(R.id.etBio);
        final Button btnSaveProfile = (Button) findViewById(R.id.btnSaveProfile);

        Intent intent = getIntent();
        final int user_id = intent.getIntExtra("user_id", 0);
        final String first_name = intent.getStringExtra("first_name");
        final String last_name = intent.getStringExtra("last_name");

        etFirstName.setText(first_name);
        etLastName.setText(last_name);

//        btnSaveProfile.setOnClickListener();
    }
}
