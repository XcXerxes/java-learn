package learn.testInterface;

public interface MyInterface {
    // 接口中只有：常量，抽象方法
    /*pubic static final  接口定义常量时的修饰符，写或不写都存在  */String MAX_GREAD = "BOSS";
    int MAX_SPEED = 120;

    /**
     * 接口中的 方法 必须是公开的！！
     */
    void test01();
    int test02(int a, int b);
}
