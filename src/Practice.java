import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Practice {
    public static void main(String[] args) {

        String word = "Hello World";
        String reversestring = "";
        StringBuilder newString = new StringBuilder("Hello world");
        System.out.println(newString.reverse());
        for (int i = word.length() - 1; i >= 0; i--) {
            reversestring += word.charAt(i);
        }
        System.out.println(reversestring);


        String input = "Hello";
        char[] reversed = reverse(input);
        System.out.println(reversed);

    }

    public static char[] reverse(String input) {

        char[] newInput = input.toCharArray();
        int length = newInput.length;
        char[] temp = new char[length];

        for (int i = newInput.length - 1, j = 0; i >= 0; i--, j++) {

                temp[j] = newInput[i];
        }    return temp;
    }
}