package com.example.intent_allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class activity_info extends AppCompatActivity {

     EditText name;
     EditText dob;
     EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent i4=getIntent();

        //incoming data
        String gotName=i4.getStringExtra("name");
        String gotEmail=i4.getStringExtra("email");
        String gotDob=i4.getStringExtra("dob");

        //activity's(login activity's) input data get
        name= (EditText)findViewById(R.id.info_name);
        dob= (EditText)findViewById(R.id.info_dob);
        email= (EditText)findViewById(R.id.info_email);

        name.setText(gotName);
        dob.setText(gotEmail);
        email.setText(gotDob);


    }
}