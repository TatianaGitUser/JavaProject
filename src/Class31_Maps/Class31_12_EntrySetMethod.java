package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_12_EntrySetMethod {
    public static void main(String[] args) {

//        map.entrySet();
//       Map.Entry<String, String> entry = Map<String, String>

        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        for(Map.Entry<Integer, String> var : countryCodesEU.entrySet()){
           System.out.println(var.getKey());
           System.out.println(var.getValue());
        }
    }
}
