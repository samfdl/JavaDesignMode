package com.samfdl.javadesignmode.behavior.mediator;

// 中介者模式，微信群聊的实现方式
public class MediatorPattern {
    public static void main() {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}