package src.src.learn.iterator;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List list  = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("333");

        for (int i =0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 迭代器 用于 Set
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);

        // while 循环迭代
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            int num = (int) iterator.next();
            System.out.println(num);
        }

        // for 循环迭代
        for (Iterator iter = set.iterator(); iter.hasNext();) {
            int num1 = (int) iter.next();
            System.out.println(num1);
        }

    }
}
