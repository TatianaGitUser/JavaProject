package Class25Arrays;

public class HW_TotalOfGroceries {
    public static void main(String[] args) {
double []costs = {20.0, 3.2, 9.7, 8.79};
int [] quantity = {2, 3, 0, 1};
String [] names = {"apples", "bananas", "oranges", "strawberries"};
System.out.println(calculateTotalCost(quantity, names, costs));
System.out.println(calculateTotalCost1(quantity, names, costs));

    }

    public static double calculateTotalCost(int[] quantity, String[] names, double[] costs) {
        if (quantity.length != names.length || quantity.length != costs.length) {
            return -1.0; // Return -1 if the arrays have different lengths
        }

        double totalCost = 0.0;

        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] < 0 || costs[i] < 0) {
                return 0.0; // Return 0 if quantity or cost is negative
            }

            totalCost += quantity[i] * costs[i];
        }

        return totalCost;
    }
    public static double calculateTotalCost1(int[] quantity, String[] names, double[] costs) {
        if (quantity.length != names.length || quantity.length != costs.length) {
            return -1.0; // Return -1 if the arrays have different lengths
        }

        double totalCost = 0.0;

        for (int i = 0; i < quantity.length; i++) {
            if (quantity[i] < 0 || costs[i] < 0) {
                return -1.0;
            }
            if (names[i].length() % 2 == 0){
                totalCost += quantity[i] * costs[i];
            }
        }
        return totalCost;
    }

}