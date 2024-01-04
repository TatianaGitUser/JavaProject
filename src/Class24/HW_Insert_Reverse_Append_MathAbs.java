package Class24;

public class HW_Insert_Reverse_Append_MathAbs {
    public static void main(String[] args) {
      System.out.println(manipulateString("Tanya is getting a hold of Java", 7));
    }
    public static StringBuilder manipulateString(String sentence, int num){

        StringBuilder newString = new StringBuilder(sentence);
        StringBuilder newString2 = new StringBuilder("");
        if(num<0){
            num = Math.abs(num);
            newString2.append(num);
            for (int i = newString.length()-1; i>=0; i--){
                char letter = newString.charAt(i);

                newString2.append(letter);
            }
        } else if(num>0){
            String withoutSpaces = newString.toString().replaceAll(" ", "");
            newString2.append(withoutSpaces).append(num);
        }else{
            newString2 = newString;
        }
        if(newString == newString2){
            newString2.append(num);

        }return newString2;
    }
}
