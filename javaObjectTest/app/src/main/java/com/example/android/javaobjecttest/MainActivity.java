package com.example.android.javaobjecttest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView testTextView= new TextView(this);
        testTextView.setText("This is a text view made only using java!!");
        testTextView.setTextSize(20);
        testTextView.setTextColor(Color.RED);
        setContentView(testTextView);
    }
}
