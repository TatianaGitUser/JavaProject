package Class29_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class HW_FilterSentence {
    public static void main(String[] args) {
        String [] words = {"Hello", "World!", "JS", "@OpenAI", "Chatbot", "Test123", "$$", "!^$#"};
        System.out.println(filterWords(words));
    }
    public static List<String> filterWords(String [] words){
        List <String> filteredWords = new ArrayList<>();
        for (int i =0; i< words.length; i++){
            String currentString = words[i];
            int counter = 0;

            for (int x = 0; x<currentString.length(); x++){

                char currentChar = currentString.charAt(x);
                if (!Character.isLetter(currentChar)&&!Character.isDigit(currentChar)
                        &&!Character.isWhitespace(currentChar)){
                    counter++;
                }

            } if(counter>=1&&counter<=3||currentString.length()>5){
                filteredWords.add(currentString);

            }
        }return filteredWords;
    }
}
