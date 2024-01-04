package class17;

public class Class17_8 {
    public static void main(String[] args) {
        double var = work();
        System.out.println(var);
        double tax = calculateTax();
    System.out.println(tax);
    }
    public static double work() {
        return 1.0;
    }
    public static double calculateTax(){
        double salary = 100000;
        double tax = 0.1;
        return salary*tax;
    }
}
