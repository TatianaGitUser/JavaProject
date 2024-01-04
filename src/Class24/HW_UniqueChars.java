package Class24;

public class HW_UniqueChars {
    public static void main(String[] args) {
        String input = "967ty";
boolean uniqueChars = uniqueCharacters(input);
if(uniqueChars){
    System.out.println("Only unique characters here");
}else{
    System.out.println("Not unique");
}
    }
    public static boolean uniqueCharacters(String input){
        if (input.isEmpty()){
            return true;
        }
        StringBuilder sb = new StringBuilder(input.toLowerCase());
        for (int i = 0; i < sb.length(); i++){
            char currentChar = sb.charAt(i);
            for (int j = i+1; j<sb.length(); j++){
                if (currentChar == sb.charAt(j)){
                    return false;
                }
            }

        }return true;
    }

}
