package autoconvert;
public class AutoConvert {
    public static void main(String[] args) {
        int i = 65;
        char c = 'A';
        int addi = i + c;
        char addc = (char) (i + c);
        System.out.println("i=" + (char) i);
        System.out.println("A="+(int)c);
        System.out.println(addi);
        System.out.println(addc);



    }
}
