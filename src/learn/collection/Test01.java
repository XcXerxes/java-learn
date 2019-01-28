package learn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        Collection c;
        List list = new ArrayList();
        // ArrayList: 底层实现是数组， 所以查询快， 修改和插入效率慢
        // LinkedList: 底层实现是链表，查询效率慢， 但修改和插入效率快
        // Vector: 线程安全的，效率低


        list.add("aaa");
        list.add(new Date());
        list.add(1234);

        // 内容的长度
        System.out.println(list.size());
        // 是否为空
        System.out.println(list.isEmpty());
        // 移除对象
//        list.remove(new Date());   // hashCode 的原因
//        System.out.println(list.size());

        List list2 = new ArrayList();
        list2.add("bbb");
        list2.add("ccc");

        list.add(list2);
        System.out.println(list.size());

        // 跟顺序相关的操作
        // 根据索引查找 obj
        String str = (String) list.get(0);
        System.out.println(str);
        list.set(1, "fff");

    }
}
