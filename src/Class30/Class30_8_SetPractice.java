package Class30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Class30_8_SetPractice {
    public static void main(String[] args) {
//        create a prog that converts an array of words and counts the num of unique words using a HashSet
//        ignore punctuation and convert all words to lowercase for accurate counting
        String[]words = {"apple", "car", "apple", "orange", "blue", "pink", "java", "java", "java", "hello"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));// ->converts Array to a List
        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());
    }
}
