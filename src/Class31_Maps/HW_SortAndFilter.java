package Class31_Maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class HW_SortAndFilter {
    public static void main(String[] args) {
        Map<String, List<Integer>> input = new LinkedHashMap<>();
input.put("first", Arrays.asList(5, 10, 15, 20, 25));
input.put("second", Arrays.asList(3, 6, 9, 12, 15));
input.put("third", Arrays.asList(8, 16, 24, 32, 40));
System.out.println(sortAndFilterMap(input));
    }

    public static Map<String, List<Integer>>sortAndFilterMap(Map<String, List<Integer>>input){

        Map<String, List<Integer>> mapDuplicate = new LinkedHashMap<>();
        for(Map.Entry<String, List<Integer>> var : input.entrySet()){
            List<Integer>duplicate = new ArrayList<Integer>();
            String currentString = var.getKey();
            List <Integer> numbers = var.getValue();
            for(Integer num : numbers){
                if(num % 3 != 0){
                    duplicate.add(num);
                }
            }mapDuplicate.put(currentString, duplicate);
        }return mapDuplicate;
    }
}
