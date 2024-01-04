package Class25Arrays;

public class HW_CheckLetterInLastWord {
    public static void main(String[] args) {
        String[]input = {"Wedevx", "chars","  ", "123456789", "0"};
        char character = '0';
        System.out.println(checkLetter(input, character));
    }
    public static boolean checkLetter(String []input, char character){
        if(input.length<=0){
            return false;
        }
        int length = input.length;
        char currentChar = input[length-1].charAt(0);
        if (currentChar == character){
            return true;
        }else{
            return false;
        }
    }

}
