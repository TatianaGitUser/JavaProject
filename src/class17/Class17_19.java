package class17;

public class Class17_19 {
    public static void main(String[] args) {
        double tax = calculateTax(90000, true);
        System.out.println(tax);
    }

    public static double calculateTax(double salary, boolean isMarried) {
        if (salary < 100000 && isMarried) {
            return salary * 0.05;
        } else if (salary < 100000 && !isMarried) {
            return salary * 0.08;
        } else if (salary >= 100000 && isMarried) {
            return salary * 0.1;
        } else if (salary >= 100000 && !isMarried) {
            return salary * 0.15;
        } else {
            return 0;
        }
    }
}

