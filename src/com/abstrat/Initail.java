package com.abstrat;

public class Initail {
    public static void main(String[] args) {
        Telphone tel1 = new Cellphone();
        tel1.call();
        tel1.sendMessage();

        Telphone tel2 = new Smartphone();
        tel2.call();
        tel2.sendMessage();
    }
}
