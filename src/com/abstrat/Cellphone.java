package com.abstrat;

public class Cellphone extends Telphone {
    @Override
    public void call() {
        System.out.println("通过键盘来打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("通过键盘发短信");
    }
}
