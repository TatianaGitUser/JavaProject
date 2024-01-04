package Class30;
import java.util.Set;
import java.util.LinkedHashSet;

public class HW_UniqueCharsFromString {
    public static void main(String[] args) {
String input = "SeNTenCE FOr tEstInG ^wItH s#PeCIAl Ch8aRActerS";
System.out.println(uniqueCharacters(input));
String input1 = "Hello 123 world! This is a test string 456 containing both words and numbers 789.";
System.out.println(parseUniqueDigits(input1));
    }
    public static Set<Character> uniqueCharacters(String input){
        Set <Character> result = new LinkedHashSet<>();
        for (int i = 0; i<input.length(); i++){
            if (Character.isLetter(input.charAt(i))||Character.isDigit(input.charAt(i))){
                result.add(input.charAt(i));
            }
        }return result;
    }

    public static int parseUniqueDigits(String input1) {

        int num = Integer.parseInt(input1);
        Set<Integer> result = new LinkedHashSet<>();
        return num;
    }
}
