package ArrayReverse;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 测试如何反转一个整形数列
 * 
 * @author Dawn
 * @version 1.2
 */
public class ArrayReverse<T> {
    /**
     * 用于反转一个整形的数列
     * 
     * @param list 需要进行转换的数组
     * @return 返回一个反转后的整形数列
     */
    public static <T> ArrayList<T> reverse(ArrayList<T> list) {
        ArrayList<T> reversedList = new ArrayList<>();
        reversedList.addAll(list.reversed());
        return reversedList;
    }

    /**
     * 用于输出一个数列的元素，按照从头到尾的顺序，元素之间以一个空格隔开，输出结束后换行
     * 
     * @param arr 一个整形的数列，长度无限制
     */
    public static <T> void printArray(ArrayList<T> arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
        printArray(arr);
        arr = reverse(arr);
        printArray(arr);
    }
}
