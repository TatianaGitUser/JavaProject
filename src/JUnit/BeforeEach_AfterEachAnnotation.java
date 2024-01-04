//package JUnit;
//
//public class BeforeEach_AfterEachAnnotation {
//    import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class ShoppingCart {
//        private List<Item> items;
//
//        public ShoppingCart() {
//            items = new ArrayList<>();
//        }
//
//        public void addToCart(String itemName, double price) {
//            Item item = new Item(itemName, price);
//            items.add(item);
//        }
//
//        public void removeFromCart(String itemName) {
//            List<Item> updatedItems = new ArrayList<>();
//            for (Item item : items) {
//                if (!item.getName().equals(itemName)) {
//                    updatedItems.add(item);
//                }
//            }
//            items = updatedItems;
//        }
//
//        public int getCartSize() {
//            return items.size();
//        }
//
//        public double getTotalPrice() {
//            double total = 0;
//            for (Item item : items) {
//                total += item.getPrice();
//            }
//            return total;
//        }
//        public Item getItem(String itemName){
//
//            for(Item item : items){
//                if(item.getName().equalsIgnoreCase(itemName)){
//                    return item;
//                }
//            }
//            return null;
//        }
//
//        public void clearCart() {
//            items.clear();
//        }
//    }
//
//    class Item {
//        private String name;
//        private double price;
//
//        public Item(String name, double price) {
//            this.name = name;
//            this.price = price;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public double getPrice() {
//            return price;
//        }
//    }
////  class ShoppingCartTest {
//
////     private ShoppingCart shoppingCart;
//
////     @BeforeEach
////     void setUp() {
////         // Create a new shopping cart before each test
////         shoppingCart = new ShoppingCart();
////     }
//
////     @AfterEach
////     void tearDown() {
////         // Clear the shopping cart after each test
////         shoppingCart.clearCart();
////     }
//
////     @Test
////     void testAddToCart() {
////         // Test the addToCart method
////         shoppingCart.addToCart("Item 1", 20.0);
////         shoppingCart.addToCart("Item 2", 15.0);
//
////         assertEquals(2, shoppingCart.getCartSize());
////     }
//
////     @Test
////     void testRemoveFromCart() {
////         // Test the removeFromCart method
////         shoppingCart.addToCart("Item 1", 20.0);
////         shoppingCart.addToCart("Item 2", 15.0);
//
////         shoppingCart.removeFromCart("Item 1");
//
////         assertEquals(1, shoppingCart.getCartSize());
////     }
//
////     @Test
////     void testGetTotalPrice() {
////         // Test the getTotalPrice method
////         shoppingCart.addToCart("Item 1", 20.0);
////         shoppingCart.addToCart("Item 2", 15.0);
//
//    //         double totalPrice = shoppingCart.getTotalPrice();
////         assertEquals(35.0, totalPrice, 0.01);
////     }
//// }
//    class MainTest{
//        ShoppingCart shoppingCartObj;
//        // if every test case has exact same pre-conditional test set up steps -
//// ->you can use @BeforeEach annotation to avoid duplicate
//// @BeforeEach is going to run before every single test within 1 class
//        @BeforeEach
//        public void testSetup(){
//            shoppingCartObj = new ShoppingCart();
//        }
//        @Test
//        public void testAddToCart(){
//
//            shoppingCartObj.addToCart("Iphone14", 1000.00);
//            shoppingCartObj.addToCart("Ipad", 800.00);
//            Item item = shoppingCartObj.getItem("Iphone14");
//            Item item2 = shoppingCartObj.getItem("Ipad");
//            assertEquals(2, shoppingCartObj.getCartSize(), "Cart size mismatch after adding 2 items");
//            assertNotNull(item, "Iphone14 was not found");
//            assertNotNull(item2, "Ipad was not found");
//
//            assertEquals(1000.00, item.getPrice(), "Iphone 14 Price has changed unexpectedly");
//            assertEquals(800.00, item2.getPrice(), "Ipad Price has changed unexpectedly");
//
//        }
//        @Test
//        public void testAddToCartEmptyName(){
//
//            shoppingCartObj.addToCart("", 1000.00);
//            shoppingCartObj.addToCart("", 800.00);
//            Item item = shoppingCartObj.getItem("");
//            Item item2 = shoppingCartObj.getItem("");
//            assertEquals(0, shoppingCartObj.getCartSize(), "Cart size mismatch after adding 2 items");
//
//        }
//        @Test
//        public void testAddToCartEmptyName1(){
//
//            shoppingCartObj.addToCart("", 1000.00);
//            shoppingCartObj.addToCart("", 800.00);
//            Item item = shoppingCartObj.getItem("");
//            Item item2 = shoppingCartObj.getItem("");
//            assertEquals(0, shoppingCartObj.getCartSize(), "Cart size mismatch after adding 2 items");
//
//        }
//    }
//}
