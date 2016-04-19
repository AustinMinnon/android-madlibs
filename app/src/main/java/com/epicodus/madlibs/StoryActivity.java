package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();
    private TextView mNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mNameTextView = (TextView) findViewById(R.id.nameTextView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText(name);
    }
}
