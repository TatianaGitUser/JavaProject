package Class26;


import java.util.Arrays;

public class HW_FindTheSpecialCharArray {
    public static void main(String[] args) {

        String[] arr = {"Testing special characters: @#$%^&*()_+",
                "This string has spaces at the end     ",
                "This string has spaces at the beginning", "Test string #4!",
                "Testing testing 1 2 3!", "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"};
        System.out.println(Arrays.toString(findStringsContainingSpecialChars(arr)));

    }
    public static String[] findStringsContainingSpecialChars(String[] arr) {
        if (arr.length == 0) {
            return new String[0];
        }

        int count = 0;

        for (String currentE : arr) {
            if (currentE.contains(",") || currentE.contains(".") || currentE.contains("!") ||
                    currentE.contains("?") || currentE.contains(";") || currentE.contains(":") ||
                    currentE.contains("-") || currentE.contains("&") || currentE.contains("#")) {
                count++;
            }
        }

        if (count == 0) {
          return new String[0];
        }

        String[] resultArray = new String[count];
        int index = 0;

        for (String currentE : arr) {
            if (currentE.contains(",") || currentE.contains(".") || currentE.contains("!") ||
                    currentE.contains("?") || currentE.contains(";") || currentE.contains(":") ||
                    currentE.contains("-") || currentE.contains("&") || currentE.contains("#")) {
                resultArray[index++] = currentE;
            }
        }

        return resultArray;
    }
}
