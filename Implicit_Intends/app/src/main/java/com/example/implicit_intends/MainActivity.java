package com.example.implicit_intends;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mWebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareTextEditText;
    int miVariable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebsiteEditText = findViewById(R.id.webSite);
        mLocationEditText = findViewById(R.id.openLoc);
        mShareTextEditText = findViewById(R.id.share);


    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        miVariable = bundle.getInt("MILLAVE",0);
        Log.d("MIVARIABLE","onSaveInstanceState");
        Log.d("MIVARIABLE",String.valueOf(miVariable));
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        miVariable = savedInstanceState.getInt("MILLAVE",0);
        Log.d("MIVARIABLE","onRestoreInstanceState");
        Log.d("MIVARIABLE",String.valueOf(miVariable));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MIVA","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MIVA","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MIVA","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MIVA","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MIVA","onResume");
    }

    public void openWebLink(View view){
        String url = mWebsiteEditText.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }else{
            Log.d("ImplicityIntents", "Can't Handle this");
        }
        Log.d("WEBSITE",url);
    }
    public void openLocation(View view){
        String loc = mLocationEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q="+loc);
        Intent intent = new Intent(Intent.ACTION_VIEW,addressUri);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }else{
            Log.d("ImplicityIntents", "Can't Handle this");
        }
     }
    public void share(View view){
        String txt = mShareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(R.string.share_text_with)
                .setText(txt)
                .startChooser();

    }
}