package OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RegexExamples {
    public static void main(String[] args) {
        String input5 = "x1x2x1x2x3x4x3x4x1x2";
        System.out.println(countSubsequenceGroups(input5));
        ArrayList<String> input2 = new ArrayList<>();
        input2.add("John's phone number: 123 456 2390");
        input2.add("Boe's phone number: 123 888 5490");
        input2.add("Mickey's phone number: 123 670 7800");
        System.out.println(extractMatchingPhoneNumbers(input2));

        String input = "...";
        System.out.println("Three dots test case: "+containsThreeDots(input));

        String input1 = "---kjj";
        System.out.println("hypnens and spaces: "+containsThreeHyphensOrTenSpaces(input1));
        String text = "The cat sat on the mat. The cat and the dog are friends.";
        String targetWord = "cat";
        findAndHighlightMatches(text, targetWord);
        String str = "wedevx.co";
//    matches method returns true if the given regex matches the string
        System.out.println(str.matches("wedevx.co"));

//        character class
        String str1= "Hello world";
        String str2 = str1.replaceAll("[aeiou]", "");
        System.out.println(str2);

        String str3 =  "ee";
        System.out.println(str3.matches("e+"));

        String str4 = "Hello wedevx";
        System.out.println(str4.replaceAll("e?", ""));

        String str5 = " ";
        System.out.println(str5.matches("o?"));

        String str6 = "Apple Inc.";
        System.out.println(str6.replaceAll("p{2}", ""));

        String str7 = "mmmmmm";
        System.out.println(str7.matches("m{6}"));

        String str8 = "xxxx";
        System.out.println(str8.matches("x{4,}"));

        String str9 = "wwwwwww";
        System.out.println(str9.matches("w{1,10}"));

//        wildcard dot
        String string1 = "bit";
        System.out.println("bit "+string1.matches("b.t"));

        String string2 = "Hello, I am Tatiana";
        System.out.println(string2.matches("Hello.{1,}Tatiana"));//.{1,} ->means matches any symbol 1 or more times

    String string3 = "Hello";
    System.out.println("Anchors "+string3.matches("^Hello$"));

    String string4 = "1994";
    System.out.println(string4.matches("\\d{4}"));

    String string5 = "elon_musk";
    System.out.println(string5.matches("\\w{1,}"));//this regex means my string
                                    // contains only alphanumeric values or underscore
        String string6 = "Hello Superstars, \nwelcome to wedevx";
        System.out.println(string6.replaceAll("\\s", ""));

        String string7 = "1994";
        System.out.println(string7.matches("\\D{4}"));

        String string8 = "213-56-7894";
        System.out.println(string8.matches("\\d{3}-\\d{2}-\\d{4}"));

        String phoneMun = "757-895-9987";
        System.out.println(phoneMun.matches("\\d{3}-\\d{3}-\\d{4}"));

        String thisString = "basketball";
        System.out.println(thisString.matches("soccer|football|basketball"));//or options

        String thisString1 = "ababab";
        System.out.println(thisString1.matches("(ab){1,}"));
    }

    public static void findAndHighlightMatches(String text, String targetWord) {
        System.out.println(text);
        System.out.println("The target word: "+targetWord);
        String newText = text.replaceAll(targetWord, "<"+targetWord+">");
        System.out.println(newText);
        int counter = 0;
        String[]splitString = text.split(" ");
        for(String currentString : splitString){
            if(currentString.equals(targetWord)){
                counter++;
            }
        }
        System.out.println("Occurances of '"+targetWord+"': "+counter);
    }
    public static boolean containsThreeDots(String input){
        return (input.matches("\\.{3}"));

    }
    public static boolean containsThreeHyphensOrTenSpaces(String input1){
        return (input1.matches(".*\\-{3}.*") || input1.matches(".* {10}.*"));

    }
    public static ArrayList<String> extractMatchingPhoneNumbers (ArrayList<String> input){
        ArrayList<String> newList = new ArrayList<>();
        for(String currentString : input){

            if(currentString.matches(".*123.*0")){
                int colonIndex = currentString.lastIndexOf(":");
                if(colonIndex != -1){
                    String phoneNumber = currentString.substring(colonIndex+1);
                    newList.add(phoneNumber.trim());

                }
            }
        }
        return newList;
    }
    public static ArrayList<String> extractMatchingPasswords(ArrayList<String>inputList){
        ArrayList<String> newList = new ArrayList<>();
        for(String currentString: inputList){
            if(currentString.matches("[AB].{5}[137]!")){
                newList.add(currentString);
            }
        }
        return newList;
    }
    public static Map<String, Integer> countSubsequenceGroups(String input5){
        Map<String, Integer> subsequences = new HashMap<>();
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i <= input5.length() - 4; i++) {
            String subsequence = input5.substring(i, i + 4);

            if (subsequence.matches("(x1x2)")){
                counter1++;
                subsequences.put(subsequence, counter1);
            }
            else if(subsequence.matches("(x3x4)")){
                counter2++;
                subsequences.put(subsequence, counter2);
            }
        }
        return subsequences;
    }

}
