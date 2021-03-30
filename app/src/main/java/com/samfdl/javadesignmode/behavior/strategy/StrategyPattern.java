package com.samfdl.javadesignmode.behavior.strategy;

// 策略模式，解决ifelse过多问题。提前封装各种算法，以备以后调用。
public class StrategyPattern {
    public static void main() {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}