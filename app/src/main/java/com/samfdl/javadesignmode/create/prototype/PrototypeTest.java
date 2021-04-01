package com.samfdl.javadesignmode.create.prototype;

//原型模式的测试类
public class PrototypeTest {
    public static void main() throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}