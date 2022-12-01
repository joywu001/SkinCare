package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.demo.R;

public class Skin_Discuss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_discuss);
    }
    public void skin_discuss_q2(View view) {
        Intent intent = new Intent(this, skin_discuss_q2.class);
        startActivity(intent);
    }
}