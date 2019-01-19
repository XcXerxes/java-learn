package com.object;

public class Initail {
    public static void main(String[] args) {
        /***
         *
         * 多态：
         * 引用多态：
         * 1、父类的引用可以指向本类的对象
         * 2、父类的引用可以指向子类的对象
         *
         */
        Animal obj1 = new Animal(); // 父类的引用 指向 本类
        Animal obj2 = new Dog(); // 父类引用指向 子类
        Animal obj3 = new Cat();
        // Dog obj3 = new Animal(); 错误的

        /**
         *
         * 方法多态：
         * 1、使用本类创建的对象，调用的是本类的方法
         * 2、 使用子类创建的对象，调用的方法是子类重写的方法 或者 继承的方法（即还是会调用本类的方法）
         */
        obj1.eat(); // 使用本类创建的对象，调用的是本类的方法
        obj2.eat();  // 使用子类创建的对象，调用的方法是子类重写的方法 或者 继承的方法
        obj3.eat();

        /*
        * 引用类型转换
        * */
        Dog dog = new Dog();
        Animal animal = dog; // 向上类型转换 自动类型转换

        if(animal instanceof Dog) {
            Dog dog2 = (Dog)animal;
        } else  {
            System.out.println("无法进行类型转换");
        }

        if(animal instanceof Cat) {
            Cat cat = (Cat)animal;// 1、编译时 Cat 2、运行时 Dog类型
        } else {
            System.out.println("无法进行类型转换");
        }
    }
}
