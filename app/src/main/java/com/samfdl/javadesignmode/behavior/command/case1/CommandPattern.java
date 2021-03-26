package com.samfdl.javadesignmode.behavior.command.case1;

public class CommandPattern {
    public static void main() {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}