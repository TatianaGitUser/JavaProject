package Class30;

import java.util.HashSet;
import java.util.Set;
public class HW_SetOfStrings_ContainsWord {
    public static void main(String[] args) {
        Set <String> input = new HashSet<>();
        input.add("apple");
        input.add("banana");
        input.add("avocado");
        input.add("apple");
        input.add("banana");
        input.add("orange");
        String word  = "BANANA";
        System.out.println(checkWord(input, word));

        Set<String>leakedPasswords = new HashSet<>();
        leakedPasswords.add("password123");
        leakedPasswords.add("qwerty");
        leakedPasswords.add("12345678");
        String password  = "pAsSwOrD123";
        System.out.println(isSecurePassword(leakedPasswords, password));

        Set<String>phoneDataBase = new HashSet<>();
        phoneDataBase.add("+1234567890");
        phoneDataBase.add("+1987654321");
        phoneDataBase.add("+17778889999");
        String newPhone = "+17778889999";
        System.out.println(calculateDiscount(phoneDataBase, newPhone));
    }
    public static boolean  checkWord(Set<String> input, String word){
        boolean result = true;

        if(!input.contains(word.toLowerCase())){
            result = false;
        }
        return result;
    }
    public static boolean isSecurePassword(Set<String> leakedPasswords, String password){
        boolean result = true;
        if(leakedPasswords.contains(password.toLowerCase())){
            result = false;
        }else if(password.length()<8){
            result = false;
        }return result;
    }
    public static int calculateDiscount(Set<String> phoneDataBase, String newPhone){
        int result = 0;
        if(!phoneDataBase.contains(newPhone)){
            result = 15;
        }return result;
    }
}
