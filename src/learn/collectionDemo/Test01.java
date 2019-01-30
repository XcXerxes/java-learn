package src.src.learn.collectionDemo;


import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        Employee e = new Employee(301, "高崎", 3000, "项目部", "2007-10");
        Employee e2 = new Employee(302, "马士兵", 3500, "教学部", "2006-10");
        Employee e3 = new Employee(303, "培新", 3000, "教学部", "2008-8");
        List<Employee> list = new ArrayList<Employee>();
        list.add(e);
        list.add(e2);
        list.add(e3);

        for (Employee employee: list) {
            System.out.println(employee.getId() + "：" + employee.getName()+ "："+ employee.getSalary() + "：" + employee.getDepartment() + "："+ employee.getHireDate());
        }

    }
}
