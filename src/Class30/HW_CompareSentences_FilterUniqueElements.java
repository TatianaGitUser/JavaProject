package Class30;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class HW_CompareSentences_FilterUniqueElements {
    public static void main(String[] args) {
        String first = "Each word here is prepared to practice Collections";
        String second = "collections word is here";//case-sensitive
        System.out.println(Arrays.asList(compareWordCollections(first, second)));

        Set<String> setOfWords = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        Set<String> setOfStopWords = new HashSet<>(Arrays.asList("apple", "banana", "date", "grape"));
        System.out.println(filterUniqueElements(setOfWords, setOfStopWords));
    }
    public static String [] compareWordCollections(String first, String second){
        String []spitFirst = first.split("[ ]");
        String []splitSecond = second.split("[ ]");

        Set<String> setFirst = new HashSet<>(Arrays.asList(spitFirst));
        Set<String> setSecond = new HashSet<>(Arrays.asList(splitSecond));
        Set <String> middleResult = new HashSet<>();
        if(setFirst.containsAll(setSecond)){
            return new String [0];
        }
        setFirst.retainAll(setSecond);
        String [] result = setFirst.toArray(new String[0]);
        return result;
    }
    static Set<String> filterUniqueElements(Set<String> words, Set<String> stopWords) {
        // Create a copy of the words set to avoid modifying the original set
        Set<String> uniqueWords = new HashSet<>(words);

        // Use retainAll to remove elements that are also in the stopWords set
        uniqueWords.retainAll(stopWords);

        // Use removeAll to remove common elements from the original set
        words.removeAll(uniqueWords);
        return words;
    }
}
