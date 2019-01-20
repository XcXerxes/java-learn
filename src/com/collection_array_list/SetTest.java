package com.collection_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    public List<Course> coursesToSelect;
    public SetTest() {
        coursesToSelect = new ArrayList<Course>();
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
//        System.out.println("添加课程：" + temp3.getId() + "=====" + temp3.getName());
//        System.out.println("添加课程：" + temp4.getId() + "=====" + temp4.getName());


        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        coursesToSelect.addAll(2, Arrays.asList(course2));

        Course temp5 = (Course) coursesToSelect.get(2);
        Course temp6 = (Course) coursesToSelect.get(3);
//        System.out.println("添加课程：" + temp5.getId() + "=====" + temp5.getName());
//        System.out.println("添加课程：" + temp6.getId() + "=====" + temp6.getName());

    }

    /**
     * 循环遍历
     * @param
     */
    public void testForeach() {
        for (Course cr: coursesToSelect) {
            System.out.println("课程内容为======" + cr.getId()+ "====" + cr.getName());
        }
    }

    public void testForEachForSet(Student st) {
        // 打印输出，学生所选的课程
        System.out.println("学生选择的课程数量为====" + st.courses.size());
        for (Course cr: st.courses) {
            System.out.println("选择了课程为:" + cr.getId()+"====="+cr.getName());
        }
    }

    /**
     * 测试 List 的 contains 方法
     * @param
     */
    public void testListContains() {
        Course course = coursesToSelect.get(0);
        // 打印输出是否包含 course 对象
        System.out.println("输出course的名称：" + course.getName());
        System.out.println("备选课程中是否包含课程：" + course.getName() + "," + coursesToSelect.contains(course));
        if (coursesToSelect.contains(course)) {
            System.out.println("备选课程的索引位置为：" + coursesToSelect.indexOf(course));
        }
    }

    public static void main(String[] args){
        SetTest st = new SetTest();
        st.testAdd();
        st.testListContains();
//        st.testForeach();
//        // 创建一个学生对象
//        Student student = new Student("1", "小明");
//        System.out.println("欢迎学生：" + student.name + "来选课:");
//
//        // 创建一个 Scanner对象
//        Scanner input = new Scanner(System.in);
//
//        for (int i = 0; i<3; i++) {
//            System.out.println("请输入课程id");
//            String courseId = input.next();
//            for(Course cr: st.coursesToSelect) {
//                if(cr.getId().equals(courseId)) {
//                    student.courses.add(cr);
//                }
//            }
//        }
//        st.testForEachForSet(student);
    }
}
