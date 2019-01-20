package com.collection_array_list;

import java.util.*;

public class SortTest {

    /**
     * Inter List 类型进行排序
     * @param
     */
    public void testSortInterger() {
        List<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for (int i = 0; i<10; i++) {
            do {
                k = random.nextInt(100);
            } while (integerList.contains(k));
                integerList.add(k);
                System.out.println("成功添加函数："+ k);
        }
        System.out.println("---------");
        for (Integer integer:integerList) {
            System.out.println("元素：" + integer);
        }
        Collections.sort(integerList);
        System.out.println("排序后---------");
        for (Integer integer:integerList) {
            System.out.println("元素：" + integer);
        }

    }


    /**
     * 对 String 泛型的List
     * @param
     */
    public void testSortString() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("microsoft");
        stringList.add("Google");
        stringList.add("Apple");
        Random random = new Random();
        System.out.println("排序前---------");
        for (String str: stringList) {
            System.out.println("元素：" + str);
        }
        Collections.sort(stringList);
        System.out.println("排序后---------");
        for (String str: stringList) {
            System.out.println("元素：" + str);
        }
    }

    /**
     * 对其他类型 泛型进行排序
     * @param
     */
    public void testSortObj() {
        List<Student> stList = new ArrayList<Student>();
        Random random = new Random();
        stList.add(new Student(random.nextInt(1000) + "", "Angela"));
        stList.add(new Student(random.nextInt(1000) + "", "Mike"));
        stList.add(new Student(random.nextInt(1000) + "", "Lucy"));
        System.out.println("--------排序前");
        for (Student st: stList) {
            System.out.println("学生的姓名为：" + st.name+ st.id);
        }
        Collections.sort(stList);
        System.out.println("--------排序后");
        for (Student st: stList) {
            System.out.println("学生的姓名为：" + st.name + st.id);
        }

        System.out.println("-----------按照姓名排序后---------");
        Collections.sort(stList, new StudentComparator());
        for (Student st: stList) {
            System.out.println("学生的姓名为：" + st.name + st.id);
        }
    }
    public static void main(String[] args) {
        SortTest st = new SortTest();
//        st.testSortInterger();
//        st.testSortString();
        st.testSortObj();
    }
}
