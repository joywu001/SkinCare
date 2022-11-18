package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class skin_discuss_q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_discuss_q2);
    }
    public void skin_discuss_q3(View view) {
        Intent intent = new Intent(this, skin_discuss_q3.class);
        startActivity(intent);
    }
}