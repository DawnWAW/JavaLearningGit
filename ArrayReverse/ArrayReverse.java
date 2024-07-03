import java.lang.reflect.Array;

/**
 * ������η�תһ����������
 * 
 * @author Dawn
 * @version 1.1
 */
public class ArrayReverse<T> {
    /**
     * ���ڷ�תһ�����ε�����
     * 
     * @param arr һ�����ε����У�����������
     * @return ����һ����ת�����������
     */
    public static <T> T[] reverse(T[] arr) {
        T[] reversed = (T[]) Array.newInstance(arr.getClass().getComponentType(), arr.length);
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /**
     * �������һ�����е�Ԫ�أ����մ�ͷ��β��˳��Ԫ��֮����һ���ո�����������������
     * 
     * @param arr һ�����ε����У�����������
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
