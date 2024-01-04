package Class24;

public class HW_ConditionalReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("Something wrong here"));
        System.out.println(reverseString("I found a cauldron full of golden coins"));
    }

    public static StringBuilder reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        int numOfSpaces = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
                numOfSpaces++;
            }
        }
        if (numOfSpaces % 2 == 0) {
            return new StringBuilder("Can't reverse");
        } else {

            return sb.reverse();
        }
    }
}