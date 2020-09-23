package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint_dos);
        text1 = findViewById(R.id.textView);
        text1.setText("N");
        text2 = findViewById(R.id.textView2);
        text2.setText("A");
        text3 = findViewById(R.id.textView4);
        text3.setText("A");

    }
}