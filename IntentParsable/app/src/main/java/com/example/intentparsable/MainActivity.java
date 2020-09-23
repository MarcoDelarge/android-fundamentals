package com.example.intentparsable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this,ParsableActivity.class);
        Alumno alu = new Alumno("Mauricio", "Cervantes");
        intent.putExtra("alu", (Parcelable) alu);
        startActivity(intent);
    }
}