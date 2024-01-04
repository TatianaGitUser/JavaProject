package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class HW_SwitchBinaries_Medium {
    public static void main(String[] args) {
//        Description: Implement a method called binarySwitching() that takes
//        a binary string as input. The method should iterate through the string and perform
//        the following actions: If the first element in the binary string is '0',
//        add an entry to the map with the index of the current element as the key
//        and the value as false. Continue adding entries to the map with subsequent '0' values
//        until a '1' is encountered. Once a '1' is encountered, empty the map and add an entry
//        with the index of the current element as the key and the value as true.
//        From that point onwards, add entries to the map with subsequent '1' values
//        until another '0' is encountered. This switching pattern should continue until
//        the end of the input string. Same if the input starts with '1'.
        String input = "010100";
        System.out.println(binarySwitching(input));
    }
    public static Map<Integer, Boolean> binarySwitching(String input){
        Map <Integer, Boolean> result = new HashMap<>();
        boolean currentValue = input.charAt(0) == '1';
        for (int i = 0; i<input.length(); i++){

            char currentDigit = input.charAt(i);
            boolean isTrue = currentDigit == '1';
            if(isTrue != currentValue){
                result.clear();
                currentValue = isTrue;
            }
            result.put(i, currentValue);
        } return result;
    }
}
