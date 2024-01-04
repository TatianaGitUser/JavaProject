package Class31_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class31_10_EntryKeySe_LoopInMap {
    public static void main(String[] args) {
        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        countryCodesEU.keySet();//--- > returns set <Integer> keys = keySet();
Set<Integer>countrycodes = countryCodesEU.keySet();


//        Map<String, String> demomap = new HashMap<>();
//        Set<String> set = demomap.keySet();// returns set of Strings(key from map) and
                                    // populate the set with all the keys you have in map

        System.out.println(countrycodes);

        for(Integer var: countrycodes){
            System.out.println(var);
        }
    }
}
