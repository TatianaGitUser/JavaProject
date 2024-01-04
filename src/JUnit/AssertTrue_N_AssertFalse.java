//package JUnit;
//import java.util.List;
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//public class AssertTrue_N_AssertFalse {
//
//}
//class MainTest{
//    @Test
//    public void testTrue(){
//        assertTrue(true);//is always expecting true
//    }
//    @Test
//    public void testTrueFail(){
//        assertTrue(false);
//    }
//
//    @Test
//    public void testFalse(){
//        assertFalse(false); // it always expects False value
//    }
//    @Test
//    public void testFalseFail(){
//        assertFalse(true); // it always expects False value
//    }
//    @Test
//    public void testAvailableProduct(){
//        EcommerceService service = new EcommerceService();
//        service.addProduct("iphone14");
//
//        boolean result = service.isProductAvailable("iphone14");
//        assertTrue(result);
//    }
//    @Test
//    public void testAvailableProductAmongMultipleProducts(){
//        // every test has a pre-condition steps: create an object, add some items, call method
//        EcommerceService service = new EcommerceService();
//        service.addProduct("airpods Max");
//        service.addProduct("iPod");
//        service.addProduct("macbookPro");
//
//        boolean resultForAirPods = service.isProductAvailable("airpods Max");
//        boolean resultForIpod = service.isProductAvailable("iPod");
//        boolean resultForMacbook = service.isProductAvailable("macbookPro");
//
//// assertion steps are also called validating stepps
//        assertTrue(resultForAirPods, "Could not find Ipod");
//        assertTrue(resultForIpod, "Could not find airPod");
//        assertTrue(resultForMacbook, "Could not find macbookPro");
//    }
//}
//
//class EcommerceService{
//    private List<String> inventory = new ArrayList<>();
//
//    public void addProduct(String productId){
//        if(!productId.equals("macbookPro")){
//            inventory.add(productId);
//        }
//
//    }
//    public boolean isProductAvailable(String productId){
//        return inventory.contains(productId);
//    }
//@Test
//public void testNonExistentProduct(){
//        EcommerceService ecomObj= new EcommerceService();
//        ecomObj.addProduct("Iphone14");
//        ecomObj.addProduct("Samsung Galaxy S21");
//
//        assertFalse(ecomObj.isProductAvailable("Ipad Pro"));
//        }
//@Test
//public void testMisspelledProduct(){
//        EcommerceService ecomObj= new EcommerceService();
//        ecomObj.addProduct("Iphone14");
//        ecomObj.addProduct("Samsung Galaxy S21");
//
//        assertFalse(ecomObj.isProductAvailable("Iphone 14"));
//        }
//        }
//}

