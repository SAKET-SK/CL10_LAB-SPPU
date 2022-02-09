package com.example.loginanddetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityEduInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu_info);

        Button submitButton = findViewById(R.id.submitBtn);
        EditText uniName = findViewById(R.id.txtuni);
        EditText collegeName = findViewById(R.id.txtcollege);
        EditText branchName = findViewById(R.id.txtbranch);
        EditText rollNumber = findViewById(R.id.txtroll);

        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int[] flag = {0};
                if(TextUtils.isEmpty(uniName.getText()))
                {
                    uniName.setError("University is required");
                    flag[0] = 1;
                }
                if(TextUtils.isEmpty(collegeName.getText()))
                {
                    collegeName.setError("College is required");
                    flag[0] = 1;
                }
                if(TextUtils.isEmpty(branchName.getText()))
                {
                    branchName.setError("Branch is required");
                    flag[0] = 1;
                }
                if(TextUtils.isEmpty(rollNumber.getText()))
                {
                    rollNumber.setError("Roll number is required");
                    flag[0] = 1;
                }
                if(flag[0]==0)
                {
                    Toast.makeText(getApplicationContext(), "Details submitted!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}