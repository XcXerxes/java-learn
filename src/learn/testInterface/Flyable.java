package learn.testInterface;

public interface Flyable {
    int MAX_SPEED = 11000;
    int MIN_HEIGHT = 1;
    void fly();
}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("飞机起飞");
    }
}

class Men implements Flyable{
    @Override
    public void fly() {
        System.out.println("人飞");
    }
}
