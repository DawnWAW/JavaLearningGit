import java.lang.reflect.Array;

/**
 * 测试如何反转一个整形数列
 * 
 * @author Dawn
 * @version 1.1
 */
public class ArrayReverse<T> {
    /**
     * 用于反转一个整形的数列
     * 
     * @param arr 一个整形的数列，长度无限制
     * @return 返回一个反转后的整形数列
     */
    public static <T> T[] reverse(T[] arr) {
        T[] reversed = (T[]) Array.newInstance(arr.getClass().getComponentType(), arr.length);
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /**
     * 用于输出一个数列的元素，按照从头到尾的顺序，元素之间以一个空格隔开，输出结束后换行
     * 
     * @param arr 一个整形的数列，长度无限制
     */
    public static <T> void printArray(T[] arr) {
        for (T i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        printArray(arr);
        Integer[] reversedArr = reverse(arr);
        printArray(reversedArr);

    }
}
