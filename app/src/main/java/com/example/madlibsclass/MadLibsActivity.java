package com.example.madlibsclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MadLibsActivity extends AppCompatActivity {

    public static final String MY_MESSAGE = "message";
    public String myMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);
        Button button = (Button) findViewById(R.id.button);

        Intent intent = getIntent();
        myMessage = intent.getStringExtra(MY_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(myMessage);

        AnimationDrawable animation = (AnimationDrawable) button.getBackground();
        animation.setEnterFadeDuration(3000);
        animation.setExitFadeDuration(2000);
        animation.start();
    }

    public void onClick(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);
        String chooserTitle = "Choose an app to share with";
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }


}
