package com.manoj.activitylifecycle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast("OnCreate is Called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        toast("OnStart is Called!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        toast("OnResume is Called!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        toast("OnPause is Called!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        toast("OnStop is called!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        toast("OnDestroy is Called!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        toast("OnRestart is Called!!");

    }

    public void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }



}