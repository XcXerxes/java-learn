package com.exception_demo;

public class TestException {
    public static void main(String[] args) {
        // int i = 1/0;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Computer c = null; // 空指针异常， 对象是空的时候 调用它的 方法。
        c.start();
    }
}

/**
 * 空指针异常
 */

class Computer{
    void start() {
        System.out.println("计算机启动了");
    }
}
