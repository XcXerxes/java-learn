package learn.wrapperClass;

/**
 * 测试包装类的基本用法
 */

public class Test01 {
    public static void main(String[] args) {
        Integer i = new Integer(1000);
        System.out.println(Integer.MAX_VALUE);
        // 转成整数
        Integer i2 = Integer.parseInt("234");
        Integer i3 = new Integer("333");
        System.out.println(i2.intValue());


    }
}
