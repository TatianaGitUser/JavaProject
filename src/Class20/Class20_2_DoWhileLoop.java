package Class20;

import java.util.Scanner;

public class Class20_2_DoWhileLoop {
    public static void main(String[] args) {
//        write a prog that takes input from user: username and password
//        if username matches "Hello@wedevx.co"
//        and password matches "abs123$$"
//        then say "Welcome"
//        otherwise "invalid enter credentials again"

        Scanner sc = new Scanner(System.in);
String username;
String password;
        do {
            System.out.println("Please, enter your username: ");
            username = sc.nextLine();

            System.out.println("Please, enter your password");
            password = sc.nextLine();

            if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {
                System.out.println("Invalid credentials");
            }
        } while (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$"));

System.out.println("Welcome "+username);
    }
}
