package Class31_Maps;
import java.util.*;
public class HW_CustomerOrderHistory_Hard {
    public static void main(String[] args) {
        Map<String, List<String>> orders = new HashMap<>();
        orders.put("Alice", Arrays.asList("Item A", "Item B"));
        orders.put("Bob", Arrays.asList("Item X"));
        List <String> newOrder = new ArrayList<>(Arrays.asList("Item C", "Item D"));
        String username = "Alice";
        System.out.println(recordOrder(orders, username, newOrder));
    }
    static String recordOrder(Map<String, List<String>> orders, String username, List<String> newOrder) {
        List<String> userOrders = new ArrayList<>();
        if (orders.containsKey(username)) {
            userOrders.addAll(orders.get(username));
        }
        userOrders.addAll(newOrder);
        return "Customer " + username + " has placed orders for " + userOrders;
    }
}
