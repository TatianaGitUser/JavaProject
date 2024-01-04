package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class HW_CheckUniqueWords {
    public static void main(String[] args) {
       String sentence = "A bird in the hand is worth two in the bush.";
       System.out.println(checkDuplicateWords(sentence));
    }
    public static Map<String, Boolean> checkDuplicateWords(String input){
        Map<String,Boolean> wordMap = new HashMap<>();
        String[] words = input.split(" ");
        for(String word: words){
            Boolean isUnique = false;
            if(!wordMap.containsKey(word.toLowerCase())){
                isUnique=true;
            }
            wordMap.put(word, isUnique);//you fill in map with values first - then compares
        }return wordMap;
    }
}
