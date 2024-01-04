package Class25Arrays;

public class HW1_SippleArrayDeclaration {
    public static void main(String[] args) {
System.out.println(createArray(5));
    }
    public static Integer[] createArray(int size) {
        if (size <= 0) {
            size = 1;
        }
        return new Integer[size];
    }
}
