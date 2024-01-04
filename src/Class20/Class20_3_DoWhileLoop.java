package Class20;

import java.util.Scanner;

public class Class20_3_DoWhileLoop {
    public static void main(String[] args) {
//        write a prog that takes username and password from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your username");
        String username = sc.nextLine();

        System.out.println("Please, enter your password");
        String password = sc.nextLine();
        if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")){
            System.out.println("Invalid credentials");
        }

        while (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {
            System.out.println("Please, enter your username");
            username = sc.nextLine();

            System.out.println("Please, enter your password");
            password = sc.nextLine();
            if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {
                System.out.println("Invalid credentials");
            }
        }    System.out.println("Welcome "+ username);

}}