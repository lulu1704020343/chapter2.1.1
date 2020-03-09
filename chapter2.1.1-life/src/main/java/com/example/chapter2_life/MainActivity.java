package com.example.chapter2_life;

import android.net.Uri;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG=(getPackageName()+"\\"+getLocalClassName()).toString();
        Log.d(TAG,"onCreate：赖红+学号");
    }
    //CTRL+O
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"onSaveInstanceState：赖红+学号");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"onRestoreInstanceState：赖红+学号");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart：赖红+学号");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart：赖红+学号");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop：赖红+学号");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy：赖红+学号");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume：赖红+学号");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause：赖红+学号");
    }

}
