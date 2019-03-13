package src.src.learn.sortUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1、binarySearch
 * 2 sort
 * 3 reverse
 * 4 shuffle
 */

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        // test(list);

        // 模拟斗地主
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        // 洗牌
        Collections.shuffle(list);

        // 依次发牌
        List<Integer> p1 = new ArrayList<Integer>();
        List<Integer> p2 = new ArrayList<Integer>();
        List<Integer> p3 = new ArrayList<Integer>();
        for (int i = 0; i < 51; i+=3) {
            p1.add(list.get(i));
            p2.add(list.get(i+1));
            p3.add(list.get(i + 2));
        }
        System.out.println("第一个人：" + p1);
        System.out.println("第二个人：" + p2);
        System.out.println("第三个人：" + p3);

    }

    // 反转
    public static void test(List list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("反转之后" + list);
    }
}
