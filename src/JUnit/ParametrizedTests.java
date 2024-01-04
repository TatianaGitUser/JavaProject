//package JUnit;
//
//public class ParametrizedTests {
//    Parameterized Tests
//
//    Parameterized tests make it possible to run a test multiple times with different arguments. They are declared just like regular @Test methods but use the @ParameterizedTest annotation instead. In addition, you must declare at least one source that will provide the arguments for each invocation and then consume the arguments in the test method.
//
//    The following example demonstrates a parameterized test that uses the @ValueSource annotation to specify a String array as the source of arguments.
//
//    @ParameterizedTest
//    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
//    void palindromes(String candidate) {
//        assertTrue(StringUtils.isPalindrome(candidate));
//    }
//
//    When executing the above parameterized test method, each invocation will be reported separately. For instance, the ConsoleLauncher will print output similar to the following.
//
//    palindromes(String) ✔
//            ├─ [1] candidate=racecar ✔
//            ├─ [2] candidate=radar ✔
//            └─ [3] candidate=able was I ere I saw elba ✔
//
//            2.16.1. Required Setup
//
//    In order to use parameterized tests you need to add a dependency on the junit-jupiter-params artifact. Please refer to Dependency Metadata for details.
//
//2.16.2. Consuming Arguments
//
//    Parameterized test methods typically consume arguments directly from the configured source (see Sources of Arguments) following a one-to-one correlation between argument source index and method parameter index (see examples in @CsvSource). However, a parameterized test method may also choose to aggregate arguments from the source into a single object passed to the method (see Argument Aggregation). Additional arguments may also be provided by a ParameterResolver (e.g., to obtain an instance of TestInfo, TestReporter, etc.). Specifically, a parameterized test method must declare formal parameters according to the following rules.
//
//    Zero or more indexed arguments must be declared first.
//
//    Zero or more aggregators must be declared next.
//
//    Zero or more arguments supplied by a ParameterResolver must be declared last.
//
//    In this context, an indexed argument is an argument for a given index in the Arguments provided by an ArgumentsProvider that is passed as an argument to the parameterized method at the same index in the method’s formal parameter list. An aggregator is any parameter of type ArgumentsAccessor or any parameter annotated with @AggregateWith.
//
//            AutoCloseable arguments
//
//    Arguments that implement java.lang.AutoCloseable (or java.io.Closeable which extends java.lang.AutoCloseable) will be automatically closed after @AfterEach methods and AfterEachCallback extensions have been called for the current parameterized test invocation.
//
//    To prevent this from happening, set the autoCloseArguments attribute in @ParameterizedTest to false. Specifically, if an argument that implements AutoCloseable is reused for multiple invocations of the same parameterized test method, you must annotate the method with @ParameterizedTest(autoCloseArguments = false) to ensure that the argument is not closed between invocations.
//
//2.16.3. Sources of Arguments
//
//    Out of the box, JUnit Jupiter provides quite a few source annotations. Each of the following subsections provides a brief overview and an example for each of them. Please refer to the Javadoc in the org.junit.jupiter.params.provider package for additional information.
//
//    @ValueSource
//
//    @ValueSource is one of the simplest possible sources. It lets you specify a single array of literal values and can only be used for providing a single argument per parameterized test invocation.
//
//    The following types of literal values are supported by @ValueSource.
//
//    short
//
//    byte
//
//    int
//
//    long
//
//    float
//
//    double
//
//    char
//
//    boolean
//
//    java.lang.String
//
//    java.lang.Class
//
//    For example, the following @ParameterizedTest method will be invoked three times, with the values 1, 2, and 3 respectively.
//
//    @ParameterizedTest
//    @ValueSource(ints = { 1, 2, 3 })
//    void testWithValueSource(int argument) {
//        assertTrue(argument > 0 && argument < 4);
//    }
//}
//**************************************************************************************
//import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.ValueSource;

// class PalindromeChecker{
//   public static boolean isPalindrome(String str){
//     if(str == null){
//       return false;
//     }
//     // Remove non-alphanumeric characters and convert to lowercase
//     String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

//     int left = 0;
//     int right = cleanStr.length()-1;

//     while(left<right){
//       if(cleanStr.charAt(left) != cleanStr.charAt(right)){
//         return false;
//       }
//       left++;
//       right--;
//     }
//     return true;
//   }
// }
// class MainTest{
// @ParameterizedTest
// @ValueSource(strings = {"racecar", "A man, a plan, a canal, Panama!", "RaceCar", "A Santa at NASA"})
// public void testPalindromes(String str){
// Assertions.assertTrue(PalindromeChecker.isPalindrome(str));
// }
//@ParameterizedTest
//@ValueSource(ints = { 1, 2, 3 })
//void testWithValueSource(int argument) {
//        assertTrue(argument > 0 && argument < 4);
//        }
// }
//class PrimeNumberChecker {
//
//    public boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//
//        // We only need to check divisors up to the square root of the number.
//        int sqrt = (int) Math.sqrt(number);
//        for (int i = 2; i <= sqrt; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}

//class MainTest {
//
//    private final PrimeNumberChecker checker = new PrimeNumberChecker();
//
//    @ParameterizedTest
//    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29})
//    public void testIsPrimeWithPrimes(int number) {
//        Assertions.assertTrue(checker.isPrime(number));
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 4, 6, 8, 9, 10, 12, 14, 15, 20})
//    public void testIsPrimeWithNonPrimes(int number) {
//        Assertions.assertFalse(checker.isPrime(number));
//    }
//}