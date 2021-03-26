package com.samfdl.javadesignmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samfdl.javadesignmode.behavior.chainOfResponsibility.ChainOfResponsibilityPattern;
import com.samfdl.javadesignmode.behavior.memento.MementoPattern;
import com.samfdl.javadesignmode.behavior.state.score.ScoreStateTest;
import com.samfdl.javadesignmode.behavior.state.thread.ThreadStateTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SingletonLazy.main();
//        StatePatternClient.main();
//        ScoreStateTest.main();
//        ThreadStateTest.main();
//        MementoPattern.main();
        ChainOfResponsibilityPattern.main();
    }
}