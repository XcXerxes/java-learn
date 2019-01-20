package com.collection_array_list;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 */
public class Student implements Comparable<Student> {
    public String id;
    public String name;
    /**
     * Set 类型中， 添加某个对象，无论添加多少次，
     * 最终只会保留一个该引用对象。
     * 而且Set 可以添加 NUll 对象
     */
    public Set<Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;

        this.courses = new HashSet<Course>();
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
