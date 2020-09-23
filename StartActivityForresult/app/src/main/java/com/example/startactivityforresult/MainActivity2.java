package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText mReplay;
    private Button botonSend;
    private TextView mMessage;
    public static final String EXTRA_REPLAY = "com.example.startactivityforresult.MainActivity2";
    private final String LOG_TAG = "ELOGES";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mReplay = findViewById(R.id.editTextTextPersonName2);
        botonSend = findViewById(R.id.button2);
        mMessage = findViewById(R.id.textView3);
        Intent intent = getIntent();
        String nombre = null;
        if(intent != null){
            nombre = intent.getStringExtra(MainActivity.EXTRA);
            mMessage = findViewById(R.id.textView3);
            if(nombre != null){
                mMessage.setText(nombre);
            }
        }
    }
    public void returnReplay(View view){
        String reply = mReplay.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLAY,reply);
        replyIntent.putExtra("Nombre","Mauricio Cervantes");
        setResult(RESULT_OK,replyIntent);
        Log.d(LOG_TAG,"End Second Activity");
        finish();
    }


}