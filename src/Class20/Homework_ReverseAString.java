package Class20;

public class Homework_ReverseAString {
    public static void main(String[] args) {
    String input = "Hello";
    System.out.println(reverseString(input));
    }
    public static String reverseString(String input){
        int length = input.length()-1;
        String str = "";
        while (length>=0){
            char letter = input.charAt(length);
            str +=letter;
            length--;
        }
        return str;
    }
}
