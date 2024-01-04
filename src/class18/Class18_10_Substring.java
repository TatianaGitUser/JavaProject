package class18;

public class Class18_10_Substring {
    public static void main(String[] args) {
//        substring(int i) -> cuts the String from the given index
        String str = "DevXSchool";
        String str2 = str.substring(3);
    System.out.println(str2);

String str4 = str.substring(4);
System.out.println(str4);

String str5 = "Hello Java Superstars, Java is hard, but it's fun";
String str6 = str5.substring(23);
    System.out.println(str6);

//    String str8 = str5.substring(-2);
//    System.out.println(str8);
//    will give an error out of bound
//includes and prints out starting word for some reason
//        String substring(inti, int j)
//        cuts the String from i to j
//        counting starts from 0
        String str7 = "Hello my dear friend, it's a beautiful day today";
        String str8 = str7.substring(22, 38);
        System.out.println(str8);
        int lastIndexOfJava = str5.lastIndexOf("Java");
        int lastIndexOfComma = str5.lastIndexOf(",");
        String str10 = str5.substring(lastIndexOfJava, lastIndexOfComma);
        System.out.println(str10);

    }
}

//Extract Substring After Word *
// public static String extractSubstringAfterWord(String sentence, String word){
//  int wordFirstIndex = sentence.indexOf(word);
//  int wordLength = word.length();
//  int wordLastIndex = wordFirstIndex + wordLength;
//  if(sentence.contains(word)){
//   return sentence.substring(wordLastIndex);
//}else return "";
//}

//Extract substring between 2 words *
//   public static String extractBetween2Words(String sentence, String startingWord, String endingWord) {
//    int startingWordIndex = sentence.indexOf(startingWord);
//   int startingWordLength = startingWord.length();
//   int firstWordEnd = startingWordIndex + startingWordLength;
//   int endingWordIndex = sentence.indexOf(endingWord);
//   if(!sentence.contains(startingWord) &&  !sentence.contains(endingWord)){
//   return "Invalid input, starting word and ending words not found";
//  }
//else if(!sentence.contains(startingWord)){
//   return sentence.substring(0, endingWordIndex);
//  }
//else if(!sentence.contains(endingWord)){
//  return sentence.substring(firstWordEnd);
//  }
//else {
//    return sentence.substring(firstWordEnd, endingWordIndex);
//  }
//}