package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(String.valueOf(R.id.tv_counter));
            TextView textView = (TextView) findViewById(R.id.tv_counter);
            textView.setText(String.valueOf(mCount));
        }
    }

    public void onCountButtonPressed(View view) {
        mCount++;
        TextView textView = (TextView) findViewById(R.id.tv_counter);
        textView.setText(String.valueOf(mCount));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(String.valueOf(R.id.tv_counter), mCount);
    }
}