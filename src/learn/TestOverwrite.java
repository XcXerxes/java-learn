package learn;

public class TestOverwrite {
    String name;
    int age;

    public TestOverwrite(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", 年龄：" + age;
    }

    public static void main(String[] args) {
        TestOverwrite tow = new TestOverwrite("leo", 20);
        System.out.println(tow.toString());
    }
}
