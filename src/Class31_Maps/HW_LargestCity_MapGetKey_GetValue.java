package Class31_Maps;
import java.util.*;

public class HW_LargestCity_MapGetKey_GetValue {
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("Chicago", 2697000);
        input.put("Los-Angeles", 3849000);
        input.put("Houston", 2288000);
        findLargestCity(input);

        Map<String, String> input1 = new HashMap<>();
        input1.put("Antidisestablishmentarianism",
                "Opposition to the disestablishment of the Church " +
                        "of England as the state church of England");
        input1.put("Bonjour","Hello in French");
        input1.put("Ciao","Hello in Italian");
        printDictionary(input1);
    }
    public static void findLargestCity(Map<String, Integer> input){
        Integer population = 0;
        String largestCity = "";
        for(Map.Entry<String, Integer> var : input.entrySet()){
            Integer maxVar = var.getValue();
            String city = var.getKey();
            if(maxVar>population){
                population = maxVar;
                largestCity = city;
            }
        }System.out.println("The city with the highest population is "+ largestCity + " with a population of " + population);
    }
    public static void printDictionary(Map<String, String> input1){
        for (Map.Entry<String, String> currentPair : input1.entrySet()){
            System.out.println(currentPair.getKey()+ " - " + currentPair.getValue());
        }
    }
}
