package src.src.learn.collection;


import java.util.HashMap;

/**
 * 自定义 HashSet
 */
public class MyHashSet {
    HashMap map;
    private static final Object PRESENT = new Object();
    public MyHashSet() {
        map = new HashMap();
    }
    public int size() {
        return map.size();
    }
    public void add(Object o) {
        map.put(o, PRESENT); // set 不可重复的 利用了 map 的键是不能重复的
    }
    public static void main(String[] args) {

    }
}
