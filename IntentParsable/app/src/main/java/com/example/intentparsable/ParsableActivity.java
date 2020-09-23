package com.example.intentparsable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ParsableActivity extends AppCompatActivity {
    TextView mNombre;
    TextView mApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parsable);
        Alumno  alu = getIntent().getExtras().getParcelable("alu");
        mNombre = findViewById(R.id.textView);
        mApp = findViewById(R.id.textView2);
        mNombre.setText(alu.getNombre());
        mApp.setText(alu.getApellido());
    }
}