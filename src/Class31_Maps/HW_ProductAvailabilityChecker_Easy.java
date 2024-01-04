package Class31_Maps;

import java.util.HashMap;
import java.util.Map;

public class HW_ProductAvailabilityChecker_Easy {
    public static void main(String[] args) {
        Map<String, Integer> productAvailability = new HashMap<>();
        productAvailability.put("Laptop", 5);
        productAvailability.put("Phone", 20);
        productAvailability.put("Tablet", 10);
        String product = "Phone";
        System.out.println(isProductAvailable(productAvailability, product));
    }
    public static int isProductAvailable(Map<String, Integer> productAvailability, String product){
        int result = 0;
        if(productAvailability.containsKey(product)){
            result = productAvailability.get(product);
        }return result;
    }
}
