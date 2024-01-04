package Class36;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HW_Exception_ZeroDivision {
    public static void main(String[] args) {
System.out.println(divideNums(4, 2));
boolean [] array = {true, false, true};
int b = 2;
System.out.println(retrieveElement(array, 3));
System.out.println(retrieveElement(array, b));
Scanner scanner = new Scanner(System.in);
System.out.println(readNextElement(scanner));
    }
    public static int divideNums(int a, int b) {
        try {
            int result = a / b; // Perform the division
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred.");
            return 0; // Return a default value or handle the exception as needed
        }
    }
    public static boolean retrieveElement(boolean[]array, int index){
        try{
            return array[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index out of bounds.");
            return false;
        }
    }
    public static String readNextElement(Scanner scanner){
        try{
            return scanner.next();
        }catch(NoSuchElementException e){
            System.out.println("Error: No more elements to read.");
            return "";
        }
    }

}
