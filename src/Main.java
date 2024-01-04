import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the distance of the trip in miles:\nPlease enter the mode of transportation (drive/fly):");
        double distance = sc.nextDouble();
        String transportation = sc.nextLine();
        sc.nextLine();
        String firstClass = sc.nextLine();
        double costOfDriving = distance*0.50;
        double speedOfFlying = distance/500;
        double costOfFlying = 100*speedOfFlying;
        if (transportation.equals("drive")){
            System.out.println("The cost of the trip is $" + costOfDriving);
        }
        sc.close();

        char a = 'a';
        char c = 'a' +4;
        System.out.println(c);

    }
}