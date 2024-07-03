/**
 * ������η�תһ����������
 * @author Dawn
 * @version 1.0
 */
public class ArrayReverse {
    /**
     * ���ڷ�תһ�����ε�����
     * @param arr һ�����ε����У�����������
     * @return ����һ����ת�����������
     */
    public static int[] reverse(int[] arr) {// �Ľ�������ʹ�÷���ʹ�÷����������������͵�����
        int[] reversed = new int[arr.length];
        int len = arr.length;
        for (int i : arr) {
            reversed[--len] = i;
        }
        return reversed;
    }

    /**
     * �������һ�����е�Ԫ�أ����մ�ͷ��β��˳��Ԫ��֮����һ���ո�����������������
     * @param arr һ�����ε����У�����������
     */
    public static void printArray(int[] arr) {// �Ľ�������ʹ�÷���ʹ�÷����������������͵�����
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
