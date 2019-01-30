package src.src.learn.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map 的基本用法
 */

public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        Wife wife = new Wife("lily");
        map.put("leo", wife);
        map.put("张三", new Wife("李四"));
        Wife w = (Wife) map.get("leo");
        System.out.println(w.name);

        map.remove("张三");
//        Wife w1 = (Wife) map.get("张三");
//        System.out.println(w1.name);
        System.out.println(map.containsKey("leo"));
    }
}

class Wife{
    String name;

    public Wife(String name) {
        this.name = name;
    }
}
