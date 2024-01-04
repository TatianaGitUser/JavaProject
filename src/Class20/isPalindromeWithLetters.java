package Class20;

public class isPalindromeWithLetters {
    public static void main(String[] args) {
        String input = "madam";
System.out.println(isPalindrome(input));
    }
    public static boolean isPalindrome(String input){
        char left = input.charAt(0);
        char right = input.charAt(input.length()-1);
        while (left<right){
            if (left != right){
                return false;
            }else{
                left++;
                right--;
            }

        }return true;
    }
}
