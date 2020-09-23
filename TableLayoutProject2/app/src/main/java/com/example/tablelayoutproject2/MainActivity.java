package com.example.tablelayoutproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TableLayout mTBl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTBl = findViewById(R.id.tableL);
        forGeneration();
    }
    public void whileGeneration(){
        int i  = 0;
        while(i<10){
            TableRow mTRow = new TableRow(this);
            TextView mTV = new TextView(this);
            mTV.setText("Fila "+i);
            mTV.setBackgroundColor(Color.BLUE);
            mTRow.setBackgroundColor(Color.YELLOW);
            mTRow.addView(mTV,new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT));
            mTBl.addView(mTRow,new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,TableLayout.LayoutParams.WRAP_CONTENT));
            i++;
        }
    }
    public void forGeneration(){
        for(int i = 0; i<10;i++) {
            TableRow mTRow = new TableRow(this);
            Button mTV = new Button(this);
            mTV.setText("Fila "+i);
            mTV.setBackgroundColor(Color.BLUE);
            mTRow.setBackgroundColor(Color.YELLOW);
            mTRow.addView(mTV,new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT));
            mTBl.addView(mTRow,new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,TableLayout.LayoutParams.WRAP_CONTENT));
        }
    }
    public void doWhileGeneration(){
        int i  = 0;
        do{
            TableRow mTRow = new TableRow(this);
            ImageView mTV = new ImageView(this);
            mTV.setImageResource(R.mipmap.ic_launcher);
            mTV.setBackgroundColor(Color.BLUE);
            mTRow.setBackgroundColor(Color.YELLOW);
            mTRow.addView(mTV,new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,TableRow.LayoutParams.WRAP_CONTENT));
            mTBl.addView(mTRow,new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,TableLayout.LayoutParams.WRAP_CONTENT));
            i++;
        }while(i<10);
    }
}