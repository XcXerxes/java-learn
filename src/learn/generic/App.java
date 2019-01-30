package src.src.learn.generic;

public class App {
    public static void main(String[] args) {
        // 存入整数 int --> Inter --> Object
        Student student = new Student(80, 90);

        Student<String, Integer>student1 = new Student<String, Integer>();
        // 安心 类型检查
        student1.setJavase("优秀");
        // 安全 类型转换
        student1.setOracle(432);

    }
}
