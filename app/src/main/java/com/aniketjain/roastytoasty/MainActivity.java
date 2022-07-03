package com.aniketjain.roastytoasty;

import android.os.Bundle;
import android.view.Gravity;

import androidx.appcompat.app.AppCompatActivity;

import com.vdx.designertoast.DesignerToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toasty.normal(this, "Hello World, My name is aniket.");
//        DesignerToast.Success(this, "Hello World, my name is aniket jain.", Gravity.CENTER, 0);
    }
}