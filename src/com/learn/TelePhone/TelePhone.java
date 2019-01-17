package com.learn.TelePhone;

public class TelePhone {
    public TelePhone() {
        System.out.println("无参数的构造方法");
    }

    private  float screen;
    float cpu;
    float menu;


    public float getScreen() {
        return screen;
    }

    public void setScreen(float newScreen) {
        this.sendMessage();
        screen = newScreen;
    }

    public void sendMessage() {
        System.out.println("TelePhone 可以发送消息了");
    }
    public TelePhone(float newScreen, float newCpu) {
        if (newScreen < 3.5f) {
            screen = 3.5f;
            System.out.println("您输入的参数有问题");
        } else  {
            screen = newScreen;
        }
        cpu = newCpu;
        System.out.println("有参数的构造方法执行了");
    }
    // 初始化代码块
    {
        menu = 200.5f;
    }

    //

}
