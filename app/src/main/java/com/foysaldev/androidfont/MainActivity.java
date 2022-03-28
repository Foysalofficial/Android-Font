package com.foysaldev.androidfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView, textView2;
    private Typeface typeface, typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.TextView);
        textView2 = findViewById(R.id.TextViewTwo);

        typeface = Typeface.createFromAsset(getAssets(),"font/archivo_black.ttf");
        textView.setTypeface(typeface);

        typeface2 = Typeface.createFromAsset(getAssets(),"font/monolisa_regular.ttf");
        textView2.setTypeface(typeface2);
    }
}