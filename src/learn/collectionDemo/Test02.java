package src.src.learn.collectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
    public static void main(String[] args){
        // 一个 map 对象对应一行表记录
        Map map = new HashMap();
        map.put("id", 301);
        map.put("name", "高崎");
        map.put("salary", 3000);
        map.put("department", "项目部");
        map.put("hireDate", "2007-10");

        Map map2 = new HashMap();
        map2.put("id", 303);
        map2.put("name", "高崎");
        map2.put("salary", 3000);
        map2.put("department", "项目部");
        map2.put("hireDate", "2007-10");

        Map map3 = new HashMap();
        map3.put("id", 303);
        map3.put("name", "高崎");
        map3.put("salary", 3000);
        map3.put("department", "项目部");
        map3.put("hireDate", "2007-10");

        List<Map> list = new ArrayList<Map>();
        list.add(map);
        list.add(map2);
        list.add(map3);

        for (int i = 0; i< list.size(); i++) {
            Map employee = list.get(i);
            System.out.println(employee.get("id") + "：" + employee.get("name")+ "："+ employee.get("salary") + "：" + employee.get("department") + "："+ employee.get("hireDate"));
        }
    }
}
