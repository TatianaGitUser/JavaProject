package class18;

public class Class18_4_Length {
    public static void main(String[] args) {
//        count from 1
        String str = "devx";
        int strLength = str.length();
        System.out.println(strLength);
        String str2 = "Hello, wedevx";
        int str2Length = str2.length();
        System.out.println(str2Length);
        String str3  = "Hello wedevx superstar, let's keep building our bright future together!";
        int str3Length = str3.length();
        System.out.println(str3Length);

        char w = str2.charAt(7);
        System.out.println(w);

        char lastChar = str3.charAt(str3.length()-1);
        System.out.println(lastChar);
        String str4 = "Elon Musk invested $300mm into SpaceX";
        char str4LastChar = str4.charAt(str4.length()-1);
        System.out.println(str4LastChar);
    }
}
