package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mSubmitButton;
    private EditText mNameEditText;
    private EditText mPlaceEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameEditText = (EditText) findViewById(R.id.nameInput);
        mPlaceEditText = (EditText) findViewById(R.id.placeInput);
        mSubmitButton = (Button) findViewById(R.id.submit);
            mSubmitButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    String name = mNameEditText.getText().toString();
                    String place = mPlaceEditText.getText().toString();
                    Log.d(TAG, "name: " + name);
                    Log.d(TAG, place);
                    Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("place", place);
                    startActivity(intent);
                }
            });
    }
}
