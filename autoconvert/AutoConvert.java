public class AutoConvert {
    public static void main(String[] args) {
        int i = 65;
        char c = '你';
        int addi = i + c;
        char addc = (char) (i + c);
        System.out.println("i=" + (char) i);
        System.out.println("你="+(int)c);
        System.out.println(addi);
        System.out.println(addc);



    }
}
