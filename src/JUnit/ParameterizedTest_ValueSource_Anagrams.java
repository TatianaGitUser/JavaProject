//package JUnit;
//
//public class ParameterizedTest_ValueSource_Anagrams {
//    import java.util.Arrays;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class AnagramChecker {
//        public static boolean isAnagram(String word1, String word2) {
//            // Remove spaces and convert to lowercase for a case-insensitive check
//            String cleanedWord1 = word1.replaceAll("\\s", "").toLowerCase();
//            String cleanedWord2 = word2.replaceAll("\\s", "").toLowerCase();
//
//            // Check if the lengths of the cleaned words are equal
//            if (cleanedWord1.length() != cleanedWord2.length()) {
//                return false;
//            }
//
//            // Convert the cleaned words to character arrays and sort them
//            char[] charArray1 = cleanedWord1.toCharArray();
//            char[] charArray2 = cleanedWord2.toCharArray();
//            Arrays.sort(charArray1);
//            Arrays.sort(charArray2);
//
//            // Compare the sorted character arrays
//            return Arrays.equals(charArray1, charArray2);
//        }
//    }
//
//    class MainTest {
//        AnagramChecker one = new AnagramChecker();
//        @ParameterizedTest
//        @ValueSource(strings = {"listen,silent", "astronomer,moon starer", "The Morse Code,Here come dots"})
//        public void testTwoWordsForAnagrams_Positive(String words){
//            String[]wordsArray = words.split(",");
//            assertTrue(one.isAnagram(wordsArray[0], wordsArray[1]));
//        }
//        @ParameterizedTest
//        @ValueSource(strings = {"hello,world", "apple,banana", "programming,code"})
//        public void testTwoWordsForAnagrams_Negative(String words){
//            String[]wordsArray = words.split(",");
//            assertFalse(one.isAnagram(wordsArray[0], wordsArray[1]));
//        }
//    }
//
//}
