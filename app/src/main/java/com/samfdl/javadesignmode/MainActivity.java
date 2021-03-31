package com.samfdl.javadesignmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.samfdl.javadesignmode.behavior.command.cook.CookingCommand;
import com.samfdl.javadesignmode.behavior.iterator.IteratorPattern;
import com.samfdl.javadesignmode.behavior.mediator.Mediator;
import com.samfdl.javadesignmode.behavior.mediator.MediatorPattern;
import com.samfdl.javadesignmode.behavior.strategy.StrategyPattern;
import com.samfdl.javadesignmode.behavior.visitor.VisitorPattern;
import com.samfdl.javadesignmode.structure.composite.CompositePattern;
import com.samfdl.javadesignmode.structure.facade.FacadePattern;
import com.samfdl.javadesignmode.structure.proxy.ProxyTest;

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
//        CommandPattern.main();
//        CookingCommand.main();
//        CompositePattern.main();
//        ProxyTest.main();
//        MediatorPattern.main();
//        VisitorPattern.main();
//        IteratorPattern.main();
//        StrategyPattern.main();
        FacadePattern.main();
    }
}