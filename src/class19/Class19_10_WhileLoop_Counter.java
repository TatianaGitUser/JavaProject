package class19;

import java.util.Scanner;

public class Class19_10_WhileLoop_Counter {
    public static void main(String[] args) {
//        write a prog that will count the number of registered users
//        the prog should ask if we want to register a new user. if yes ->
//        activeUser = 1
//        then ask if register again. keep repeating until answer no
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to register a new user?");
        String answer = sc.nextLine();
       int activeUsers = 0;
        while (answer.equalsIgnoreCase("yes")){

            activeUsers++;
            System.out.println("Do you want to register a new user?");
            answer = sc.nextLine();
        }
        System.out.println("Number of acrive users is "+activeUsers);
    }
}
