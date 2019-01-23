package learn;

/**
 * 重写 toString 和 equals 方法
 */

public class TestOverwrite {
    String name;
    int age;

    public TestOverwrite(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", 年龄：" + age;
    }

    public static void main(String[] args) {
        TestOverwrite tow = new TestOverwrite("leo", 20);
        System.out.println(tow.toString());

        User u1 = new User(1000, "小明", "123");
        User u2 = new User(1000, "小张", "123");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        String str1 = new String("1234");
        String str2 = new String("1234");
        System.out.println(str1 == str2);
    }
}

class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        if(other.id != id) {
            return false;
        }
        return true;
    }
}