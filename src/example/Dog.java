package example;

public class Dog extends Animal {
    public Dog(){
        super(20);
    }
    public void eat() {
        System.out.println("年龄：" + age + "狗具有吃东西的能力");
    }
    public void method() {
        System.out.println(super.age);
    }
}
