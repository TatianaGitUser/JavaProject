//package JUnit;
//
//public class BeforeAll_AfterAll {
//    import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class LightSpeedCalculator {
//        private double mass;
//        private double acceleration;
//
//        public void setMass(double mass) {
//            this.mass = mass;
//        }
//
//        public void setAcceleration(double acceleration) {
//            this.acceleration = acceleration;
//        }
//
//        public double calculateSpeed() {
//            if (mass <= 0 || acceleration <= 0) {
//                return -1.0; // Sentinel value for invalid input
//            }
//            return Math.sqrt(2 * acceleration * mass);
//        }
//    }
//
//    class DataProvider {
//        private boolean allowModification = false;
//        private double mass;
//        private double acceleration;
//
//        public void enableModification() {
//            allowModification = true;
//        }
//
//        public void disableModification() {
//            allowModification = false;
//        }
//
//        public void createMap(double mass, double acceleration) {
//            if (!allowModification) {
//                throw new IllegalStateException("Modification is not allowed.");
//            }
//            this.mass = mass;
//            this.acceleration = acceleration;
//        }
//
//        public void clearMap() {
//            this.mass = 0;
//            this.acceleration = 0;
//        }
//
//        public double getMass() {
//            return mass;
//        }
//
//        public double getAcceleration() {
//            return acceleration;
//        }
//    }
//
//    class MainTest {
//        private LightSpeedCalculator calculator;
//        private static DataProvider dataProvider;
//        //write your tests here
//        @BeforeAll
//        public static void beforeAll() {
//            dataProvider = new DataProvider();
//            dataProvider.enableModification();
//        }
//
//        @AfterAll
//        public static void afterAll() {
//            dataProvider.disableModification();
//        }
//
//        @BeforeEach
//        public void setUp() {
//            calculator = new LightSpeedCalculator();
//            dataProvider = new DataProvider();
//
//        }
//
//        @AfterEach
//        public void tearDown() {
//            dataProvider.clearMap();
//        }
//        @Test
//        public void testCalculateSpeed_Positive(){
//            calculator.setMass(1.0);
//            calculator.setAcceleration(8.0);
//            assertEquals(4.0, calculator.calculateSpeed());
//        }
//        @Test
//        public void testCalculateSpeed_Negative_InvalidMass(){
//            calculator.setMass(-1.0);
//            calculator.setAcceleration(8.0);
//            assertEquals(-1.0, calculator.calculateSpeed());
//        }
//        @Test
//        public void testCalculateSpeed_Negative_InvalidAcceleration(){
//            calculator.setMass(1.0);
//            calculator.setAcceleration(-8.0);
//            assertEquals(-1.0, calculator.calculateSpeed());
//        }
//        @Test
//        public void testCalculateSpeed_Negative_InvalidMassAndAcceleration(){
//            calculator.setMass(-1.0);
//            calculator.setAcceleration(-8.0);
//            assertEquals(-1.0, calculator.calculateSpeed());
//        }
//    }
//
//}
