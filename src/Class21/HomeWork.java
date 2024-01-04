package Class21;
import java.util.Scanner;

public class HomeWork {
    public static void main(String args[]) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: \nResult: ");
        int input = sc.nextInt();

        if (input >= 0 && input < 26) {
            char letter = 'a'; // Start with 'a'
            for (int i = 0; i < input; i++) {
                System.out.print(letter);
                letter++; // Increment the letter
            }
        } else {
            System.out.println("Error! Invalid number");
        }

      System.out.println("====================");
//7.17.1 Sum of numbers *
        int input1 = sc.nextInt();
        System.out.println("Enter a number:");

        if (input1>0){
            int sum = 1;
            for (int i = 1; i < input1; i++){
                sum +=i;
                sum++;
            }System.out.println("The sum of all positive numbers preceding " + input1+ " inclusively is "+ sum);
        }else if(input1 == 0){
            System.out.println("The sum of all positive numbers preceding " + input1+ " inclusively is "+ input);
        }else{
            System.out.println("Error! Invalid number");

        }

    }

}
