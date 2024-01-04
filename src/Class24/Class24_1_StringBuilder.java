package Class24;

import java.util.Scanner;

public class Class24_1_StringBuilder {
    public static void main(String[] args) {

//        create a data base of user info
//        name, age, phone number

        Scanner sc = new Scanner(System.in);
StringBuilder dB = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your name:");
            String userName = sc.nextLine();

            System.out.println("Enter your age:");
            String age = sc.nextLine();

            System.out.println("Enter your phone number:");
            String phoneNumber = sc.nextLine();

            dB.append(userName).append(", ").append(age).append(", ").append(phoneNumber);

        }
        System.out.println(dB);
    }
}