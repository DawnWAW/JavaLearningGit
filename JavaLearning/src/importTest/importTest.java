package importTest;
import ArrayAdd.ArrayAdd;
import java.util.Arrays;
public class importTest {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 11, 7, 0 };
        ArrayAdd.printArray(arr);
        Arrays.sort(arr);
        ArrayAdd.printArray(arr);
    }
}
