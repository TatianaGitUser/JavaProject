package Class22;

public class HomeWork_Remainder_Is_3 {
    public static void main(String[] args) {
        int result = findRemainder(445);
        System.out.println(result);

    }
    public static int findRemainder(int input){
        int start=1;
        int result =1;
        while (start<=input){
            start++;
            if (input<=0||input==1){
                result = 1;
            }else if(input%start==3){
                result = start;
                break;

            }else{
                result = 1;
            }
        }return result;
    }

}
