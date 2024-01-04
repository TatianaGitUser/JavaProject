package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_CountNumberOfOccuranceOfEachWord {
    public static void main(String[] args) {
//        given a text - write a prog that prints the number of times each word occurs in the text
//        ex: Hello world hello askar askar askar adina
//        hello = 2
//        world = 1
//        askar = 3
//        adina = 1 *Case insensitive

        String text = "Hello world hello wedevx wedevx wedevx askar java";
//        hello = 2
//        worls = 1
//        wedevx = 3
//        java = 1
        String[] splitString = text.split(" ");
//        1.loop through every element
//        2. there are 2 things i need to store: word and num of occurances
//        3. create a Map of<String, Integer>
//        4. put(word, +=1)

        Map<String, Integer> wordOccurance = new HashMap<>();

        for (String word : splitString) {
            Integer currentValue = 0;
//    get method returns null if word doesn't exist
//            if the key exists
            if (wordOccurance.containsKey(word.toLowerCase())) {
                 currentValue = wordOccurance.get(word);

            }
            wordOccurance.put(word.toLowerCase(), currentValue + 1);
        }
        System.out.println(wordOccurance);
    }
}
