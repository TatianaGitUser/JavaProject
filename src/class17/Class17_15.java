package class17;

public class Class17_15 {
    public static void main(String[] args) {
        double result = subtract(100,50);
        System.out.println(result);
        Class17_15 obj = new Class17_15();
        double taxAmount = obj.calculateTax(100000, 10);
        System.out.println(taxAmount);
        double taxAmount2 = obj.calculateTax(500000,15);
        System.out.println(taxAmount2);
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    public double calculateTax(double salary, int percent){
return salary*(percent/100.0);
    }
}
