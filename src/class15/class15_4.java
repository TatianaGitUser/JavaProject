package class15;

public class class15_4 {
    public static void main(String[] args) {
        String country = "USA";
        String state = "California";

        switch (country){
            case "USA":
                switch (state){
                    case "California":
                     System.out.println("Tax is 15%");
                     break;
                    case "New York":
                        System.out.println("Tax is 16%");
                    break;
                }
                break;
        }
    }
}
