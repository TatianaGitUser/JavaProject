package Class29_ArrayList;
import java.util.List;
import java.util.ArrayList;
public class HW_FirstVowel_LastConsonant {
    public static void main(String[] args) {
        String str = "Hello, my name is Tanya";
        System.out.println(lastVowelAndConsonant(str));
    }
    public static List<Character>  lastVowelAndConsonant(String str){
        List<Character> resultList = new ArrayList<>();
        if(str.length()<=1|| Character.isDigit(str.charAt(0))){
            return new ArrayList<>();
        }
        char lastConsonant = ' ';
        int num = 0;
        int num2 = str.length()-1;
        char firstVowel = ' ';
        while(num<str.length()){
            if(str.charAt(num)=='a'||str.charAt(num)=='A'||str.charAt(num)=='e'||str.charAt(num)=='E'||
                    str.charAt(num)=='o'||str.charAt(num)=='O'||str.charAt(num)=='u'||str.charAt(num)=='U'||
                    str.charAt(num)=='i'||str.charAt(num)=='I'){
                firstVowel = str.charAt(num);
                break;
            }else{
                num++;
            }
        }
        while (num2>0){
            if(str.charAt(num2)=='a'||str.charAt(num2)=='A'||str.charAt(num2)=='e'||str.charAt(num2)=='E'||
                    str.charAt(num2)=='o'||str.charAt(num2)=='O'||str.charAt(num2)=='u'||str.charAt(num2)=='U'||
                    str.charAt(num2)=='i'||str.charAt(num2)=='I'){
                num2--;
            }else{
                lastConsonant = str.charAt(num2);
                break;
            }
        }
        resultList.add(firstVowel);
        resultList.add(lastConsonant);
        return resultList;
    }
}
