package Class25Arrays;

public class HW_2_SimpleArrayCalculation {
    public static void main(String[] args) {
        int [] input = {5,12,566,-99,20,-1};
        System.out.println(calculateArray(input));
        System.out.println(subtractFromArray(input));
        powerOfTwo(input);
        System.out.println(printFirstElement(input));
    }
    public static int calculateArray(int[] input){
        if (input.length<=1){
            return 1;
        }
        int length = input.length;
        int sum = input[0]+input[length-1];
        return sum;
    }
    public static int subtractFromArray(int[]input){
        if (input.length<=1 || input[0] == input[1]){
            return 777;
        }int result = 0;
        if(input[0]>input[1]){
            result = input[0]-input[1];
        }else if(input[1]>input[0]){
            result = input[1]-input[0];
        }return result;
    }
    public static void powerOfTwo(int [] input){
        if (input.length<=2){
            System.out.println("Not enough data");
        }
        else if (input[0]*input[0]>=input[1]+input[2]){
            System.out.println("First is the greatest");
        }else {
            System.out.println("There is no power in first");
        }
    }
    public static int printFirstElement(int[]input){
        if (input[0]>0){
            return input[0];
        }else{
            return 0;
        }
    }
}
