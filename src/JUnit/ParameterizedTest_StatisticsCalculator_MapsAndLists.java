//package JUnit;
//
//public class ParameterizedTest_StatisticsCalculator_MapsAndLists {
//    import java.util.*;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class StatisticalCalculator {
//        public static Map<String, Double> calculateStatistics(List<Double> data) {
//            if (data == null || data.size()==0) {
//                Map<String, Double> errorResult = new HashMap<>();
//                errorResult.put("Error", -1.0); // Use a sentinel value for error
//                return errorResult;
//            }
//
//            Map<String, Double> result = new HashMap<>();
//            if (data.size() == 6) {
//                Collections.sort(data);
//                result.put("average", calculateAverage(data));
//                result.put("q2", calculateMedian(data));
//                result.put("q3", calculateThirdQuartile(data));
//            } else {
//                result.put("Error", -1.0); // Use a sentinel value for error
//                if (data.size() < 6) {
//                    result.put("Low number of inputs", -1.0);
//                } else {
//                    result.put("High number of inputs", -1.0);
//                }
//            }
//
//            return result;
//        }
//
//        public static double calculateAverage(List<Double> data) {
//            double sum = 0;
//            for (Double value : data) {
//                sum += value;
//            }
//            return sum / data.size();
//        }
//
//        public static double calculateMedian(List<Double> data) {
//            int middle = data.size() / 2;
//            if (data.size() % 2 == 0) {
//                double mid1 = data.get(middle - 1);
//                double mid2 = data.get(middle);
//                return (mid1 + mid2) / 2.0;
//            } else {
//                return data.get(middle);
//            }
//        }
//
//        public static double calculateThirdQuartile(List<Double> data) {
//            int size = data.size();
//            int index = size * 3 / 4;
//            if (size % 4 == 0) {
//                return (data.get(index - 1) + data.get(index)) / 2.0;
//            } else {
//                return data.get(index);
//            }
//        }
//    }
//
//    class MainTest {
//        StatisticalCalculator one = new StatisticalCalculator();
//        @ParameterizedTest
//        @ValueSource(strings = {"1.234,2.567,3.789,4.123,5.456,6.789", "10.987,20.456,30.789,40.123,50.567,60.890"})
//        public void testCalculateStatistics_Positive(String dataString){
//            String[]StringArray = dataString.split(",");
//            List<Double>data = new ArrayList<>();
//            for(String currentString : StringArray){
//                data.add(Double.parseDouble(currentString));
//            }
//            Map<String, Double> expectedMap = new HashMap<>();
//            expectedMap.put("average", one.calculateAverage(data));
//            expectedMap.put("q2", one.calculateMedian(data));
//            expectedMap.put("q3", one.calculateThirdQuartile(data));
//            Map<String, Double>actualMap = one.calculateStatistics(data);
//            assertEquals(expectedMap, actualMap);
//        }
//        @ParameterizedTest
//        @ValueSource(strings = {"1.234,2.567,3.789,4.123", "1.234,2.567,3.789,4.123,5.456,6.789,7.123", ""})
//        public void testCalculateStatistics_Negative(String dataString) {
//            // Check if the input data is an empty string
//            if (dataString.isEmpty()) {
//                Map<String, Double> actualMap = one.calculateStatistics(new ArrayList<>());
//                double errorValue = -1.0;
//                assertEquals(errorValue, actualMap.get("Error"));
//            } else {
//                String[] stringArray = dataString.split(",");
//                List<Double> data = new ArrayList<>();
//                for (String currentString : stringArray) {
//                    data.add(Double.parseDouble(currentString));
//                }
//
//                Map<String, Double> actualMap = one.calculateStatistics(data);
//                double errorValue = -1.0;
//
//                // Check if the result matches the expected error value for different input data lengths
//                if (stringArray.length < 6) {
//                    assertEquals(errorValue, actualMap.get("Low number of inputs"));
//                } else if (stringArray.length > 6) {
//                    assertEquals(errorValue, actualMap.get("High number of inputs"));
//                }
//
//                // In any case, there should be an "Error" entry with the error value
//                assertEquals(errorValue, actualMap.get("Error"));
//            }
//        }
//    }
//}
