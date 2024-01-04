package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class Class31_9_PutAllMethod  {
    public static void main(String[] args) {
        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        Map <Integer, String> countrycodesWorld= new HashMap<>();
        countrycodesWorld.put(1, "United States");
        countrycodesWorld.put(86, "China");
        countrycodesWorld.put(82, "South Korea");
        countrycodesWorld.put(44, "England");// if the key already exists -> it won't be updated

        System.out.println(countrycodesWorld);
        System.out.println(countryCodesEU);

        countrycodesWorld.putAll(countryCodesEU);
        System.out.println(countrycodesWorld);
    }
}
