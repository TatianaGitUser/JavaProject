package Class30;
import java.util.Set;
import java.util.LinkedHashSet;
public class HW_addUniqueChars {
    public static void main(String[] args) {
        String input = "Next appointment will be on 4th of September";
        String input1 ="OpenAI";
        String input2 = "Hello, world";
        System.out.println(addUniqueChars(input));
        System.out.println(addUniqueChars(input1));
        System.out.println(addUniqueChars(input2));
    }
    public static Set <Character> addUniqueChars(String input){
        Set <Character> result = new LinkedHashSet <>();
        for(int i = 0; i<input.length(); i++){
            char currentChar = input.charAt(i);

            if(Character.isLetter(currentChar)){
                result.add(currentChar);
            }
            else if(Character.isWhitespace(currentChar)){
                result.add(input.charAt(i+1));
            }else if(Character.isDigit(currentChar)){
                result.clear();
                result.add('0');
                break;
            }
            if(!Character.isLetter(currentChar)&&!Character.isWhitespace(currentChar)
                    &&!Character.isDigit(currentChar)){
                result.clear();
                break;
            }
        }return result;
    }
}
