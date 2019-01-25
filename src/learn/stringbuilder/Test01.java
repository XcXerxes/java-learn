package learn.stringbuilder;

/**
 * String: 不可变字符序列
 *
 * 测试可变字符序列 StringBuilder(线程不安全， 效率高), StringBuffer(线程安全， 效率低)
 */

public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();  // 默认系统会初始长度为16
        StringBuilder sb1 = new StringBuilder(32); // 初始化长度为32
        StringBuilder sb2 = new StringBuilder("abcd"); // 字符长度为 20（默认16 + 4）

        sb2.append("efg");
        sb2.append(true);

        // 方法链式调用
        sb2.append("123").append("456").append(789);
        StringBuilder sb4 = sb2.append(10);
        System.out.println(sb2);
        System.out.println(sb4);

        StringBuilder gh = new StringBuilder("a");
        for (int i=0; i < 2; i++) {
            gh.append(i);
        }
        System.out.println(gh);
    }
}
