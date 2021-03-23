package com.samfdl.javadesignmode.behavior.state.case1;

public class StatePatternClient {
    public static void main() {
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}