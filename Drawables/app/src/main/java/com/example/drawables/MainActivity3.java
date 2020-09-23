package com.example.drawables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    private ImageView mIV;
    private ImagenAbs[] arregloId = {
            new ImagenAbs() {
                @Override
                public int getResource() {
                    return R.drawable.ic_charla;
                }
            },
            new ImagenAbs() {
                @Override
                public int getResource() {
                    return R.drawable.ic_charla1;
                }
            },
            new ImagenAbs() {
                @Override
                public int getResource() {
                    return R.drawable.ic_anadir_amigo;
                }
            },
            new ImagenAbs() {
                @Override
                public int getResource() {
                    return R.drawable.ic_grupo_de_chat;
                }
            },
            new ImagenAbs() {
                @Override
                public int getResource() {
                    return R.drawable.ic_redes_sociales;
                }
            }};
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mIV = findViewById(R.id.imageView3);
        mIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage();
            }
        });

    }
    public void changeImage(){
        index = (1+index)%arregloId.length;
        mIV.setImageResource(arregloId[index].getResource());
    }
}