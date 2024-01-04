package Class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW_DigitsFromString {
    public static void main(String[] args) {
        String input = "I have 20 apples and -50 oranges in my basket. The temperature outside is 25 degrees Celsius.";
        System.out.println(parseUniqueDigits(input));
    }
    public static Set<Integer> parseUniqueDigits(String input) {
        Set<Integer> result = new LinkedHashSet<>();
        StringBuilder currentDigit = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)||currentChar == '-') {
                currentDigit.append(currentChar);
            } else {
                if (currentDigit.length() > 0) {
                    int value = Integer.parseInt(currentDigit.toString());
                    result.add(value);
                    currentDigit.setLength(0); // Clear the StringBuilder
                }
            }
        }

        return result;
    }
}
