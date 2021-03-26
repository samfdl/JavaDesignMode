package com.samfdl.javadesignmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samfdl.javadesignmode.behavior.chainOfResponsibility.teacher.LeaveApprovalTest;
import com.samfdl.javadesignmode.behavior.command.CommandPattern;

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
//        ChainOfResponsibilityPattern.main();
//        LeaveApprovalTest.main();
        CommandPattern.main();
    }
}