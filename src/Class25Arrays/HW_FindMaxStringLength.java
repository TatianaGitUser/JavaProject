package Class25Arrays;

public class HW_FindMaxStringLength {
    public static void main(String[] args) {
        String input = "SomeE   sOmEe   some    wordS     words    WORDS words    empty    SENTENCE   sENtenCe sentence? ";
        System.out.println(findMaxWord(input));
    }
    public static String findMaxWord(String input){
        if (input.length()==0){
            return input;
        }

        String []arr = input.split("[\\s\n ,.!?;:-]");
        String currentString = "";
        String maxWord = "";
        for (int i = 0; i<arr.length-1; i++){
            currentString = arr[i];
            if (currentString.length() > maxWord.length()){
                maxWord = currentString;
            }
        }return maxWord;
    }
}
