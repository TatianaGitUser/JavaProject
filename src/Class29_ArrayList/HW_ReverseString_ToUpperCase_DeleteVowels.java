package Class29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HW_ReverseString_ToUpperCase_DeleteVowels {
    public static void main(String[] args) {
        String [] words = {"cat", "programming", "open", "apple",
                "dog", "java", "elephant", "car", "banana", "computer"};
        ArrayList<String> input = new ArrayList<>(Arrays.asList(words));
        System.out.println(manipulateStrings(input));

    }
    public static ArrayList<String> manipulateStrings(ArrayList<String> input){
        ArrayList <String> result = new ArrayList<>();
        for (String var : input){
            if(var.length()< 5){
                result.add(var.toUpperCase());
            }else if(var.length()>=5 && var.length()<=10){
                StringBuilder sb = new StringBuilder(var);
                sb.reverse();
                result.add(sb.toString());
            }else{
                StringBuilder sb1 = new StringBuilder();
                for(int i = 0; i< var.length(); i++){

                    char currentChar = var.charAt(i);
                    if(currentChar != 'a'&&currentChar != 'e'&&currentChar != 'i'&&currentChar != 'o'&&currentChar != 'u'){
                        sb1.append(currentChar);

                    }
                }result.add(sb1.toString());
            }
        }return result;
    }
}
