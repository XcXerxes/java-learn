package learn.testDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试 日期类(Calendar)
 */

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        // calendar.set(2001, 1, 10, 12, 23, 34);
        calendar.set(Calendar.YEAR, 2019);
        // 加天数
        calendar.add(Calendar.YEAR, 5);
        Date d = calendar.getTime();
        System.out.println(d);
        System.out.println();
    }
}
