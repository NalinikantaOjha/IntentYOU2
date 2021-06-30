package com.example.intentyou2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
protected EditText et1;
protected EditText et2;
protected Button b2;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       initViews();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isPasswordValid = isPasswordValid();
                boolean isEmailValid = isEmailValid();
                if (isEmailValid && isPasswordValid) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("username", et1.getText().toString());
                    startActivity(intent);
                }
            }
        });


    }
    private void initViews() {
        et1=findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        b2=findViewById(R.id.b2);
    }
    private boolean isEmailValid() {
        if (et1.getText().toString().matches(emailValidation)) {
            return true;
        } else {
            et1.setError("Invalid email");
            return false;
        }
    }
    private boolean isPasswordValid() {
        if (et2.getText().toString().length() >= 6) {
            return true;
        } else {
            et2.setError("Password length is grather than 6 characters");
            return false;
        }
    }

    }
