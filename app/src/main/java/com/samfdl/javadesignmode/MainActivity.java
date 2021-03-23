package com.samfdl.javadesignmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samfdl.javadesignmode.create.singleton.case1.SingletonLazy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SingletonLazy.main();
    }
}