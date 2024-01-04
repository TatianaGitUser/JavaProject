package Class21;

public class HomeWork_ReplaceVowels {
    public static void main(String[] args) {
String result1 = replaceVowels("Hello world!");
System.out.println(result1);
    }
    public static String replaceVowels(String characters){
        String result = ""; /*always create new string, old one is immutable, can not be dereferenced*/
        for (int index = 0; index<=characters.length()-1; index++){
            char currentChar = characters.charAt(index);
            switch(currentChar){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'o':
                case 'O':
                case 'i':
                case 'I':
                case 'u':
                case 'U':

                    result +="*";
                    break;
                default:
                    result += currentChar;
            }
        }
        return result;
    }

}
