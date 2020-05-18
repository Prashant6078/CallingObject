package com.example.callingobject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv=new TextView(this);
        tv.setText("Hello from Prashant.........!");
        tv.setTextSize(30);
        tv.setTextColor(Color.BLUE);
        setContentView(tv);

    }
}
