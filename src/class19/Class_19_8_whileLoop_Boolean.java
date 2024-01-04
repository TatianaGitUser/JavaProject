package class19;

import java.util.Scanner;

public class Class_19_8_whileLoop_Boolean {
    public static void main(String[] args) {
//        while loop can and should be used to run loops with undefined number of iterations
//        each loop is called 'iteration'
//        write a prog to print out 'Superstar' as many times as a user wants to
//        i need a user input
//        зациклил answer внутри answer
        Scanner sc = new Scanner(System.in);
        System.out.println("do yo want to see the message? true/false");
        boolean answer = sc.nextBoolean();
        while (answer){
            System.out.println("Superstar");
            System.out.println("do yo want to see the message? true/false");
            answer= sc.nextBoolean();
        }

    }
}
