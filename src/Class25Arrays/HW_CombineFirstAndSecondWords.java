package Class25Arrays;

public class HW_CombineFirstAndSecondWords {
    public static void main(String[] args) {
String []input = {"Wedevx", "chars", " ", "123456789", "0"};
int n = 3;
System.out.println(combineWords(input, n));
    }
    public static String combineWords(String []input, int n){
        String result = "";
        if (input.length == 0){
            result = "Array is empty";
        }
        else if (n<0){
            result = "N is not positive";
        }
        else if (input[0].length() == input[1].length()){
            result = "Both are equal";
        }
        else{
            int i = 1;
            if (input[0].length()>input[1].length()){
                while (i<=n){
                    result =  result.concat(input[0]);
                    i++;
                }result = result.concat(input[1]);
            } else if(input[1].length()>input[0].length()){
                while (i<=n){
                    result = result.concat(input[1]);
                    i++;
                }result  = result.concat(input[0]);
            }
        }return result;
    }
}
