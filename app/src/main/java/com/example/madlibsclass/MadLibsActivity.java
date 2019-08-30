package com.example.madlibsclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibsActivity extends AppCompatActivity {

    public static final String MY_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);

        Intent intent = getIntent();
        String myMessage = intent.getStringExtra(MY_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(myMessage);

    }
}
