package com.example.drawables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mIV;
    private Imagen[] arregloId = {new Imagen(R.drawable.ic_charla), new Imagen(R.drawable.ic_charla1),
            new Imagen(R.drawable.ic_anadir_amigo),new Imagen(R.drawable.ic_grupo_de_chat),
            new Imagen(R.drawable.ic_redes_sociales)};
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIV = findViewById(R.id.imageView);
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