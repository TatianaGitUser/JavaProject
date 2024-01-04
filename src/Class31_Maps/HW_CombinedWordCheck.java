package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class HW_CombinedWordCheck {
    public static void main(String[] args) {
        String palindrome = "A Santa at NASA, tarred rats";
        String capitalL = "Python programming Language and AI";
        System.out.println(checkWords(palindrome, capitalL));
    }
    public static Map <String, Boolean> checkWords(String palindrome, String CapitalL){
        Map <String, Boolean> result = new HashMap<>();
        Map<String, Boolean> subResult1 = new HashMap<>();

        String[]palindromeSplit = palindrome.split(" ");
        String[]capitalLSplit = CapitalL.split(" ");
        String currentWord = " ";


        for(int i = 0; i<palindromeSplit.length; i++){
            currentWord = palindromeSplit[i];

            boolean valueP = false;
            int counter = 1;
            for(int x = 0; x<currentWord.length(); x++){

                String currentChar = Character.toString(currentWord.charAt(x));
                String lastChar = Character.toString(currentWord.charAt(currentWord.length()-counter));
                if(currentWord.length() %2 !=0){
                    if(currentChar.equalsIgnoreCase(lastChar)){
                        valueP = true;
                    }else{
                        valueP = false;
                    }
                }
                counter++;
            }subResult1.put(currentWord, valueP);
        }
        for (int i= 0; i<capitalLSplit.length; i++){
            currentWord = capitalLSplit[i];
            boolean valueC = false;
            currentWord = currentWord.replace(",", "");
            char currentChar = currentWord.charAt(0);
            if(Character.isUpperCase(currentChar)){
                valueC = true;
            }
            result.put(currentWord, valueC);
        }result.putAll(subResult1);
        return result;
    }
}
