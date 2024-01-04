//package JUnit;
//import org.junit.jupiter.api.Test;
//import java.util.Map;
//import java.util.HashMap;
//import java.util.TreeMap;
//import java.util.LinkedHashMap;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//public class AssertEquals_Maps {
//}
//class MainTest{
//    @Test
//    public void testMaps(){
//        Map<String, Integer>expectedMap = new HashMap<>();
//        expectedMap.put("A", 1);
//        expectedMap.put("B", 2);
//
//        Map<String, Integer> actualResultMap = new HashMap<>();
//        actualResultMap.put("A", 1);
//        actualResultMap.put("B", 2);
//
//        assertEquals(expectedMap, actualResultMap, "Maps are not equal");
//    }
//    @Test
//    public void testMapsFail(){
//        Map<String, Integer>expectedMap = new HashMap<>();
//        expectedMap.put("A", 1);
//        expectedMap.put("B", 2);
//
//        Map<String, Integer> actualResultMap = new HashMap<>();
//        actualResultMap.put("A", 1);
//
//        assertEquals(expectedMap, actualResultMap, "Maps are not equal");
//    }
//    @Test
//    public void testMapsFailUnordered(){
//        Map<String, Integer>expectedMap = new HashMap<>();
//        expectedMap.put("A", 1);
//        expectedMap.put("B", 2);
//// when checking for hashMap- the order doesn't matter
//        Map<String, Integer> actualResultMap = new HashMap<>();
//        actualResultMap.put("B", 2);
//        actualResultMap.put("A", 1);
//
//        assertEquals(expectedMap, actualResultMap, "Maps are not equal");
//    }
//    @Test
//    public void testMapsFailUnorderedTreeMap(){
//        Map<String, Integer>expectedMap = new TreeMap<>();
//        expectedMap.put("A", 1);
//        expectedMap.put("B", 2);
//// with Maps order doesnt matter
//        Map<String, Integer> actualResultMap = new TreeMap<>();
//        actualResultMap.put("B", 2);
//        actualResultMap.put("A", 1);
//
//        assertEquals(expectedMap, actualResultMap, "Maps are not equal");
//    }
//    @Test
//    public void testMapsFailUnorderedLinkedHashMap(){
//        Map<String, Integer>expectedMap = new LinkedHashMap<>();
//        expectedMap.put("A", 1);
//        expectedMap.put("B", 2);
//// with Maps order doesnt matter
//        Map<String, Integer> actualResultMap = new LinkedHashMap<>();
//        actualResultMap.put("B", 2);
//        actualResultMap.put("A", 1);
//
//        assertEquals(expectedMap, actualResultMap, "Maps are not equal");
//    }
//}