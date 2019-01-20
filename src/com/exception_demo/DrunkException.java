package com.exception_demo;

/**
 * 定义自定义异常
 */
public class DrunkException extends Exception {
    public DrunkException(String message) {
        super(message);
    }
}
