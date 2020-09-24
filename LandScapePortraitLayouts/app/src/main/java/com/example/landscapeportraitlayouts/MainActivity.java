package com.example.landscapeportraitlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.ic_gobernante,R.drawable.ic_lapices_de_colores,
            R.drawable.ic_libros,R.drawable.ic_prueba};
    int index = 0;
    ImageView mLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation = getResources().getConfiguration().orientation;
        if(orientation ==  Configuration.ORIENTATION_PORTRAIT){

            Button btnAdelante = findViewById(R.id.pAdelante);
            Button btnAtras = findViewById(R.id.pAtras);
            mLogo = findViewById(R.id.imageView);
            btnAdelante.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mLogo.setImageResource(makeMove(1));
                }
            });
            btnAtras.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mLogo.setImageResource(makeMove(-1));
                }
            });

        }else{
            mLogo = findViewById(R.id.imageView2);
        }
    }
    public int makeMove(int move){
        if(move == 1){
            index = (1+index)%images.length;
            return images[index];
        }else{
            index--;
            if(index < 0) index = images.length - 1;
            return images[index];
        }
    }
    public void setIMG1(View view){
        mLogo.setImageResource(images[0]);
    }
    public void setIMG2(View view){
        mLogo.setImageResource(images[1]);
    }
    public void setIMG3(View view){
        mLogo.setImageResource(images[2]);
    }
    public void setIMG4(View view){
        mLogo.setImageResource(images[3]);
    }
}