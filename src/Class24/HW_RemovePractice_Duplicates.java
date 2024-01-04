package Class24;

public class HW_RemovePractice_Duplicates {
    public static void main(String[] args) {
        System.out.println(removeSubstrings("this is a test", "test"));
        System.out.println(removeDuplicates("eeettttuuhhhh"));
    }

    public static StringBuilder removeSubstrings(String sentence, String input) {
        StringBuilder sb = new StringBuilder(sentence);
        int index = sb.indexOf(input);

        while (index != -1) {
            sb.delete(index, index + input.length());
            index = sb.indexOf(input);
        }

        return sb;
    }
    public static StringBuilder removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length() - 1; i++) {
            char currentChar = sb.charAt(i);
            for (int j = i + 1; j < sb.length(); j++) {
                if (currentChar == sb.charAt(j)) {
                    sb.deleteCharAt(j); // Delete the duplicate character
                    j--; // Adjust the loop counter to recheck the current index
                }
            }
        }

        return sb;
    }
    }
