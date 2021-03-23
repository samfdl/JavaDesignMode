package com.samfdl.javadesignmode.behavior.state.thread;

public class ThreadStateTest {
    public static void main() {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}