package class16;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class class16_1 {
    public static void main(String[] args) {
        String country = "Canada";
        String state = "Quebec";
        switch (country) {
            case "USA":
                switch (state) {
                    case "California":
                    case "Washington":
                    case "Arizona":
                        System.out.println("20% tax");
                        break;
                    case "Illinois":
                    case "New York":
                        System.out.println("15% tax");
                        break;
                    case "Florida":
                    case "Texas":
                        System.out.println("10% tax");
                        break;
                }
                break;
            case "Canada":
                switch (state) {
                    case "Ontario":
                    case "Quebec":
                        System.out.println("10% tax");
                        break;
                    case "Alberta":
                        System.out.println("12% tax");
                        break;
                }
                break;
            default:
                System.out.println("Unsupported country");
        }
    }
}
