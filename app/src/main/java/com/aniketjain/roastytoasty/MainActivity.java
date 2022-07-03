package com.aniketjain.roastytoasty;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toasty.normal(this, "Hello World, My name is aniket.");
        Toasty.custom(this, "Hello World", R.drawable.ic_launcher_background, "#ff9933", 300, 300);
    }
}