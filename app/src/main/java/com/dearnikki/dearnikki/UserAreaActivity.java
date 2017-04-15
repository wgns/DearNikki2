package com.dearnikki.dearnikki;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

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
        final int user_id = intent.getIntExtra("user_id", 0);
        final String first_name = intent.getStringExtra("first_name");
        final String last_name = intent.getStringExtra("last_name");

        String message = first_name + ", welcome!";
        welcomeMessage.setText(message);
        etFirstName.setText(first_name);
        etLastName.setText(last_name);

        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this, ProfileEditActivity.class);
                intent.putExtra("user_id", user_id);
                intent.putExtra("first_name", first_name);
                intent.putExtra("last_name", last_name);

                startActivity(intent);
            }
        });
    }
}
