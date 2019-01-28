package learn.testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/***
 * 可视化的 日历！！！
 */

public class VisualCalendar {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期，按照格式：2010-3-10：");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(inputStr);
        Calendar c = new GregorianCalendar();
        c.setTime(date);

        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, 1);

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        int maxDate = c.getActualMaximum(Calendar.DATE);
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        int weekNum = c.get(Calendar.DAY_OF_WEEK);

        for (int i =1; i < weekNum; i++) {
            System.out.print("\t");
        }
        // 可视化
        for (int i = 1; i<=maxDate; i++) {
            if (i == day) {
                System.out.print("**" + i);
            } else  {
                System.out.print(i+"\t");
            }
            int w = c.get(Calendar.DAY_OF_WEEK);
            if (w == Calendar.SATURDAY) {
                System.out.print("\n");
            }
            c.add(Calendar.DATE, 1);
        }
    }
}
