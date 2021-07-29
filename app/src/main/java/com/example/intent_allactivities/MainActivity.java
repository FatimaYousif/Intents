package com.example.intent_allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText fname;
    EditText password;
    EditText dob;
    EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.signup);
        fname=(EditText) findViewById(R.id.fname);
        password=(EditText) findViewById(R.id.password);
        dob=(EditText) findViewById(R.id.dob);
        email=(EditText) findViewById(R.id.email);

        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View v)
                                 {
                                    //pass the above data to login activity like:
                                     String passedName=fname.getText().toString();
                                     String passedPassword=password.getText().toString();
                                     String passedEmail=email.getText().toString();
                                     String passedDob=dob.getText().toString();


                                     //switching activities (Explicit intent)
                                     Intent i =new Intent (MainActivity.this, activity_login.class );

                                     //data going with intent
                                     i.putExtra("fname", passedName);
                                     i.putExtra("password", passedPassword);
                                     i.putExtra("email", passedEmail);
                                     i.putExtra("dob", passedDob);

                                     startActivity(i);
                                 }
                             }
        );
    }
}