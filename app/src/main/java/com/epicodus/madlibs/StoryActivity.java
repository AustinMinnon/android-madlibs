package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();
    private TextView mWeatherTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mWeatherTextView = (TextView) findViewById(R.id.storyText);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String place = intent.getStringExtra("place");
        String weather = intent.getStringExtra("weather");
        String verb = intent.getStringExtra("verb");
        String verb2 = intent.getStringExtra("verb2");
        String adjective = intent.getStringExtra("adjective");
        String animal = intent.getStringExtra("animal");
        String storyString = name + " went to " + place + " on a " + weather + " day." + " A(n) " + adjective +" "+ animal + " " + verb + " in front of all of the " + verb2 + " people";
        mWeatherTextView.setText(storyString);
    }
}

