package com.abstrat;

public class Smartphone extends Telphone {
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("语音发短信");
    }
}
