package Class24;

public class Class24_$_StringBuilder_Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java, Junit, Selenium, API");
//        replace takes 3 params: (int startIndex, int endIndex, String strToReplace)
        sb.replace(6, 11, "Cucumber");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Let's get down to business");
        sb1.replace(10, 17 ,"some").append(" done");
        System.out.println(sb1);
    }
}
