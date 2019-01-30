package src.src.learn.collection;

import java.util.Arrays;

/**
 * 自定义实现 Map 的功能
 * Map 存放键值对， 根据键对象查找值对象
 */

public class MyMap {
    SxtEntry[] arr = new SxtEntry[990];
    int size;
    public void put(Object key, Object value) {
        SxtEntry e = new SxtEntry(key, value);
        // 解决重复键的处理
        for(int i=0; i< size; i++) {
            if(arr[i].key.equals(key)) {
                arr[i].value = value;
                return;
            }
        }
        arr[size++] = e;
    }
    public Object get(Object key) {
        for(int i=0; i< size; i++) {
            if(arr[i].key.equals(key)) {
                return arr[i].value;
            }
        }
        return null;
    }
    public boolean containsKey(Object key) {
        for(int i=0; i< size; i++) {
            if(arr[i].key.equals(key)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        myMap.put("name", "leo");
        myMap.put("ccc", "antony");
        myMap.put("name", "Lee");
        String str = (String) myMap.get("ccc");
        System.out.println(myMap.get("name"));
        System.out.println(str);
    }
}

class SxtEntry{
    Object key;
    Object value;

    public SxtEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
