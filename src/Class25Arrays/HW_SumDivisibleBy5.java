package Class25Arrays;

public class HW_SumDivisibleBy5 {
    public static void main(String[] args) {
        int [] input = {5, 12, 566, -99, 20, -1};
        System.out.println(isSumOfEvenDivisibleByFive(input));
    }
    public static boolean isSumOfEvenDivisibleByFive(int[]input){
        int sum = 0;
        if (input.length == 0){
            return false;
        }else{

            for (int i = 0; i<input.length; i++){
                int currentNum = input[i];

                if (currentNum%2 == 0){
                    sum+=currentNum;
                }
            } if (sum%5 == 0){
                return true;
            }
        }return false;
    }

}
