package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.submit) Button mSubmitButton;
    @Bind(R.id.nameInput) EditText mNameEditText;
    @Bind(R.id.placeInput) EditText mPlaceEditText;
    @Bind(R.id.verbInput) EditText mVerbEditText;
    @Bind(R.id.verbInput2) EditText mVerbEditText2;
    @Bind(R.id.animalInput) EditText mAnimalEditText;
    @Bind(R.id.adjectiveInput) EditText mAdjectiveEditText;
    @Bind(R.id.weatherInput) EditText mWeatherEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        mNameEditText = (EditText) findViewById(R.id.nameInput);
//        mPlaceEditText = (EditText) findViewById(R.id.placeInput);
//        mWeatherEditText = (EditText) findViewById(R.id.weatherInput);
//
//        mSubmitButton = (Button) findViewById(R.id.submit);

            mSubmitButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
//                    String nameLowerCase = mNameEditText.getText().toString();
//                    String name = nameLowerCase.substring(0,1).toUpperCase() + nameLowerCase.substring(1);
//                    String place = mPlaceEditText.getText().toString();
//                    String weather = mWeatherEditText.getText().toString();
                    String name = mNameEditText.getText().toString();
                    String place = mPlaceEditText.getText().toString();
                    String verb = mVerbEditText.getText().toString();
                    String verb2 = mVerbEditText2.getText().toString();
                    String weather = mWeatherEditText.getText().toString();
                    String adjective = mAdjectiveEditText.getText().toString();
                    String animal = mAnimalEditText.getText().toString();


                    Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("place", place);
                    intent.putExtra("weather", weather);
                    intent.putExtra("verb", verb);
                    intent.putExtra("verb2", verb2);
                    intent.putExtra("adjective", adjective);
                    intent.putExtra("animal", animal);
                    startActivity(intent);
                }
            });
    }
}
