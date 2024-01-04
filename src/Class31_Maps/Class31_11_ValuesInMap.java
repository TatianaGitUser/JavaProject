package Class31_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Class31_11_ValuesInMap {
    public static void main(String[] args) {

        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");
//        Collection method <Data type of Values in a Map(String i this case))
//        ^>collection interface
       Collection<String> values =countryCodesEU.values();
System.out.println(values);

for(String var : values){
    System.out.println(var);
}
    }
}
