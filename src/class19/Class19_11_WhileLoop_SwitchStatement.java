package class19;

public class Class19_11_WhileLoop_SwitchStatement {
    public static void main(String[] args) {
//        write a method that takes a String and prints out all vowel chars in it
//      str  "Hello"
vowel("Hello");
System.out.println("---------------------");
vowel("Superstar");
    }
    public static void vowel(String str) {
        switch (str.charAt(0)) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
            case 'y':
                System.out.println(str.charAt(0));
                break;
        }
        switch (str.charAt(1)) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
            case 'y':
                System.out.println(str.charAt(1));
                break;
        }
        switch (str.charAt(2)) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
            case 'y':
                System.out.println(str.charAt(2));
                break;
        }
        switch (str.charAt(3)) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
            case 'y':
                System.out.println(str.charAt(3));
                break;
        }
        switch (str.charAt(4)) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
            case 'y':
                System.out.println(str.charAt(4));
                break;
        }
//instead of hardcoding---->>while loop

        System.out.println("--------------------------");
        int counter = 0;
        while (counter <= str.length() - 1) {
            switch (str.charAt(counter)) {
                case 'a':
                case 'e':
                case 'u':
                case 'i':
                case 'o':
                case 'y':
                    System.out.println(str.charAt(counter));
                    counter++;
                    break;
                default:
                    counter++;
            }

        }
    }
    }

