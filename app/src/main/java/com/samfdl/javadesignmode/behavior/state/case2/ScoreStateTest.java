package com.samfdl.javadesignmode.behavior.state.case2;

public class ScoreStateTest {
    public static void main() {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}