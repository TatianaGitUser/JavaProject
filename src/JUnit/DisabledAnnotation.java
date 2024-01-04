//package JUnit;
//
//public class DisabledAnnotation {
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Disabled;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class WaterPercentageCalculator {
//        public double calculateWaterPercentage(double waterWeight, double totalWeight, String gender, int age, String profession) {
//            if (totalWeight <= 0 || waterWeight < 0 || age <= 0) {
//                return -1.0; // Sentinel value for invalid input
//            }
//
//            double percentage;
//
//            if (gender.equals("Female") && age >= 18 && age <= 50 && !profession.equals("Athlete")) {
//                // Bug: Incorrect formula for females between 18 and 50 who are not athletes
//                percentage = (waterWeight / totalWeight) * 120;
//            } else {
//                // Correct formula for other cases
//                percentage = (waterWeight / totalWeight) * 100;
//            }
//
//            return percentage;
//        }
//    }
//
//    class MainTest {
//        private WaterPercentageCalculator calculator = new WaterPercentageCalculator();
//        @Test
//        public void testCalculateWaterPercentage_ValidInput_1(){
//            double percentage = calculator.calculateWaterPercentage(2.0, 70.3, "Female", 24, "Athlete");
//            assertEquals(2.844950213371266, percentage);
//        }
//        @Test
//        public void testCalculateWaterPercentage_InvalidInput_NegativeWaterWeight(){
//            double percentage = calculator.calculateWaterPercentage(-2.0, 70.3, "Female", 24, "Athlete");
//            assertEquals(-1.0, percentage);
//        }
//        @Disabled("public void MainTest.testCalculateWaterPercentage_ValidInput_2() is @Disabled")
//        @Test
//        public void testCalculateWaterPercentage_ValidInput_2(){
//            double percentage = calculator.calculateWaterPercentage(2.0, 70.3, "Female", 24, "Manager");
//            assertEquals(2.844950213371266, percentage);
//        }
//    }
//}
