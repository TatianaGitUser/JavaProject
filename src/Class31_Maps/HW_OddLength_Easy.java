package Class31_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class HW_OddLength_Easy {
    public static void main(String[] args) {
        Map<Integer, String> input = new HashMap<>();
        input.put(1, "Hello, World!");
        input.put(2, "Rainbow sunset )");
        input.put(3, "This is a test.");
        input.put(4, "Java Programming");
        System.out.println(countUnevenValues(input));
    }
    public static int countUnevenValues(Map<Integer, String> input) {
        Collection<String> values = input.values();
        int counter = 0;

        for (String var : values) {
            if (var.contains(" ") || var.contains(",") || var.contains(".")) {
                var = var.replace(" ", "").replace(".", "").replace(",", "");
            } if (var.length() % 2 != 0) {
                counter++;
            }

        }
        return counter;
    }
}
