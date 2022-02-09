package com.example.loginanddetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityPersonalInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        Button nextbtn = findViewById(R.id.nextBtn);
        EditText fname = findViewById(R.id.txtfname);
        EditText lname = findViewById(R.id.txtlname);
        EditText age = findViewById(R.id.txtage);
        EditText city = findViewById(R.id.txtcity);

        nextbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int[] flag = {0};
                if(TextUtils.isEmpty(fname.getText()))
                {
                    fname.setError("First name is required");
                    flag[0] = 1;
                }
                if(TextUtils.isEmpty(lname.getText()))
                {
                    lname.setError("Last name is required");
                    flag[0] = 1;
                }
                if(TextUtils.isEmpty(age.getText()))
                {
                    age.setError("Age is required");
                    flag[0] = 1;
                }
                if(TextUtils.isEmpty(city.getText()))
                {
                    city.setError("City is required");
                    flag[0] = 1;
                }
                if(flag[0]==0)
                    startActivity(new Intent(ActivityPersonalInformation.this, ActivityEduInfo.class));
            }
        });
        //Third Activity: Educational Info: Uni Name, College, Branch, Roll No.
    }
}