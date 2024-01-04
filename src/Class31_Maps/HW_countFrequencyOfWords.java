package Class31_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class HW_countFrequencyOfWords {
    public static void main(String[] args) {
        String sentence = "apple banana apple orange banana apple";
      System.out.println(countWordFrequency(sentence));
    }
    public static Map<String, Integer> countWordFrequency(String sentence){
        Map <String, Integer> result = new HashMap<>();
        String []splitSentence = sentence.split("[ ]");
        List <String> arraySentence = new ArrayList<>(Arrays.asList(splitSentence));

        for (int i = 0; i<splitSentence.length; i++){
            String currentWord = splitSentence[i];
            int counter = 0;
            for (int j = 0; j<splitSentence.length; j++){
                if(currentWord.equals(splitSentence[j])){
                    counter++;
                }
            }
            result.put(currentWord, counter);
        }return result;
    }

}
