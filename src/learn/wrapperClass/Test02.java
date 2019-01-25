package learn.wrapperClass;

/**
 * 测试自动装箱和拆箱
 */

public class Test02 {
    public static void main(String[] args) {
        // Integer a = new Integer(1000);
        Integer a = 1000; // jdk5.0 之后 自动装箱：编译器帮助我们自动改进代码： Integer a = new Integer(1000);

        int b = new Integer(1500); // 编译器帮助我们自动改进代码： int b = new Integer(1000).intValue();

        int c = b; // 编译器帮助我们自动改进代码: b.intValue()

        Integer d3 = -128; // [-128, 127] 之间的数， 仍然当作基本的数据类型来处理
        Integer d4 = -128;
        System.out.println(d3 == d4);
        System.out.println(d3.equals(d4));
        System.out.println(c);
    }
}
