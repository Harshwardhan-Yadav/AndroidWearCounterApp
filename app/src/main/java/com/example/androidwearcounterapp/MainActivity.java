package com.example.androidwearcounterapp;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    public int count=0;

    public void add(View view){
        count++;
        mTextView.setText(""+count);
    }

    public void reset(View view){
        count=0;
        mTextView.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.countText);

        // Enables Always-on
        setAmbientEnabled();
    }
}