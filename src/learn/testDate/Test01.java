package learn.testDate;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        Date d = new Date();
        long t = System.currentTimeMillis();
        System.out.println(t);
        Date d2 = new Date(1000);
        System.out.println(d2.toString());
        System.out.println(d.getTime());
    }
}
