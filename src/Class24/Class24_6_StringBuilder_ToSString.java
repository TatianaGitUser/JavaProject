package Class24;

public class Class24_6_StringBuilder_ToSString {
    public static void main(String[] args) {
String str = "Superstar from wedevx";
StringBuilder sb = new StringBuilder(str);

sb.append(" is going to the moon");

String str1 = sb.toString();
System.out.println(str1);

    }
}
