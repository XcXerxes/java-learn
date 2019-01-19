package example;

public class Initail {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 10;
        dog.name = "xiaoming";
        dog.eat();
        Dog dog2 = new Dog();
        dog2.age = 10;
        if (dog == dog2) {
            System.out.println("两个对象是相同的");
        } else {
            System.out.println("两个对象是不同的");
        }

        if (dog.equals(dog2)) {
            System.out.println("两个对象是相同的");
        } else {
            System.out.println("两个对象是不同的");
        }
    }
}
