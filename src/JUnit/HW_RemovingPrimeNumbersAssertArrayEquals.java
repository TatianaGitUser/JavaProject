//package JUnit;
//
//public class HW_RemovingPrimeNumbersAssertArrayEquals {
//    import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class PrimeNumberRemovalTest {
//
//        // Method to remove prime numbers from the array
//        public static int[] removePrimeNumbers(int[] inputArray) {
//            if (inputArray == null) {
//                return null;
//            }
//
//            if (inputArray.length < 3) {
//                // If the array length is less than 3, return the first 5 prime numbers
//                return getFirstFivePrimes();
//            }
//
//            // Create a new array to store non-prime numbers
//            int[] resultArray = new int[inputArray.length];
//            int resultSize = 0;
//
//            for (int num : inputArray) {
//                if (!isPrime(num)) {
//                    resultArray[resultSize] = num;
//                    resultSize++;
//                }
//            }
//
//            // Resize the resultArray to match the number of non-prime elements
//            return resizeArray(resultArray, resultSize);
//        }
//
//        // Helper method to check if a number is prime
//        private static boolean isPrime(int num) {
//            if (num <= 1) {
//                return false;
//            }
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//        // Helper method to get the first 5 prime numbers starting from 0
//        private static int[] getFirstFivePrimes() {
//            int[] primes = new int[]{2, 3, 5, 7, 11}; // First 5 prime numbers
//            return primes;
//        }
//
//        // Helper method to resize an array to a specified size
//        private static int[] resizeArray(int[] array, int newSize) {
//            int[] newArray = new int[newSize];
//            System.arraycopy(array, 0, newArray, 0, newSize);
//            return newArray;
//        }
//    }
//
//    class MainTest{
//        @Test
//        public void testRemovePrimeNumbersWithPrimeNumbers(){
//            PrimeNumberRemovalTest one = new PrimeNumberRemovalTest();
//            int [] someNums = {1, 2, 3, 4, 5, 6, 7};
//            int [] expected = {1, 4, 6};
//            int[] result = one.removePrimeNumbers(someNums);
//            assertArrayEquals(expected, result);
//        }
//        @Test
//        public void testRemovePrimeNumbersWithNullInput(){
//            PrimeNumberRemovalTest one = new PrimeNumberRemovalTest();
//            int [] someNums = null;
//
//            int[] result = one.removePrimeNumbers(someNums);
//            assertNull(result);
//        }
//        @Test
//        public void testRemovePrimeNumbersWithShortArray(){
//            PrimeNumberRemovalTest one = new PrimeNumberRemovalTest();
//            int [] someNums = {1, 2,};
//            int[] result = one.removePrimeNumbers(someNums);
//            int [] expected = {2, 3, 5, 7, 11};
//            assertArrayEquals(expected, result);
//        }
//        @Test
//        public void testRemovePrimeNumbersWithEmptyArray(){
//            PrimeNumberRemovalTest one = new PrimeNumberRemovalTest();
//            int [] someNums = new int[0];
//            int[] result = one.removePrimeNumbers(someNums);
//            int [] expected = {2, 3, 5, 7, 11};
//            assertArrayEquals(expected, result);
//        }
//    }
//
//}
