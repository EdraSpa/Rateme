package com.example.cmarzella.rateme;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView customFontTextView;
    Typeface typeFace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeFace = Typeface.createFromAsset(getAssets(), "font/OpenSans-CondLight.ttf");
        customFontTextView = (TextView) findViewById(R.id.customFontTextView);
        customFontTextView.setTypeface(typeFace);
    }

}
