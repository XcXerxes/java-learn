package com.collection_array_list;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    /**
     * 声明带有泛型  ----- Course 的 List 类型属性
     */
    public List<Course> courses;

    /**
     *
     * @param
     */
    public TestGeneric() {
        this.courses = new ArrayList<Course>();
    }

    /**
     * 测试添加
     *
     */

    public void testAdd() {
        Course cr1 = new Course("1", "大学语文");
        courses.add(cr1);
        // 泛型集合中， 不能添加泛型规定的类型及其子类型 以外的引用对象， 否则就会报错!!!
        // courses.add("能否添加一些奇怪的东西呢");
        Course cr2 = new Course("2", "Java基础");
        courses.add(cr2);
    }

    /**
     * 测试循环遍历
     * @param
     */

    public void testForEach() {
        for (Course course: courses) {
            System.out.println("课程类型为：" + course.getId()+ "====="+ course.getName());
        }
    }

    /**
     * 测试泛型集合可以添加泛型的子类型的对象实例
     * @param
     */
    public void testChild() {
        ChildCourse ccr = new ChildCourse("3", "我是子类型的课程对象实例");
        courses.add(ccr);
    }

    /**
     * 泛型不能使用基础类型, 可以使用基础类型的包装类
     * @param
     */
    public void testBasicType() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本类型的包装类的输出结果：" + list.get(0));
    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.testChild();
        tg.testForEach();
        tg.testBasicType();
    }
}
