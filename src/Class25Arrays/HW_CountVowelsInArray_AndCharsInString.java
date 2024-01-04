package Class25Arrays;

public class HW_CountVowelsInArray_AndCharsInString {
    public static void main(String[] args) {
        String[] inputs = {"hello", "world", "how", "are", "you", ""};
String []params = {"Wedevx", "random","  ", "words", "in the sentence"};
char given = 'o';
        System.out.println(countVowels(inputs));
        System.out.println("===================");
int[]inputs1 = countVowelsInEachString(inputs);
        for (int i = 0; i<inputs.length; i++ ){
            System.out.println(inputs1[i]);
        }
        System.out.println("=============");
        System.out.println(countChar(params, given));
    }

    public static int countVowels(String[] inputs) {
        if (inputs.length < 1) {
            return -1;
        }
        int counter = 0;
        for (int j = 0; j < inputs.length; j++) {
            String currentString = inputs[j];
            for (int i = 0; i < currentString.length(); i++) {
                char currentChar = currentString.charAt(i);

                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'o' || currentChar == 'i' ||
                        currentChar == 'u') {
                    counter++;
                }
            }

        }
        return counter;
    }

    public static int[] countVowelsInEachString(String[] words) {
        if (words.length == 0) {
            return new int[] {-1};
        }
        int[] vowelCounts = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                char c = Character.toLowerCase(word.charAt(j));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            vowelCounts[i] = count;
        }
        return vowelCounts;
    }

    public static int[] countChar(String [] params, char given){
        if (params.length == 0){
            return new int[]{-1};
        }
        int []result = new int[params.length];
        for (int i = 0; i<params.length; i++){
            int counter = 0;
            String currentString = params[i];

            for (int j = 0; j<currentString.length(); j++){
                char currentChar = currentString.charAt(j);
                if(currentChar == given){
                    counter++;

                }
            }
            result[i]= counter;
        }
        return result;
    }

}

