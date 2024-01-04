//package JUnit;
//
//public class DisolayName_assertThrowsException {
//    import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.DisplayName;
//
//    class Calculator {
//
//        public static int add(int a, int b) {
//            return a + b;
//        }
//
//        public static int subtract(int a, int b) {
//            return a - b;
//        }
//
//        public static int multiply(int a, int b) {
//            return a * b;
//        }
//
//        public static double divide(int a, int b) {
//            if (b == 0) {
//                throw new ArithmeticException("Cannot divide by zero.");
//            }
//            return (double) a / b;
//        }
//    }
//
//    class MainTest {
//        @DisplayName ("Test addition of two positive numbers")
//        @Test
//        void testAddition() {
//            int result = Calculator.add(2, 3);
//            assertEquals(5, result, "Addition of 2 and 3 should be 5");
//        }
//        @DisplayName ("Test subtraction of two positive numbers")
//        @Test
//        void testSubtraction() {
//            int result = Calculator.subtract(10, 5);
//            assertEquals(5, result, "Subtraction of 10 and 5 should be 5");
//        }
//        @DisplayName ("Test multiplication of two positive numbers")
//        @Test
//        void testMultiplication() {
//            int result = Calculator.multiply(2, 3);
//            assertEquals(6, result, "Multiplication of 2 and 3 should be 6");
//        }
//        @DisplayName ("Test Division of two positive numbers")
//        @Test
//        void testDivision() {
//            double result = Calculator.divide(10, 2);
//            assertEquals(5.0, result, "Test Division of two positive numbers");
//
//            // Verify division by zero behavior
//            assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
//        }
//    }
//}
