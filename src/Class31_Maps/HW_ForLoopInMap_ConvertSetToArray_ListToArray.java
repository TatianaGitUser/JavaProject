package Class31_Maps;
import java.util.*;

public class HW_ForLoopInMap_ConvertSetToArray_ListToArray {
    public static void main(String[] args) {
        Map<String, Integer> input  = new HashMap<>();
        input.put("apple", 5);
        input.put("banana", 10);
        input.put("cherry", 15);
        input.put("dog", 8);
        input.put("elephant", 20);
        Double dividion = 5.8;
        System.out.println(Arrays.asList(getKeysGreaterThanDivision(input, dividion)));
        Double division1 = 0.0;
        System.out.println(Arrays.asList(getKeysGreaterThanDivision(input, division1)));
    }
    public static String[] getKeysGreaterThanDivision(Map<String, Integer> input, Double division){
        int sum = 0;
        if(division == 0.0){
            Set<String> median1 = input.keySet();
            String[] array = new String[median1.size()];
            return median1.toArray(array);
        }
        List <String> median = new ArrayList<>();
        for(int i : input.values()){
            sum +=i;
        }
        double afterDivision = sum/division;
        for(Map.Entry<String, Integer> entry: input.entrySet()){
            if(entry.getValue()> afterDivision){
                median.add(entry.getKey());
            }
        }
        String[] result = median.toArray(new String[median.size()]);

        return result;
    }

}
