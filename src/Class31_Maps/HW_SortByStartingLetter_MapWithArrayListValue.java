package Class31_Maps;
import java.util.*;

public class HW_SortByStartingLetter_MapWithArrayListValue {
    public static void main(String[] args) {
        String input = "OpenAI is an artificial intelligence company";
        System.out.println(separateWordsByStartingLetter(input));

        String input1 = "Hello, World! OpenAI 2023";
        System.out.println(sortWordsIntoCategories(input1));
    }
    public static Map<Character, List<String>> separateWordsByStartingLetter(String input) {
        Map<Character, List<String>> result = new HashMap<>();
        String[] splitString = input.split(" ");

        for (String var : splitString) {
            var = var.replaceAll("[,.]", "");
            if (!var.isEmpty()) {
                char startChar = var.charAt(0);
                result.putIfAbsent(startChar, new ArrayList<>());
                result.get(startChar).add(var);//adds words from the list that start with this letter
            }
        }

        return result;
    }
//    Description: Implement a method called sortWordsIntoCategories() that takes a string as input.
//    The method should sort the words in the input string into four different categories
//    based on certain criteria. The categories are: "Has Uppercase", "All Lowercase",
//    "Has Special Character", and "Has Digit". Each word in the input string should be checked
//    against these criteria and assigned to the appropriate category. The method should return
//    a Map object where the keys represent the category names and the values are lists of strings
//    containing the words that belong to each category.
    public static Map<String, List<String>> sortWordsIntoCategories(String input1) {
        Map<String, List<String>> result = new HashMap<>();
        String[] splitString = input1.split(" ");

        for (String var : splitString) {
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean hasSpecialCharacter = false;

            for (int i = 0; i < var.length(); i++) {
                char currentChar = var.charAt(i);

                if (Character.isUpperCase(currentChar)) {
                    hasUppercase = true;
                    break;
                } else if (Character.isLowerCase(currentChar)) {
                    hasLowercase = true;
                } else if (Character.isDigit(currentChar)) {
                    hasDigit = true;
                } else if (currentChar == ',' || currentChar == '.') {
                    hasSpecialCharacter = true;
                }
            }

            // Categorize the word based on its characteristics
            if (hasUppercase) {
                result.putIfAbsent("Has Uppercase", new ArrayList<>());
                result.get("Has Uppercase").add(var);
            }
            if (hasLowercase) {
                result.putIfAbsent("All Lowercase", new ArrayList<>());
                result.get("All Lowercase").add(var);
            }
            if (hasDigit) {
                result.putIfAbsent("Has Digit", new ArrayList<>());
                result.get("Has Digit").add(var);
            }
            if (hasSpecialCharacter) {
                result.putIfAbsent("Has Special Character", new ArrayList<>());
                result.get("Has Special Character").add(var);
            }
        }
        return result;
    }
}
