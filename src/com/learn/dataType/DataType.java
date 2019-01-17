/**
 *
 * 变量是计算机中一块特定的内存空间
 *
 *数据类型： 变量的类型决定了为它分配多少个字节空间
 *
 * Java中常用的数据类型
 *
 * 整数类型：short, int(常用), long, byte
 * 浮点类： float, double（常用）
 * 非数值：char, Boolean
 * 常用非基本类型：String
 */


package com.learn.dataType;

public class DataType {
    public  static  void main(String[] args) {
        // System.out.println(1.0f - 0.9f);
        System.out.println("某吃货采购清清单");
        System.out.println("----------------");

        /**
         *
         * 自动类型转换
         */
         int num = 90;
         double num1 = num;

        /**
         * 强制类型转换
         * 浮点数类型 转为 整数型 则需要强转换
         */
        double num2 = 90.0;
        int num3 = (int)num2;

        String[] names = new String[5];
    }
}
