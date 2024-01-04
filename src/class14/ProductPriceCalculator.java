package class14;

import java.util.Scanner;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the product:");
        double quantity = sc.nextDouble();
        double uSACost;
        double canadaCost;
        double otherCost;

        if (quantity <= 0){
            System.out.println("Quantity cannot be 0 or less");
        }
        else if(quantity<100){
            System.out.println("Enter the location of the customer (USA/Canada/Other):");
            sc.nextLine();
            String location = sc.nextLine();
            if (location.equals("USA")){
                uSACost = 2.50;
                double totalUSA = uSACost*quantity;
                System.out.println("The total cost of the product is: $"+totalUSA);
            }else if (location.equals("Canada")){
                canadaCost = 3.00;
                double totalCanada = canadaCost*quantity;
                System.out.println("The total cost of the product is: $"+totalCanada);
            }else if(location.equals("Other")){
                otherCost = 3.50;
                double totalOther = otherCost*quantity;
                System.out.println("The total cost of the product is: $"+totalOther);

            }
        }
        else if(quantity>=100){
            System.out.println("Enter the location of the customer (USA/Canada/Other):");
            sc.nextLine();
            String location = sc.nextLine();
            if (location.equals("USA")){
                uSACost = 2.00;
                double totalUSA = uSACost*quantity;
                System.out.println("The total cost of the product is: $"+totalUSA);
            }else if (location.equals("Canada")){
                canadaCost = 2.50;
                double totalCanada = canadaCost*quantity;
                System.out.println("The total cost of the product is: $"+totalCanada);
            }else if (location.equals("Other")){
                otherCost = 3.00;
                double totalOther = otherCost*quantity;
                System.out.println("The total cost of the product is: $"+totalOther);
            }else{
                System.out.println("Invalid location");
            }
        }

        sc.close();
    }
}