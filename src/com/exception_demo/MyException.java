package com.exception_demo;

/**
 * 自定义异常 类
 */

public class MyException extends Exception {
    public MyException(){
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

class TestMyException{
    void test() throws MyException {

    }
    public static void main(String[] args) {
       TestMyException tme = new TestMyException();
        try {
            tme.test();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
