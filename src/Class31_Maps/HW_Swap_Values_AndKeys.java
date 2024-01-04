package Class31_Maps;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class HW_Swap_Values_AndKeys {
    public static void main(String[] args) {
        Map<String, Integer>input = new TreeMap<>();
        input.put("apple", 1);
        input.put("banana", 2);
        input.put("cherry", 3);
       System.out.println(swapKeysAndValues((TreeMap<String, Integer>) input));
    }
    public static List<Map<?,?>>swapKeysAndValues(TreeMap<String, Integer>input){
        List<Map<?,?>> result = new ArrayList<>();
        Map<Integer, String>reverse = new TreeMap<>();
        for(Map.Entry<String, Integer> entry : input.entrySet()){
            reverse.put(entry.getValue(), entry.getKey());
        }
        result.add(input);
        result.add(reverse);

        return result;
    }
}
