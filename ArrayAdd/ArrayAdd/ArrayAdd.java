package ArrayAdd;
import java.util.Scanner;

/**
 * 实现数组中元素的添加和删除
 * 操作由用户操作
 */
public class ArrayAdd {
    private static int[] arr;

    static {
        arr = new int[0];
        System.out.println("The array is empty now.");
    }

    /**
     * 用于输出一个数列的元素，按照从头到尾的顺序，元素之间以一个空格隔开，输出结束后换行
     * 
     * @param arr 一个整形的数列，长度无限制
     */
    public static void printArray(int[] arr) {// 改进方法：使用泛型使得方法适用于所有类型的数列
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * 实现数组元素的添加，对原数组更新
     * 
     * @param value 输入要添加的数字
     */
    public static void add(int value) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = value;
        arr = newArray;
        printArray(arr);
    }

    /**
     * 实现数组元素的减少
     */
    public static void delete() {
        if (arr.length == 0) {
            System.out.println("The array is empty now.");
            return;
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArray[i] = arr[i];
        }
        System.out.println(arr[arr.length - 1] + " is deleted.");
        arr = newArray;
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        aod: while (true) {
            System.out.print("add or delete or quit? (a/d/q): ");
            switch (scanner.next()) {
                case "d" -> delete();
                case "a" -> {
                    System.out.print("input the number you want to add:");
                    add(scanner.nextInt());
                }
                case "q" -> {
                    break aod;
                }
                default -> {
                    System.out.println("please input a or d or q");
                    continue aod;
                }
            }
        }
        scanner.close();
    }

}
