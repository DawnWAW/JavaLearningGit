package CalenderPrinter;

import java.util.Scanner;

public class CalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年份: ");
        int year = scanner.nextInt();

        System.out.print("请输入月份: ");
        int month = scanner.nextInt();

        scanner.close();

        // 获取该月的第一天是星期几
        int firstDayOfMonth = getFirstDayOfMonth(year, month);

        // 获取该月的总天数
        int daysInMonth = getDaysInMonth(year, month);

        // 打印日历的头部
        System.out.println("一\t二\t三\t四\t五\t六\t日");

        // 打印空格直到第一天的位置
        for (int i = 0; i < firstDayOfMonth-1; i++) {
            System.out.print("\t");
        }

        // 打印日期
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.print(day + "\t");

            // 每打印完一个星期就换行
            if ((day + firstDayOfMonth - 1) % 7 == 0) {
                System.out.println();
            }
        }

        // 如果最后一周天数不满7天，则打印换行
        if ((daysInMonth + firstDayOfMonth) % 7 != 0) {
            System.out.println();
        }
    }

    // 判断是否是闰年
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 获取某月的天数
    private static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    // 获取某月的第一天是星期几（0代表星期日，1代表星期一，依此类推）
    private static int getFirstDayOfMonth(int year, int month) {
        // 参考日期：1970年1月1日是星期五，即0代表星期五
        int baseDay = 4;

        // 计算从1970年1月1日到目标日期的总天数
        for (int y = 1970; y < year; y++) {
            baseDay += isLeapYear(y) ? 366 : 365;
        }

        for (int m = 1; m < month; m++) {
            baseDay += getDaysInMonth(year, m);
        }

        // 对7取余，得到目标日期是星期几（0-6）
        return baseDay % 7;
    }
}