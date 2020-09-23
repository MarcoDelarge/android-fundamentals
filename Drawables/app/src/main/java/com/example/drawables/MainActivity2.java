package com.example.drawables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView mIV;
    private int[] arregloId = {R.drawable.ic_charla,R.drawable.ic_charla1,
            R.drawable.ic_anadir_amigo,R.drawable.ic_grupo_de_chat, R.drawable.ic_redes_sociales};
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mIV = findViewById(R.id.imageView2);
        mIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage();
            }
        });

    }
    public void changeImage(){
        index = (1+index)%arregloId.length;
        mIV.setImageResource(arregloId[index]);
    }

}