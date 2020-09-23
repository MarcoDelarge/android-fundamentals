package com.example.internalizacionejemplo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mBtnHello;
    TextView mHello;
    private final String SAVED_STRING =  "savedS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnHello = findViewById(R.id.button);
        mHello = findViewById(R.id.textView2);
        mBtnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHello.setText("hola");
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String savedS = mHello.getText().toString();
        outState.putString(SAVED_STRING,savedS);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mHello.setText(savedInstanceState.getString(SAVED_STRING));
    }
}