package src.src.learn.collection;

import org.w3c.dom.Node;

/**
 * 实现一个 双向链表结构
 */

public class SxtLinkedList {
    private LinkedNode first;
    private LinkedNode last;

    private int size;

    public void add(Object obj) {
        if(first == null){ // 空的链表
            LinkedNode n = new LinkedNode();
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            first = n;
            last = n;
        } else  {
            // 直接往 last 节点后增加新的节点
            LinkedNode n = new LinkedNode();
            n.setPrevious((Node) last);
            n.setObj(obj);
            n.setNext(null);

            last.setNext((Node) n);

            last = n;
        }
        size++;
    }
    public int size() {
        return size;
    }

    public Object get(int index) {
        RangeCheck(index);
        LinkedNode temp = null;
        if(first == null) {

        } else {
            temp = first;
            for(int i=0; i< index; i++) {
                // System.out.println(temp);
                temp = (LinkedNode) temp.getNext();
            }
        }
        return temp.getObj();
    }

    public void RangeCheck(int index) {
        if(index < 0 || index >=size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SxtLinkedList list = new SxtLinkedList();
        list.add("aaaR");
        list.add("bbbb");
        System.out.println(list.get(1));
    }
}

