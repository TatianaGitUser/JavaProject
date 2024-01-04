package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class HW_CountVowels {
    public static void main(String[] args) {
        String sentence = "I have an apple and a banana";
        System.out.println(countVowels(sentence));

        String input = "Some sentence with different words all unique and diverse";
        System.out.println(checkWordLength(input));
    }
    public static Map<String, Integer> countVowels(String sentence){
        String []splitString = sentence.split("[ ]");
        Map <String, Integer> result = new HashMap<>();
        int counter = 0;
        String s = "";
        for (String var : splitString){
            counter = 0;
            for (int i = 0; i<var.length(); i++){
                char currentChar = var.charAt(i);
                if (Character.toLowerCase(currentChar) == 'i'||Character.toLowerCase(currentChar) == 'e'
                        ||Character.toLowerCase(currentChar) == 'o'
                        ||Character.toLowerCase(currentChar) == 'u'||Character.toLowerCase(currentChar) == 'a'){
                    counter++;
                } s = Character.toString(currentChar);

            }
            result.put(var, counter);

        }return result;
    }
    public static Map <String, Boolean> checkWordLength(String input){
        String [] splitStr = input.split("[ ]");
        Map <String, Boolean> result = new HashMap<>();

        for (String var : splitStr){
            Boolean isEven = var.length()%2 ==0 ;
            result.put(var, isEven);
        }
        return result;
    }

}
