package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstMenu =(TextView)(findViewById(R.id.menu_item_1));
        String firstLog= firstMenu.getText().toString();
        Log.v("MainActivity",firstLog);


        // Find second menu item TextView and print the text to the logs

        TextView secondtMenu =(TextView)(findViewById(R.id.menu_item_2));
        String secondLog= secondtMenu.getText().toString();
        Log.v("MainActivity",secondLog);

        // Find third menu item TextView and print the text to the logs

        TextView thirdMenu =(TextView)(findViewById(R.id.menu_item_3));
        String thirdLog= thirdMenu.getText().toString();
        Log.v("MainActivity",thirdLog);







    }
}