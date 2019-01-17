package com.learn.scanners;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        // 扫描对象，用来扫描系统的输入
        Scanner input = new Scanner(System.in);
        System.out.println("品牌1：");

        /***
         *  next 方法： 出现空格就会中断
         *  nextLine(): 只要是在一行输入，都会被打印出来
         *
         */

        // String brand1 = input.next();
        String brand1 = input.nextLine();
        System.out.println(brand1);


        /**
         * 难点  录入char类型
         */
        System.out.print("性别：");
        // 获取用户输入字符串的第一个字符
        char sex = input.next().charAt(0);
        System.out.println("性别："+ sex);



        /**
         * 浮点数
         * */
//        // 需要用户手动输入圆的半径
//        System.out.println("请输入圆半径：");
//        // 读取用户输入的下一个double 类型数据
//        double radius = input.nextDouble();
//        double area = 3.14 * radius * radius;
//        System.out.println("圆面积为：" + area);
    }
}
