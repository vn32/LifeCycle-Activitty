package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivityLog";
    boolean LoggedIn=true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onStart() {
        Log.d(TAG, "onStart");
        super.onStart();
//        askPermission();
        //checkLoginStatus();
        checkWeatherStatus();
    }

    @Override
    public void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
        //to pause video like utube add method here
    }

    @Override
    public void onStop() {
        Log.d(TAG, "onStop");
        super.onStop();
        LoggedIn=false;

    }

    @Override
    public void onRestart() {
        Log.d(TAG, "onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }
//    void askPermission() {
//        Log.d(TAG, "askPermission");
//
//    }
//    void checkLoginStatus() {
//        if(LoggedIn){
//            Log.d(TAG, "LoggedIn");
//        } else {
//            Log.d(TAG, "LoggedOut");
//        }
//    }
    void checkWeatherStatus() {
        Log.d(TAG, "checkweatherstatus");

    }


}
