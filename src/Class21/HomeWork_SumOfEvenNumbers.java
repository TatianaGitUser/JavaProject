package Class21;

public class HomeWork_SumOfEvenNumbers {
    public static void main(String[]args){
    int num1 = 5;
    int num2 = -20;

     int sum1 = sumOfEvenNumbers(num1, num2);
System.out.println(sum1);
}
    public static int sumOfEvenNumbers(int num1, int num2){

        int sum = 0;
        if(num1 > num2){
            int container = num1;
            num1 = num2;
            num2=container;
        }
        for(int counter = num1+1;counter<num2;counter++){
            if(counter%2==0){
                sum+=counter;
            }
            //  ("The sum of even numbers between " + num1 + " and " + num2 + " is" + sum);
        } return sum;
    }
}