package learn;

/**
 * 递归 （自己调自己）
 */

public class TestRecursion {
    static int count = 0;
    static void a() {
        System.out.println("a");
        count++;
        if(count < 10) {
            a();
        }else {
            return;
        }
    }

    /**
     * 阶乘
     * @param n
     * @return
     */
    static long factorial(int n) {
        if(n == 1) {
            return 1;
        } else  {
            return n * factorial(n-1);
        }
    }
    static void b() {
        System.out.println("b");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        a();
        // 开始时间
        long d1 = System.currentTimeMillis();
        System.out.println(factorial(10));
        // 结束时间
        long d2 = System.currentTimeMillis();
        System.out.println("递归费时==========" + (d2 - d1));
    }
}
