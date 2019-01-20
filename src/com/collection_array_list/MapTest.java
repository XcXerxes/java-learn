package com.collection_array_list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    /**
     * 用于承装 学生类型对象
     * @param
     */
    public Map<String, Student> students;

    /**
     * 构造器初始化 students 属性
     * @param
     */
    public MapTest() {
        this.students = new HashMap<String, Student>();
    }

    /**
     * 测试添加：输入学生id, 判定是否被占用
     * 若没有，则输入姓名。创建新学生对象，
     * 添加到students 中
     * @param
     */
    public void testPut() {
        // 创建一个 Scanner
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID:");
            String ID = input.next();
            // 判定id 是否被占用
            Student st = students.get(ID);
            if(st == null) {
                // 提示输入学生姓名
                System.out.println("请输入姓名：");
                String name = input.next();

                // 创建新的学生对象
                Student newStudent = new Student(ID, name);

                // 通过调用 students的 put 方法 添加 id 映射
                students.put(ID, newStudent);
                System.out.println("添加成功:" + students.get(ID).name);
                i++;
            } else  {
                System.out.println("该学生ID 已被占用");
                continue;
            }
        }
    }

    /**
     * 测试Map 的 keySet方法
     * @param
     */
    public void testKeySet() {
        // 通过keySet 方法，返回 Map 中的所有 "健" 的 Set 集合
        Set<String> keySet = students.keySet();
        // 取得students的容量
        System.out.println("总共有:" + keySet.size()+ "个学生");

        // 遍历keySet ,取得每一个健。再调用 get方法取得 健对应的 value
        for (String stuId: keySet) {
            Student st = students.get(stuId);
            if(st!=null) {
                System.out.println("学生：" + st.name);
            }
        }
    }

    /**
     * 测试删除Map 中的映射
     * @param
     */
    public void testRemove() {
        // 获取键盘待删除学生的ID 字符串
        Scanner input = new Scanner(System.in);
        while (true) {
            // 输入待删除的学生Id
            System.out.println("请输入要删除的学生的ID：");
            String ID = input.next();
            // 判断该Id 是否是对象学生的对象
            Student st = students.get(ID);
            if(st == null) {
                System.out.println("该ID 不存在");
                continue;
            }
            students.remove(ID);
            System.out.println("成功删除");
            break;
        }

    }

    /**
     * 通过 entrySet 方法来遍历Map
     * @param
     */

    public void testEntrySet() {
        // 通过 entrySet 方法，返回Map 中的映射
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> entry: entrySet) {
            System.out.println("取得健：" + entry.getKey());
            System.out.println("取得值:" + entry.getValue().name);
        }
    }

    /**
     * 利用put 修改
     * @param
     */
    public void testModify() {
        // 提示输入要修改的学生id
        System.out.println("请输入需要修改学生的id:");
        Scanner input = new Scanner(System.in);
        while (true) {
            String stuId = input.next();
            Student student = students.get(stuId);
            if(student == null) {
                System.out.println("该Id不存在");
                continue;
            }
            System.out.println("当前该学生的ID，所对应的名字为：" + student.name);

            // 提示输入新的学生姓名
            System.out.println("请输入新的学生姓名：");
            String name = input.next();
            Student newStudent = new Student(stuId, name);
            students.put(stuId, newStudent);
            System.out.println("修改成功");
            break;
        }
    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
        mt.testRemove();
        mt.testEntrySet();
    }
}
