package learn.collection;

import java.util.Arrays;

/**
 * 模拟实现JDK 中提供的 ArrayList
 */

public class MyArrayList {
    private Object[] value;
    private int size;

    public MyArrayList() {
        this(6);
    }
    public MyArrayList(int size) {
        value = new Object[size];

    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object currentObj) {
        if(currentObj == null) {
            return -1;
        }
        for (int i = 0; i < value.length; i++) {
            if(currentObj == value[i]) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexof(Object currentObj) {
        if(currentObj == null) {
            return -1;
        }
        for (int i = value.length - 1; i >= 0; i--) {
            if(value[i] == currentObj) {
                return i;
            }
        }
        return -1;
    }

    public Object set(int index, Object object) {
        rangeCheck(index);
        Object oldObject =value[index];
        value[index] = object;
        return oldObject;
    }

    public void rangeCheck(int index) {
        if (index < 0 || index > size - 1) {
            try{
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void add(Object obj) {
        value[size] = obj;
        size++;
        if(size >= value.length) {
            // 扩容容器
            int newCapacity = value.length * 2;
            Object[] newList = new Object[newCapacity];
            // 拷贝旧容器的东西放入新容器
            // System.arraycopy();
            int i = 0;
            while (i < value.length) {
                newList[i] = value[i];
                i++;
            }
            value = newList;
        }
    }

    public Object get(int index) throws Exception {
        rangeCheck(index);
        return value[index];
    }

    public static void main(String[] args) throws Exception {
        MyArrayList arrayList = new MyArrayList(2);
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
    }
}

class Human{
    public Human(String name) {

    }
}
