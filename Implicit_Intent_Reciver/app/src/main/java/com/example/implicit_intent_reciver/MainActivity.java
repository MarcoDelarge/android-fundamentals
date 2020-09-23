package com.example.implicit_intent_reciver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Intent intent = getIntent();

        if(intent.getData() != null){
            Log.d("LOGGGER","Entro al if");
            String uri_string = intent.getData().toString();
            TextView textView = findViewById(R.id.text_uri_message);
            textView.setText(uri_string);
        }
        Log.d("LOGGER","NO entreo");*/
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                String uri_string = intent.getStringExtra(Intent.EXTRA_TEXT);
                TextView textView = findViewById(R.id.text_uri_message);
                textView.setText(uri_string);
                Log.d("LOGGER" ,uri_string);
                // Handle text being sent
            }
        }
        else {
            Log.d("LOGGER","NO entreo");
            // Handle other intents, such as being started from the home screen
        }
    }
}