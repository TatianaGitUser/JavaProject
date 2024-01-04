package Class30;
import java.util.Set;
import java.util.HashSet;
public class Class30_SetSizeMethod {
    public static void main(String[] args) {
        Set<Double> prices = new HashSet<>();
        prices.add(12.44);
        prices.add(5.22);
        prices.add(55.11);
        prices.add(234.01);
        prices.add(33.22);
        System.out.println(prices);
    System.out.println(prices.size());
    }
}
