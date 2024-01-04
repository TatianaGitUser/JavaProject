package Class22;

import java.util.Scanner;

public class Class22_2_Break_2 {
    public static void main(String[] args) {
//        write a prog that takes an int input from the user and validates if an input is
//        a positive num
//        or not. if not - user shoud get "invalid" message and enter a num again
//        if a user enters a positive num we should print that num and stop the program

        Scanner sc = new Scanner(System.in);


        int num = 0;/*you can declare only once*/

        do {
            System.out.println("Please, enter a number");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Invalid number, please try again");
            }

        }while (num < 0) ;
        System.out.println(num);
        System.out.println("------------------");
        int num2 = 0;
        do{
System.out.println("Please, enter a number");
num2 = sc.nextInt();/*2*/
            if (num2<0){
                System.out.println("Invalid number, please try again");
            }else{
                System.out.println(num2);
                break;
            }
        }while(true);
    }
}