package Class24;

public class HW_insertPracticeStringBuilder {
    public static void main(String[] args) {
        System.out.println(insertCharacters("hello", '*'));
        System.out.println(insertWords("It is a nice day", "not"));

    }

    public static StringBuilder insertCharacters(String str, char character) {


        StringBuilder newString = new StringBuilder(str);
        if (newString.equals("")) {

            return newString;
        } else {

            for (int i = newString.length() - 1; i >= 1; i--) {
                newString.insert(i, character);
            }

        }return newString;
    }

    public static StringBuilder insertWords(String string, String word){
        StringBuilder newString = new StringBuilder(string);
        if (!newString.toString().contains("is")){
            return newString;
        }else{
            newString.insert(newString.indexOf("is")+3, word+" ");
        }

        return newString;
    }

}
