package com.example.intent_allactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_login extends AppCompatActivity {

     EditText name;
     EditText password;
     Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b2=(Button)findViewById(R.id.signin);

        Intent i2=getIntent();

        //incoming data
        String gotName=i2.getStringExtra("fname");
        String gotPassword=i2.getStringExtra("password");
        String gotEmail=i2.getStringExtra("email");
        String gotDob=i2.getStringExtra("dob");


        //activity's(login activity's) input data get
        name= (EditText)findViewById(R.id.login_name);
        password= (EditText)findViewById(R.id.login_password);

        //convert views to string
        String login_name=name.getText().toString();
        String login_pass=password.getText().toString();

        b2.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View v)
                                 {
                                     String login_name=name.getText().toString();
                                     String login_pass=password.getText().toString();


                                     if(login_name.equals(gotName) && login_pass.equals(gotPassword))
                                     {
                                         Intent i3 =new Intent (activity_login.this, activity_info.class );

                                         //data going with intent name, dob, gender
                                         i3.putExtra("name", gotName);
                                         i3.putExtra("dob", gotDob);
                                         i3.putExtra("email", gotEmail);

                                         startActivity(i3);
                                     }
                                     else
                                     {
                                         Toast.makeText(activity_login.this, "incorrect details",Toast.LENGTH_LONG).show();
                                     }
                                 }
                             }
        );

    }
}