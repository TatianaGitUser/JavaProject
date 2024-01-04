package Class25Arrays;

public class HW_RemovaDuplicatesArray {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog\nThe lazy dog is quick";
//        removeDuplicatesFromString(input);
    }

//    public static String[] removeDuplicatesFromString(String inputString) {
//        // Return an empty array if the input string is empty
//        if (inputString.isEmpty()) {
//            return new String[0];
//        }
//        // Split the input string into an array of strings using spaces and/or newlines as delimiters
//        String[] words = inputString.split("[\\s\\n]+");
//        // Create a map to store the count of each word
//        Map<String, Integer> wordCountMap = new HashMap<>();
//        // Count the occurrences of each word, ignoring case and spaces at the beginning or end
//        for (String word : words) {
//            // Remove spaces at the beginning and end of the word
//            word = word.trim();
//            // Convert the word to lowercase to ignore case when comparing
//            String lowercaseWord = word.toLowerCase();
//            // Update the count for the lowercase word in the map
//            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
//        }
//        // Create a list to store unique words (occurring only once)
//        List<String> uniqueWords = new ArrayList<>();
//        // Add the words to the list if they occur only once
//        for (String word : words) {
//            // Remove spaces at the beginning and end of the word
//            word = word.trim();
//            // Convert the word to lowercase to ignore case when comparing
//            String lowercaseWord = word.toLowerCase();
//            // Add the word to the list if its count is 1 in the map
//            if (wordCountMap.get(lowercaseWord) == 1 && !lowercaseWord.equals("")){
//                uniqueWords.add(word);
//            }
//        }
//        // Convert the list back to an array and return it
//        return uniqueWords.toArray(new String[0]);
//    }
}


