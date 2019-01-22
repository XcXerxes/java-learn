package learn;

/**
 * 内存中 栈，堆的使用说明
 */

public class TestStack {
    // 属性
    int id;
    int age;
    String sname;
    Computer comp;

    // 方法
    public void study() {
        System.out.println("我在认真学习！！：" + comp.brand);
    }
    public void play() {
        System.out.println("我在玩游戏！！");
    }

    // 构造方法， 用于创建这个类的对象，无参的构造方法由系统自动创建

    public TestStack() {

    }

    // 程序的执行入口，必须要有
    // javac TestStack.java

    public static void main(String[] args) {
        TestStack ts = new TestStack();
        ts.id = 1001;
        ts.sname = "小明";
        ts.age = 18;

        Computer c1 = new Computer();
        c1.brand = "联想";
        ts.comp = c1;

        ts.play();
        ts.study();
    }
}

class Computer{
    String brand = "我是谁";
}