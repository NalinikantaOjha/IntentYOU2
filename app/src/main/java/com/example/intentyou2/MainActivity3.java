package com.example.intentyou2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
protected TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t2 = findViewById(R.id.t2);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        t2.setText(userName);
    }
}