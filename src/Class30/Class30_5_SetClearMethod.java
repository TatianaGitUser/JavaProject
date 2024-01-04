package Class30;

import java.util.HashSet;
import java.util.Set;

public class Class30_5_SetClearMethod {
    public static void main(String[] args) {
        Set<Double> prices = new HashSet<>();
        prices.add(12.44);
        prices.add(5.22);
        prices.add(55.11);
        prices.add(234.01);
        prices.add(33.22);
        System.out.println(prices);

        prices.clear();
        System.out.println(prices);

        if(prices.isEmpty()){
            System.out.println("it's empty");
        }
    }
}
