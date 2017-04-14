package com.dearnikki.dearnikki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
        final EditText etLastName = (EditText) findViewById(R.id.etLastName);
        final EditText etGender = (EditText) findViewById(R.id.etGender);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etBio = (EditText) findViewById(R.id.etBio);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
        final Button btnEditProfile = (Button) findViewById(R.id.btnEditProfile);

        Intent intent = getIntent();
        String first_name = intent.getStringExtra("first_name");
        String last_name = intent.getStringExtra("last_name");

        String message = first_name + ", welcome!";
        welcomeMessage.setText(message);
        etFirstName.setText(first_name);
        etLastName.setText(last_name);
    }
}
