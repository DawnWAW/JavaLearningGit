package ArrayReverse;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ������η�תһ����������
 * 
 * @author Dawn
 * @version 1.2
 */
public class ArrayReverse<T> {
    /**
     * ���ڷ�תһ�����ε�����
     * 
     * @param list ��Ҫ����ת��������
     * @return ����һ����ת�����������
     */
    public static <T> ArrayList<T> reverse(ArrayList<T> list) {
        ArrayList<T> reversedList = new ArrayList<>();
        reversedList.addAll(list.reversed());
        return reversedList;
    }

    /**
     * �������һ�����е�Ԫ�أ����մ�ͷ��β��˳��Ԫ��֮����һ���ո�����������������
     * 
     * @param arr һ�����ε����У�����������
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
