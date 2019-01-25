package learn.testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化日期时间
 */

public class TestDateformat {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy年M月dd日");
        Date t = new Date();
        String str = df.format(t);
        System.out.println(str);
        System.out.println("**********************");
        String str2 = "2009-2-12";
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        Date t2 = df2.parse(str2);
        System.out.println(t2);
    }
}
