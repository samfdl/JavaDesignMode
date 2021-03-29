package com.samfdl.javadesignmode.behavior.chainOfResponsibility.case1;

// 责任链模式，审批流程、拦截器、过滤器的实现方式
public class ChainOfResponsibilityPattern {
    public static void main() {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}