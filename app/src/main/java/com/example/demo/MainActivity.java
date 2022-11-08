package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_show;
    private EditText editTitle;
    private TextView textOutput;
    private Button button,btn_show;
    private Button btnOutput;
    public static final String EXTRA_MESSAGE = "com.example.demo.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show=(TextView) findViewById(R.id.tv_show);
        //editTitle = (EditText) findViewById(R.id.editTitle);
        textOutput=(TextView) findViewById(R.id.textOutput);

        btn_show=(Button)  findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_show.setText("按鈕測試");
                tv_show.setTextSize(50);
            }
        });

        btnOutput=(Button) findViewById(R.id.btnOutput);
        btnOutput.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textOutput.setText(editTitle.getText().toString());
            }
        });
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}