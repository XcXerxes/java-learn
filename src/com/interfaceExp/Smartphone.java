package com.interfaceExp;

public class Smartphone extends Telephone implements IPlayGame {
    @Override
    public void call() {
        System.out.println("call");
    }

    @Override
    public void sendMessage() {
        System.out.println("sendMessage");
    }

    @Override
    public void playGame() {

    }
}
