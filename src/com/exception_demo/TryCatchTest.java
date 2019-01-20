package com.exception_demo;

public class TryCatchTest {
    public static void main(String[] args) {
        TryCatchTest tct = new TryCatchTest();
//        int result = tct.test();
//        System.out.println("test()方法，执行完毕！返回值为："+ result);

//        int result2 = tct.test2();
//        System.out.println("test2()执行完毕");
        int result3 = tct.test3();
        System.out.println("test3 执行完毕, 返回值为："+ result3);
    }


    /**
     * divider(除数)
     * result(结果)
     * try-catch 捕获 while 循环
     * 每次循环，divider 减一, result = result + 100/divider
     * 如果：捕获异常，打印输出 "抛出异常类" 返回 -1
     * 否则：返回 result
     * @return
     */

    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result+=100/divider;
            }
            return result;
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常了");
            return -1;
        }
    }

    /**
     * divider(除数)
     * result(结果)
     * try-catch 捕获 while 循环
     * 每次循环，divider 减一, result = result + 100/divider
     * 如果：捕获异常，打印输出 "抛出异常类" 返回 -1
     * 否则：返回 result
     * finally: 打印输出 "finally", 同时打印输出result
     * @return
     */


    public int test2() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result+=100/divider;
            }
            System.out.println(result);
            return result;
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常了");
            return result = 999;
        }finally {
            System.out.println("这是finally");
            System.out.println("我是Result!!,我的值是"+result);
        }
    }

    /**
     * divider(除数)
     * result(结果)
     * try-catch 捕获 while 循环
     * 每次循环，divider 减一, result = result + 100/divider
     * 如果：捕获异常，打印输出 "抛出异常类" 返回 -1
     * 否则：返回 result
     * finally: 打印输出 "finally", 同时打印输出result
     *
     * 最后返回 1111
     * @return
     */


    public int test3() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result+=100/divider;
            }
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("抛出异常了");
        }finally {
            System.out.println("这是finally");
            System.out.println("我是Result!!,我的值是"+result);
        }
        System.out.println("我是test3()");
        return 1111;
    }
}
