package com.interfaceExp;

public class Initail {
    public static void main(){
        Telephone tel1 = new Smartphone();
        tel1.call();
        tel1.sendMessage();

        IPlayGame ip1 = new Smartphone();
        ip1.playGame();

        IPlayGame ip2 = new Psp();
        ip2.playGame();

        /**
         * 使用匿名内部类的 方式
         */

        IPlayGame ip3 = new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类的 方式");
            }
        };
        ip3.playGame();
    }
}
