package learn;

/**
 * super()方法， 不管写与不写， 子类对象的构造方法都会默认调用 super() 方法
 */

public class TestSuper {
    public static void main(String[] args) {
        System.out.println("开始创建一个 Childclass 对象");
    }
}

class FatherClass{
    public FatherClass() {
        /**
         * super()方法， 不管写与不写， 子类对象的构造方法都会默认调用 super() 方法
         */
        super();
        System.out.println("创建FatherClass");
    }
}

class ChildClass extends FatherClass{
    public ChildClass() {
        /**
         * super()方法， 不管写与不写， 子类对象的构造方法都会默认调用 super() 方法
         */
        super();
        System.out.println("创建ChildClass");
    }
}
