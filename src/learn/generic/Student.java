package src.src.learn.generic;

/**
 * 泛型类：声明时使用泛型
 * 字母：
 * T type
 * K, v 分别代表 Key Value
 * E 代表 Element
 *
 * 泛型 只能使用 引用类型
 * 泛型类中申明时， 不能使用在静态属性或者静态方法中！
 */

public class Student<T1, T2> {
    private T1 javase;
    private T2 oracle;

    public Student(T1 javase, T2 oracle) {
        this.javase = javase;
        this.oracle = oracle;
    }

    public T1 getJavase() {
        return javase;
    }

    public void setJavase(T1 javase) {
        this.javase = javase;
    }

    public T2 getOracle() {
        return oracle;
    }

    public void setOracle(T2 oracle) {
        this.oracle = oracle;
    }

    public Student() {

    }

    public static void main(String[] args) {

    }
}
