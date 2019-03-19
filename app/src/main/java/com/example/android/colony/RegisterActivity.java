package com.example.android.colony;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText email2, flatno2, mobile2, retype2, password2, userid2, name2;
    Button submit2;
    private String email3, flatno3, mobile3, retype3, password3, userid3, name3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email2 = findViewById(R.id.email1);
        flatno2 = findViewById(R.id.flatno1);
        mobile2 = findViewById(R.id.mobile1);
        retype2 = findViewById(R.id.retype1);
        password2 = findViewById(R.id.password1);
        userid2 = findViewById(R.id.userid1);
        submit2 = findViewById(R.id.submit1);
        name2 = findViewById(R.id.name1);
        email3 = email2.getText().toString();
        flatno3 = flatno2.getText().toString();
        mobile3 = mobile2.getText().toString();
        retype3 = retype2.getText().toString();
        password3 = password2.getText().toString();
        userid3 = userid2.getText().toString();
        name3 = name2.getText().toString();
        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email3 == null && flatno3 == null && mobile3 == null && retype3 == null && password3 == null && userid3 == null && name3 == null) {

                    Toast.makeText(RegisterActivity.this, "Null Values are Not Accepted", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "hcgsb", Toast.LENGTH_LONG).show();
                }
            }
        });


    }


}