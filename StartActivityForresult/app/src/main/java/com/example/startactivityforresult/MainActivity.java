package com.example.startactivityforresult;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mInput;
    private Button botonSend;
    private TextView mMessage;
    static final String EXTRA = "Main_Activity.EXTRA_NOMBRE";
    private final String LOG_TAG = "ELOGES";
    private String savedString;
    public static final int TEXT_REQUEST = 1;
    private final String EXTRA_SAVED = "valorIn";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        mInput = findViewById(R.id.editTextTextPersonName);
        botonSend = findViewById(R.id.button);
        mMessage = findViewById(R.id.textView4);



        botonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSecondActivity();
            }
        });
    }
    public void launchSecondActivity(){
        Log.d(LOG_TAG,"Buttonclicked");
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        String message = mInput.getText().toString();
        intent.putExtra(EXTRA,message);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mMessage.setText(savedInstanceState.getString(EXTRA_SAVED));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                String reply = data.getStringExtra(MainActivity2.EXTRA_REPLAY);

                mMessage.setText(reply);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String savedS = mMessage.getText().toString();
        outState.putString(EXTRA_SAVED,savedS);
    }
}