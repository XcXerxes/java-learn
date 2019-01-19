package example;

import java.util.Objects;

public class Dog extends Animal {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    public int age = 20;
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
