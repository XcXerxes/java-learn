package example;

public class Animal {
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int age = 20;
    public String name;

    public void eat() {
        System.out.println("动物具有吃东西的能力");
    }
    public Animal(int age) {
        this.age = age;
    }
}
