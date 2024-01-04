package class14;

import java.util.Scanner;

public class Class14_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DevX Restaurant!");
        System.out.println("Please, choose one of the following options:");
        System.out.println("1. Appetizers");
        System.out.println("2. Main Course");

        String firstOption = sc.nextLine();
        if (firstOption.equals("1")||firstOption.equals("Appetizers")) {
            System.out.println("1.Spring rolls\n2.Egg rolls");
            String appChoice = sc.nextLine();
            if (appChoice.equals("Spring rolls")||appChoice.equals("1")) {
                System.out.println("Your spring rolls are being prepared");
            } else if (appChoice.equals("2")||appChoice.equals("Egg Rolls")) {
                System.out.println("Your egg rolls are being prepared");
            } else {
                System.out.println("Invalid input. Please, try again");
            }
        } else if (firstOption.equals("2")||firstOption.equals("Main Course")) {
            System.out.println("1.NY rib-eye\n2.Chicken curry");
           String mainCourse = sc.nextLine();
            if (mainCourse.equals("1")||mainCourse.equals("NY rib-eye")) {
                System.out.println("Your NY rib-eye is being prepared");
            } else if (mainCourse.equals("2")||mainCourse.equals("Chicken curry")) {
                System.out.println("Your chicken curry is being prepared");
            } else {
                System.out.println("Invalid input");
            }
        }else{
                System.out.println("Invalid option, only Appetizers and Main Courses are available");
            }
    }
}