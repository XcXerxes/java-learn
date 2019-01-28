package learn.collection;

/**
 * 自己实现一个 ArrayList, 帮助自己更好的理解 ArrayList 的底层结构
 */

public class SxtMyArrayList {
    // 存储对象的 容器数组
    private Object[] elementData;

    /**
     * 容器包含的对象的 长度
     * @param args
     */
    private int size;

    public SxtMyArrayList() {
        this(10);
    }
    public SxtMyArrayList(int intCapacity) {
        if(intCapacity < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else  {
            elementData = new Object[intCapacity];
        }
    }

    public void add(Object obj) {
        // 数组扩容和数据拷贝
        ensureCapacity();
        elementData[size] = obj;
        size++;
    }

    /**
     * 内容的长度
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 内容是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 根据索引获取 对象
     * @param index
     * @return
     */

    public Object get (int index) {
        RangCheck(index);
        return elementData[index];
    }

    /**
     * 删除指定位置的对象
     * @param index
     */
    public void remove(int index) {
        RangCheck(index);
        // 需要拷贝的数组个数
        int numMoved = size - index - 1;
        if(numMoved > 0) {
            System.arraycopy(elementData, index+1, elementData, index, numMoved);
            elementData[--size] = null;
        }
    }

    /**
     * 删除某一个对象
     * @param obj
     */

    public boolean remove(Object obj) {
        for (int i = 0; i<size; i++){
            if(get(i).equals(obj)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void add(int index, Object obj) {
        RangCheck(index);
        ensureCapacity();
        System.arraycopy(elementData, index, elementData, index+1, size - index);
        elementData[index] = obj;
    }

    /**
     * 检查index
     * @param index
     */
    private void RangCheck(int index) {
        if (index >= size ) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void ensureCapacity() {
        // 数组扩容和数据拷贝
        if(size >= elementData.length) {
            Object[] newElementData = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
            elementData = newElementData;
        }
    }


    public static void main(String[] args) {
        SxtMyArrayList list = new SxtMyArrayList(3);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.size());
        list.get(4);

    }
}
