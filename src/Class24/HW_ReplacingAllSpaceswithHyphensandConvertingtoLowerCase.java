package Class24;

public class HW_ReplacingAllSpaceswithHyphensandConvertingtoLowerCase {
    public static void main(String[] args) {
        System.out.println(convertString("This is a test"));
    }
    public static String convertString(String input){
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i<sb.length(); i++){
            char currentChar = sb.charAt(i);
            if (currentChar == ' '){

                sb.replace(i, i+1, "-");

            }
        }return sb.toString().toLowerCase();
    }
}
