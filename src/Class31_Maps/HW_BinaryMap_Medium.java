package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class HW_BinaryMap_Medium {
    public static void main(String[] args) {

//        Description: Implement a method called convertBinaryMap() that accepts a String input
//        consisting of binary digits (0s and 1s). The method should convert each digit
//        into a map entry, where the key is the index starting from 0, and the value
//        is a string indicating "true" if the digit is 1, and "false" if the digit is 0.
//        If the number of binary digits is odd, add an additional map entry with the key
//        as the next available index and the value as "null". If the input string is empty
//        or contains no binary digits, include a single map entry with the key as 0 and
//        the value as "NO BOOLEAN".
        String input = "101010";
        System.out.println(convertBinaryMap(input));
    }
    public static Map<Integer, String> convertBinaryMap(String input){
        Map <Integer, String> result = new HashMap<>();
        int counter = 0;
        for (int i = 0; i<input.length(); i++){
            String isTrue = " ";
            char currentDigit = input.charAt(i);
            if(!input.startsWith("0") && !input.startsWith("1")){
                result.put(0, "NO BOOLEAN");
                break;
            }
            if(input.startsWith("0") || input.startsWith("1")){
                if(currentDigit == '1'){
                    isTrue = "true";
                }else{
                    isTrue = "false";
                }
            }
            counter++;
            result.put(i, isTrue);
        }if(input.length() %2 !=0){
            result.put(counter, "null");
        }
        return result;
    }
}
