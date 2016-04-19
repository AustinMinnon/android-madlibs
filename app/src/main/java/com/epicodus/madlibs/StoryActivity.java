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
        String storyString = name + " went to " + place + " on a " + weather + " day"  ;
                mWeatherTextView.setText(storyString);
    }
}






//        String sampleStory = String.format(getResources().getString(R.string.teststring), "name");
