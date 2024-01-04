package class19;

import java.util.Scanner;

public class Class19_WhileLoop_WithString {
    public static void main(String[] args) {
//        write a prog that prints out "Happy career and life" as many times as user wants to
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see this message?");

        String answer = sc.nextLine();
        while (answer.equalsIgnoreCase("yes")) {

        }
        System.out.println("Happy Career and Life!");
            System.out.println("Do you want to see this message?");
            answer = sc.nextLine();


            System.out.println("Please, enter your name:");
            String answer1 = sc.nextLine();

            if (answer1.equals(answer1.trim())){
                System.out.println("Welcome, "+answer1+"!");
            }else{
                while (answer1.equals("")){
                    System.out.println("Invalid input. Please, enter your name:");
                    answer1 = sc.nextLine();
                }
            }

        }
    }

