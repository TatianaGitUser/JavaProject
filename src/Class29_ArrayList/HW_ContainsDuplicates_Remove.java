package Class29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_ContainsDuplicates_Remove {
    public static void main(String[] args) {
Integer [] inputOriginal= {-5, 10, 0, -15, 20, -10, -5, 0, -5, -15, -5, -10, 20, 20, -5, 0, 10, -15, -5, -15, 10, -5, -15, -15, -15, -5, 10, 10, 0, 0, -10, -10, -10, -15, 10, 10, 0, 25, -30, -35, 40, 45};
    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(inputOriginal));
    System.out.println(removeDuplicates(input));//removing duplicates and original value
    System.out.println(removeDuplicates1(input));//removing duplicates
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> input) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            int num = input.get(i);
            boolean isUnique = true;

            for (int j = 0; j < input.size(); j++) {
                if (i != j && num == input.get(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result.add(num);
            }
        }

        return result;
    }
    public static ArrayList<Integer> removeDuplicates1(ArrayList<Integer> input) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : input) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
