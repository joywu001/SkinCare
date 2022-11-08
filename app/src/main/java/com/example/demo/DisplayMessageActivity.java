package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
    public void skinDiscuss(View view) {
        Intent intent = new Intent(this, Skin_Discuss.class);
        startActivity(intent);
    }
    public void skinNeeds(View view) {
        Intent intent = new Intent(this, Skin_Needs.class);
        startActivity(intent);
    }
    public void prodPrice(View view) {
        Intent intent = new Intent(this, Prod_Price.class);
        startActivity(intent);
    }
    public void prodFunc(View view) {
        Intent intent = new Intent(this, Prod_Func.class);
        startActivity(intent);
    }
    public void prodBrand(View view) {
        Intent intent = new Intent(this, Prod_Brand.class);
        startActivity(intent);
    }
    public void skinProcess(View view) {
        Intent intent = new Intent(this, Skin_Process.class);
        startActivity(intent);
    }
}
