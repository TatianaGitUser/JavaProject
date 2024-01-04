package Class36;

import java.util.ArrayList;
import java.util.List;

public class HW_ObjectInMethod {
    public static void main(String[] args) {
        Object obj = new Object();
        performObjectOperations(obj);

    }

    public static void performObjectOperations(Object obj) {
        try {
            Integer integerValue = (Integer) obj;
            int result = integerValue / 0;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException - Division by zero.");
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException - Object is null.");
        } catch (ClassCastException e) {
            System.out.println("Error: ClassCastException - Invalid type casting.");
        }
    }
}