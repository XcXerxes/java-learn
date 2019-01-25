package learn.abstractClass;

public abstract class Animal {
    public abstract void run();
    public void breath(){

    };
}

class Cat extends Animal{

    @Override
    public void run() {
        System.out.println("小猫");
    }
}

class Dog extends Animal{

    @Override
    public void run() {
        System.out.println("小狗");
    }
}
