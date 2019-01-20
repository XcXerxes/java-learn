package com.collection_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * 备选课程类
 */

public class ListTest {
    /**
     * 用于存放备选课程的 List
     */
    public List coursesToSelect;

    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    /**
     * 往 coursesToSelect 中添加课程
     */
    public void testAdd() {
        // 创建一个课程对象， 并通过调用 add 方法，添加到 coursesToSelect
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加课程：" + temp.getId() + "=====" + temp.getName());

        // 创建课程对象
        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0, cr2);
        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("添加课程：" + temp2.getId() + "=====" + temp2.getName());

        // 创建课程对象
        Course cr3 = new Course("3", "test");
        // 如果添加的对象的位置长度(index)大于 ArrayList 的长度时，会报错 数组下标越界
        // coursesToSelect.add(4, cr3);

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        /*
        * 一次插入一个数组！！
        * **/
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course) coursesToSelect.get(2);
        Course temp4 = (Course) coursesToSelect.get(3);
        System.out.println("添加课程：" + temp3.getId() + "=====" + temp3.getName());
        System.out.println("添加课程：" + temp4.getId() + "=====" + temp4.getName());


        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        coursesToSelect.addAll(2, Arrays.asList(course2));

        Course temp5 = (Course) coursesToSelect.get(2);
        Course temp6 = (Course) coursesToSelect.get(3);
        System.out.println("添加课程：" + temp5.getId() + "=====" + temp5.getName());
        System.out.println("添加课程：" + temp6.getId() + "=====" + temp6.getName());

    }

    /**
     * 取得List 中的元素的方法
     * for循环
     */

    public void testGet() {
        int size = coursesToSelect.size();
        System.out.println("通过循环访问");
        for (int i = 0; i < size; i++) {
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println("课程：" + cr.getId() + "======" + cr.getName());
        }
    }

    /***
     * 通过迭代器来遍历List
     * @param
     */
    public void testIterator() {
        Iterator it = coursesToSelect.iterator();
        System.out.println("通过迭代器访问");
        while (it.hasNext()) {
            Course cr = (Course) it.next();
            System.out.println("课程：" + cr.getId() + "======" + cr.getName());

        }
    }

    /**
     * 使用foreach 遍历 List
     * @param
     */
    public void testForEach() {
        System.out.println("通过forEach访问");
        for (Object obj: coursesToSelect) {
            Course cr = (Course) obj;
            System.out.println("课程：" + cr.getId() + "======" + cr.getName());

        }
    }

    /**
     * 修改List 中的元素
     * @param
     */
    public void testModify() {
        System.out.println("修改List中的元素");
        coursesToSelect.set(4, new Course("7", "毛概"));
    }

    /**
     * 删除List 中的元素
     * @param
     */

    public void testRemove() {
        System.out.println("删除List中的元素: 第四个");
        Course cr = (Course) coursesToSelect.get(4);
        System.out.println("课程：" + cr.getId() + "======" + cr.getName());
//        coursesToSelect.remove(cr);
        // 删除指定位置
        // coursesToSelect.remove(4);
        Course[] courses = {(Course) coursesToSelect.get(4), (Course) coursesToSelect.get(5)};
        coursesToSelect.removeAll(Arrays.asList(courses));
        System.out.println("删除了课程");
        testForEach();
    }

    /**
     * 往 List 中添加奇怪的东西
     * @param
     */

    public void testType() {
        System.out.println("往List 中添加字符串");
        coursesToSelect.add("往List 中添加一些奇怪的东西");
    }



    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testType();
        lt.testForEach();
//        lt.testGet();
//        lt.testIterator();
//        lt.testForEach();
//        lt.testModify();
//        lt.testForEach();
//        lt.testRemove();
    }
}
