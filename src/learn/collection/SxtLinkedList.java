package src.src.learn.collection;

/**
 * 实现一个 双向链表结构
 */

public class SxtLinkedList {
    private LinkedNode first;
    private LinkedNode last;

    private int size;

    public void add(Object obj) {
        if(first == null){
            LinkedNode n = new LinkedNode();
            n.setPrevious(null);
            n.setObj(n);
            n.setNext(null);
            first = n;
            last = n;
        } else  {
            // 直接往 last 节点后增加新的节点
            LinkedNode n = new LinkedNode();
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);

            last.setNext(n);

            last = n;
        }
        size++;
    }

    public static void main(String[] args) {
        SxtLinkedList list = new SxtLinkedList();
        list.add("aaa");
    }
}

