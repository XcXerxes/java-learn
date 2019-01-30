package src.src.learn.collection;

/**
 * 自定义Map 的升级版
 * 1、提高查询的效率
 * Map的底层结构  数组+链表
 */

public class MyMap002 {
    SxtEntry[] arr = new SxtEntry[990];
    int size;
    public void put(Object key, Object value) {
        SxtEntry e = new SxtEntry(key, value);
        int a = key.hashCode()%999;
        arr[a] = e;
    }

    public Object get(Object key) {
        return arr[key.hashCode()%999];
    }

    public static void main(String[] args) {

    }
}

