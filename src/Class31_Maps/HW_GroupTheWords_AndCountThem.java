package Class31_Maps;
import java.util.*;
public class HW_GroupTheWords_AndCountThem {
    public static void main(String[] args) {
        Map<String, List<String>> input = new HashMap<>();
        input.put("first",Arrays.asList("apple, banana, car"));
        input.put("second",Arrays.asList("cat, dog, elephant"));
        input.put("third",Arrays.asList("orange, pear, grape, lemon, kiwi"));
        System.out.println(groupAndCountMapValues(input));
    }
    public static Map<Integer, Integer> groupAndCountMapValues(Map<String, List<String>> input) {
        Map<Integer, Integer> result = new HashMap<>();

        for (List<String> currentList : input.values()) {
            for (String string : currentList) {
                String[] splitString = string.split("[, ]");
                for (String word : splitString) {
                    int length = word.length();
                    int counter = 0; // Reset the counter for each word
                    for (String otherWord : splitString) {
                        if (length == otherWord.length()) {
                            counter++;
                        }
                    }
                    // Update the count for the current word length
                    result.put(length, result.getOrDefault(length, 0) + counter);
                }
            }
        }

        return result;
    }
}
