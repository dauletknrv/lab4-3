  package com.example.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView bart = findViewById(R.id.bart);


        bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(2000);

//        bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

//        bart.animate().rotation(1800f).setDuration(2000);

//        bart.animate().rotation(180f).setDuration(2000);



//        ImageView homer = findViewById(R.id.homer);

//        homer.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView bart = findViewById(R.id.bart);

        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);

    }
}
