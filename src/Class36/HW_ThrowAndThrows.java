package Class36;
import java.util.Scanner;

public class HW_ThrowAndThrows {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int result1 = calculator.divide(10, 5);
            System.out.println("Result1: " + result1);
            int result2 = calculator.divide(10, 0);
            System.out.println("Result2: " + result2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
            Scanner scanner = new Scanner(System.in);
            AgeVerifier ageVerifier = new AgeVerifier();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            try {
                ageVerifier.verifyAge(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

class Calculator{
    public static int divide(int dividend, int divisor)throws ArithmeticException{

        if(divisor == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        } int result = dividend/divisor;
        return result;
    }
}
class AgeVerifier {
    public static void verifyAge(int age)throws IllegalArgumentException{
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else if(age<18){
            throw new IllegalArgumentException("Age must be at least 18");
        }else{
            System.out.println("Age verification successful");
        }
    }
}