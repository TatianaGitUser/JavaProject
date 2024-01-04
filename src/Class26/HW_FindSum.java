package Class26;

public class HW_FindSum {
    public static void main(String[] args) {
double[]input = {12.5, 9.99, 0.01, -98.01, 5.45};
double num = 8.99;
System.out.println(calculateSum(input, num));
    }
    public static double calculateSum(double []input, double num){
        if (input.length == 0){
            return 0.0;
        }
        double sum = 0.0;
        for (double input1 : input){

            if (input1 > num){
                sum +=input1;
            }else{
                sum-=input1;
            }
        }return sum;
    }

}
