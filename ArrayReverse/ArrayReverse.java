/**
 * 测试如何反转一个整形数列
 * @author Dawn
 * @version 1.0
 */
public class ArrayReverse {
    /**
     * 用于反转一个整形的数列
     * @param arr 一个整形的数列，长度无限制
     * @return 返回一个反转后的整形数列
     */
    public static int[] reverse(int[] arr) {// 改进方法：使用泛型使得方法适用于所有类型的数列
        int[] reversed = new int[arr.length];
        int len = arr.length;
        for (int i : arr) {
            reversed[--len] = i;
        }
        return reversed;
    }

    /**
     * 用于输出一个数列的元素，按照从头到尾的顺序，元素之间以一个空格隔开，输出结束后换行
     * @param arr 一个整形的数列，长度无限制
     */
    public static void printArray(int[] arr) {// 改进方法：使用泛型使得方法适用于所有类型的数列
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        printArray(arr);
        int[] reversedArr = reverse(arr);
        printArray(reversedArr);
    }
}
