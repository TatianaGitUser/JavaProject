package Class30;
import java.util.TreeSet;
import java.util.Set;
import java.util.LinkedHashSet;
public class HW_SortingTheString_Hard {
    public static void main(String[] args) {
        String input  = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt 9876543210 ut labore et dolore magna aliqua.";
        String input1 = "This is a random string with numbers 123 and some special characters !@#$%^&*";
        System.out.println(sortCharacters(input));
        System.out.println(sortCharacters(input1));
    }
    public static Set<String> sortCharacters(String input) {
        Set<String> result = new LinkedHashSet<>();
        if(input.contains("*")){
            return result;
        }
        Set<String> upperCase = new TreeSet<>();
        Set<String> lowerCase = new TreeSet<>();
        Set<String> digits = new TreeSet<>();
        Set<String> specialChar = new TreeSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                upperCase.add(String.valueOf(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                lowerCase.add(String.valueOf(currentChar));
            } else if (Character.isDigit(currentChar)) {
                digits.add(String.valueOf(currentChar));
            } else if (!Character.isLetterOrDigit(currentChar) && !Character.isWhitespace(currentChar)) {
                specialChar.add(String.valueOf(currentChar));
            } else if (currentChar == '*') {
                result.clear();
                break;
            }
        }

        result.addAll(upperCase);
        result.addAll(lowerCase);
        result.addAll(digits);
        result.addAll(specialChar);
        return result;
    }
}
