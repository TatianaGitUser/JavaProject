package class18;

public class Class18_5_equals {
    public static void main(String[] args) {
        String str = "Hello";
        boolean isEquals = str.equals("Hi");
        System.out.println(isEquals);

        String str2 = "devx";
        boolean isEquals2 = str2.equals("devx");
System.out.println(isEquals2);

boolean isEquals3 = str2.equals("Devx");
System.out.println(isEquals3);

String str4 = "Mars";
        boolean isEquals4 = str4.equalsIgnoreCase("maRs");
System.out.println(isEquals4);

boolean isEquals5 = str4.equalsIgnoreCase("Jupiter");
System.out.println(isEquals5);
    }
}
